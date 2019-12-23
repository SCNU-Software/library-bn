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

    @Value("${loginEntryURL}")
    private String loginEntryURL;

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
            .antMatchers(loginEntryURL, loginProcessURL).permitAll()    // 不需要授权的白名单
            .anyRequest().authenticated()   // 所有不在白名单中的请求都需要登陆验证
            .and()
            .csrf().disable();  // 关闭CSRF跨站检测
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 用户、密码、用户角色(权限)
        auth.inMemoryAuthentication()
                .withUser("user1").password(new BCryptPasswordEncoder().encode("psw1")).roles("USER")
                .and()
                .withUser("user2").password(new BCryptPasswordEncoder().encode("psw2")).roles("ADMIN","USER")
                .and()
                .passwordEncoder(new BCryptPasswordEncoder());
    }

}
