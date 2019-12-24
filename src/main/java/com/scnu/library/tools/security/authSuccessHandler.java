package com.scnu.library.tools.security;

import com.alibaba.fastjson.JSON;
import com.scnu.library.model.resultModel;
import com.scnu.library.tools.enums.responseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 23:39
 * @Description: 登陆成功后返回成功信息
 */

@Component
public class authSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        resultModel res = new resultModel(responseEnum.OK, responseEnum.OK_MSG);
        httpServletResponse.setContentType("application/json;charset=utf-8");
        Writer writer = httpServletResponse.getWriter();
        writer.write(JSON.toJSONString(res));
    }
}
