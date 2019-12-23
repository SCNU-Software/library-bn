package com.scnu.library.tools.security;

import com.alibaba.fastjson.JSON;
import com.scnu.library.model.resultModel;
import com.scnu.library.tools.enums.responseEnum;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fisher
 * @Date: 2019/12/23 00:01
 * @Description: 登陆失败后返回JSON格式数据，通知失败原因
 */

@Component
public class authFailHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        // 新建返回对象
        resultModel res = new resultModel(responseEnum.LOGIN_ERR, responseEnum.LOGIN_ERR_MSG);
        // 返回JSON格式的对象
        httpServletResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        Writer writer = httpServletResponse.getWriter();
        writer.write(JSON.toJSONString(res));
    }
}
