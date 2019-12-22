package com.scnu.library.service;

import com.scnu.library.model.requestModel.alterBookDesReq;
import com.scnu.library.model.requestModel.deleteBookDesReq;
import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.responseModel.getBookDesRes;

import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 12:39
 *
 * @Edit: Fisher@2019-12-22: 增加修改书本信息，添加单条书本信息，删除书本信息接口
 */

public interface bookDesService {
    // 获取书本信息
    Map<String,Object> getBookDes(getBookDesReq requestModel);
    // 增加一条书本信息
    boolean addBookDes(alterBookDesReq requestModel);
    // 修改一条书本信息
    getBookDesRes alterBookDes(alterBookDesReq requestModel);
    // 删除一条书本信息
    boolean deleteBookDes(deleteBookDesReq requestModel);
}
