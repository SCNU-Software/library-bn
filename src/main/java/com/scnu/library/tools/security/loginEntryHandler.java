package com.scnu.library.tools.security;

import com.alibaba.fastjson.JSON;
import com.scnu.library.model.resultModel;
import com.scnu.library.tools.enums.responseEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fisher
 * @Date: 2019/12/23 13:03
 * @Description: 用户未登陆或登陆过期时，自动跳转到登陆页面
 */

@Component
public class loginEntryHandler implements AuthenticationEntryPoint {

    @Value("${loginEntryURL}")
    private String loginEntryURL;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.sendRedirect(loginEntryURL);
//        resultModel res = new resultModel(responseEnum.NO_LOGIN_ERR, responseEnum.NO_LOGIN_ERR_MSG);
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        Writer writer = httpServletResponse.getWriter();
//        writer.write(JSON.toJSONString(res));
    }
}
