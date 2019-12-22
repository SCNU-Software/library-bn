package com.scnu.library.service;

import com.scnu.library.model.requestModel.alterPatentReq;
import com.scnu.library.model.requestModel.deletePatentReq;
import com.scnu.library.model.requestModel.getPatentReq;
import com.scnu.library.model.responseModel.getPatentRes;

import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 10:23
 */

public interface patentService {
    // 获取专利信息
    Map<String, Object> getPatent(getPatentReq requestModel);
    // 增加一条专利信息
    boolean addPatent(alterPatentReq requestModel);
    // 根据编号删除一条专利信息
    boolean deletePatent(deletePatentReq requestModel);
    // 根据编号修改一条专利信息
    getPatentRes alterPatent(alterPatentReq requestModel);
}
