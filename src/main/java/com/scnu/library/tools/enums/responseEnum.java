package com.scnu.library.tools.enums;

/**
 * @Author: Fisher
 * @Date: 2019/11/23 11:47 上午
 * @Description: 请求返回参数配置
 */

public class responseEnum {

    // 成功消息
    public static final String OK = "200";
    public static final String OK_MSG = "操作成功";

    // 失败消息
    public static final String ERR = "400";
    public static final String ERR_MSG = "操作失败";

    // IO Exception 错误消息
    public static final String IO_ERR = "401";
    public static final String IO_ERR_MSG = "服务器内部IO错误";

    // ExcelDataConvertException Excel导入导出错误
    public static final String EXCEL_ERR = "402";
    public static final String EXCEL_ERR_MSG = "Excel导入导出错误";

    // MaxUploadSizeExceededException 超过最大上传大小限制错误
    public static final String UPLOAD_ERR = "403";
    public static final String UPLOAD_ERR_MSG = "超过最大上传限制";

    // Runtime Exception 业务处理错误
    public static final String RUNTIME_ERR = "404";
    public static final String RUNTIME_ERR_MSG = "业务处理错误";

    // 其他未处理的异常
    public static final String OTHER_ERR = "405";
    public static final String OTHER_ERR_MSG = "其他服务器内部错误";

}
