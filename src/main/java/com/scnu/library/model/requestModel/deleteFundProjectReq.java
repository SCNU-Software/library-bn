package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 12:36
 */

@Data
public class deleteFundProjectReq {
    @NotNull
    private String no;
}
