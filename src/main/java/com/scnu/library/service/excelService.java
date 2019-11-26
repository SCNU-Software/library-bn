package com.scnu.library.service;

import com.scnu.library.model.excelMode.bookExcelModel;
import com.scnu.library.model.requestModel.exportExcelReq;
import com.scnu.library.model.requestModel.importExcelReq;
import com.scnu.library.model.responseModel.exportExcelRes;
import com.scnu.library.model.resultModel;

import java.util.List;

/**
 * @Author JabinGP
 * @Date 2019-11-26 10:10
 */

public interface excelService {
    // 通过excel导入
    void importExcel(String fileName) throws Exception;

    // 导出为excel，接收限制条件，返回下载链接
    String exportExcel(exportExcelReq req) throws Exception;
}
