package com.scnu.library.model.requestModel;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 15:49
 */

@Data
public class alterBookDesReq {
    private int id;
    private String title;
    private String author;
    private Integer price;
    private String press;
    private Date pubTime;
    private String brief;
}
