package com.scnu.library.service;

import com.scnu.library.model.dbModel.userMain;
import com.scnu.library.model.requestModel.addUserReq;

/**
 * @Author: Fisher
 * @Date: 2020/5/23 15:44
 */
public interface userService {
    // 通过用户名获取用户信息
    userMain getUserByName(String name);
    // 注册用户
    boolean addUser(addUserReq req);
}
