package com.scnu.library.tools.exceptionHandler;

import com.alibaba.excel.exception.ExcelDataConvertException;
import com.scnu.library.model.resultModel;
import com.scnu.library.tools.enums.responseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Fisher
 * @Description 全局异常拦截器
 */
@Slf4j
@ControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public resultModel exceptionHandler(Exception ex, HttpServletResponse response) throws Exception {
        resultModel res = new resultModel();
        if (ex instanceof IOException) {
            IOException exception = (IOException) ex;
            log.error("IO Exception 错误消息：" + exception.getMessage());
            res.setCode(responseEnum.IO_ERR);
            res.setMsg(responseEnum.IO_ERR_MSG);
        } else if (ex instanceof ExcelDataConvertException) {
            ExcelDataConvertException exception = (ExcelDataConvertException) ex;
            log.error("Excel Data Convert 错误消息：" + exception.getMessage());
            res.setCode(responseEnum.EXCEL_ERR);
            res.setMsg(responseEnum.EXCEL_ERR_MSG);
        } else if (ex instanceof MaxUploadSizeExceededException) {
            MaxUploadSizeExceededException exception = (MaxUploadSizeExceededException) ex;
            log.error("Max Upload Size Exceeded 错误消息：" + exception.getMessage());
            res.setCode(responseEnum.UPLOAD_ERR);
            res.setMsg(responseEnum.UPLOAD_ERR_MSG);
        } else if (ex instanceof RuntimeException) {
            RuntimeException exception = (RuntimeException) ex;
            log.error("Runtime 错误消息：" + exception.getMessage());
            res.setCode(responseEnum.RUNTIME_ERR);
            res.setMsg(responseEnum.RUNTIME_ERR_MSG);
        } else {
            log.error("异常类型：" + ex.getClass() + " | 其他未记录在全局异常拦截器中的错误消息：" + ex.getMessage());
            res.setCode(responseEnum.OTHER_ERR);
            res.setMsg(responseEnum.OTHER_ERR_MSG);
        }
        return res;
    }
}
