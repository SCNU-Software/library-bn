package com.scnu.library.service;

import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.model.resultModel;

import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 12:39
 */

public interface bookDesService {
    // 获取书本信息
    Map<String,Object> getBookDes(getBookDesReq requestModel);
}
