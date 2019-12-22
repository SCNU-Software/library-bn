package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 10:29
 */

@Data
public class deletePatentReq {
    @NotNull
    private Integer no;
}
