package com.scnu.library.tools.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 23:39
 * @Description: 登陆成功后重定向到指定页面
 */

@Component
public class authSuccessHandler implements AuthenticationSuccessHandler {

    @Value("${loginSuccessURL}")
    private String successURL;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.sendRedirect(successURL);
    }
}
