package com.scnu.library.tools.exceptionHandler;

import com.scnu.library.model.resultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author Fisher
 * @Description 全局异常拦截器
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Exception exceptionHandler(Exception ex, HttpServletResponse response) throws Exception {

        return ex;
    }
}
