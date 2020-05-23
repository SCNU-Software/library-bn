package com.scnu.library.model.requestModel;

import lombok.Data;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:20
 */
@Data
public class addOrderReq {
    private String userName;
    private String bookTitle;
    private Integer price;
    private String address;
    private String phone;
    private String card;
}
