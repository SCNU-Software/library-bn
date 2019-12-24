package com.scnu.library.service;

import com.scnu.library.model.requestModel.exportExcelReq;
import com.scnu.library.model.requestModel.getFundProjectReq;
import com.scnu.library.model.requestModel.getPatentReq;

/**
 * @Author JabinGP
 * @Date 2019-11-26 10:10
 */

public interface excelService {
    // 通过excel导入
    void importExcel(String fileName) throws Exception;
    // 导出为excel，接收限制条件，返回下载链接
    String exportExcel(exportExcelReq req) throws Exception;
    // 通过excel导入基金项目
    void addFundProjectExcel(String fileName);
    // 获取基金项目并生成一个excel文件，返回存储的相对路径
    String getFundProjectExcel(getFundProjectReq requestModel);
    // 获取专利信息并生成一个excel文件，返回存储的相对路径
    void addPatentExcel(String fileName);
    // 获取专利信息并生成一个excel文件，返回存储的相对路径
    String getPatentExcel(getPatentReq requestModel);
}
