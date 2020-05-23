package com.scnu.library.model.responseModel;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:23
 */
@Data
public class getOrderRes {
    @NotNull
    private Integer orderId;
    private String userName;
    private String bookTitle;
    private Integer price;
    private String address;
    private String phone;
    private String card;
    private Integer status;
}
