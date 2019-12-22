package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 15:49
 */

@Data
public class deleteBookDesReq {
    @NotNull
    private int id;
}
