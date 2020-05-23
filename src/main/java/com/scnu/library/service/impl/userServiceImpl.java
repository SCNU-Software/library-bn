package com.scnu.library.service.impl;

import com.scnu.library.mapper.userMainMapper;
import com.scnu.library.model.dbModel.userMain;
import com.scnu.library.model.requestModel.addUserReq;
import com.scnu.library.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

/**
 * @Author: Fisher
 * @Date: 2020/5/23 15:48
 */
@Repository
@Slf4j
public class userServiceImpl implements userService {

    @Autowired
    private userMainMapper userMapper;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public userMain getUserByName(String name) {
        userMain user = userMapper.selectByPrimaryKey(name);
        return user;
    }

    @Override
    public boolean addUser(addUserReq req) {
        log.info("userName: " + req.getUserName() + " userPassword: " + req.getUserPassword());
        userMain user = userMapper.selectByPrimaryKey(req.getUserName());
        if (user != null) {
            throw new RuntimeException("用户名已存在！");
        } else {
            user = new userMain();
            user.setUserName(req.getUserName());
            user.setUserPassword(encoder.encode(req.getUserPassword()));
            userMapper.insertSelective(user);
            return true;
        }
    }
}
