package com.scnu.library.model.responseModel;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 12:50
 *
 * @Edit JabinGP@2019-11-25: 修改属性名错误，pub_time -> pubTime
 */

@Data
public class getBookDesRes {
    @NotNull
    private int id;
    private String title;
    private String author;
    private String brief;
    private int price;
    private String press;
    private Date pubTime;
}
