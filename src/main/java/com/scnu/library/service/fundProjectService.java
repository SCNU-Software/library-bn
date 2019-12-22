package com.scnu.library.service;

import com.scnu.library.model.requestModel.alterFundProjectReq;
import com.scnu.library.model.requestModel.deleteFundProjectReq;
import com.scnu.library.model.requestModel.getFundProjectReq;
import com.scnu.library.model.responseModel.getFundProjectRes;

import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 12:29
 */

public interface fundProjectService {
    // 获取基金项目
    Map<String, Object> getFundProject(getFundProjectReq requestModel);
    // 根据no修改一个基金项目
    getFundProjectRes alterFundProject(alterFundProjectReq requestModel);
    // 添加一个基金项目
    boolean addFundProject(alterFundProjectReq requestModel);
    // 删除一个基金项目
    boolean deleteFundProject(deleteFundProjectReq requestModel);
}
