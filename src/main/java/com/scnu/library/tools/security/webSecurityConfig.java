package com.scnu.library.tools.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 23:08
 * @Description: Spring Security配置
 */

@Configuration
public class webSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${loginProcessURL}")
    private String loginProcessURL;

    @Value("${registerURL}")
    private String registerURL;

    @Autowired
    private userDetailService userDetailService;

    @Autowired
    private authFailHandler authFailHandler;

    @Autowired
    private authSuccessHandler authSuccessHandler;

    @Autowired
    private loginEntryHandler loginEntryHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()    // 启用表单登陆
            .loginProcessingUrl(loginProcessURL)    // 登陆接口地址
            .successHandler(authSuccessHandler)     // 登陆成功处理
            .failureHandler(authFailHandler)        // 登陆失败处理
            .and()
            .exceptionHandling()
            .authenticationEntryPoint(loginEntryHandler)    // 检测到请求不带登陆Session后跳转到登陆页面
            .and()
            .authorizeRequests()    // 对请求授权
            .antMatchers(loginProcessURL, registerURL).permitAll()    // 不需要授权的白名单
            .antMatchers("/swagger-ui.html", "/webjars/**", "/swagger-resources/**", "/v2/*", "/csrf").permitAll()  // Swagger-ui白名单
            .anyRequest().authenticated()   // 所有不在白名单中的请求都需要登陆验证
            .and()
            .csrf().disable().cors();  // 关闭CSRF跨站检测，使用CORS解决跨域问题
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 登录服务Handler，设定密码加密规则
        auth.userDetailsService(userDetailService).passwordEncoder(new BCryptPasswordEncoder());
    }

}
