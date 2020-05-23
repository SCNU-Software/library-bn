package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Fisher
 * @Date: 2020/5/23 16:02
 */
@Data
public class addUserReq {
    @NotNull
    private String userName;
    @NotNull
    private String userPassword;
}
