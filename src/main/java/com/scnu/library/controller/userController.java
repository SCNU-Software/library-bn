package com.scnu.library.controller;

import com.scnu.library.model.requestModel.addUserReq;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.userService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Fisher
 * @Date: 2020/5/23 16:13
 */
@Api(value = "User Controller")
@RestController
@RequestMapping(value = "/api/user")
@Slf4j
public class userController {

    @Autowired
    private userService userService;

    @ApiOperation(value = "注册用户", notes = "userName为用户名，userPassword为用户密码")
    @PostMapping("/register")
    @ResponseBody
    public resultModel addUser(@RequestBody addUserReq req) {
        resultModel res = new resultModel();
        if (userService.addUser(req)) {
            res.setOk();
            return res;
        } else {
            res.setFail();
            return res;
        }
    }
}
