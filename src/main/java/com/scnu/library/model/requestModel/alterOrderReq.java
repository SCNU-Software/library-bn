package com.scnu.library.model.requestModel;

import lombok.Data;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:15
 */
@Data
public class alterOrderReq {
    private Integer orderId;
    private Integer status;
}
