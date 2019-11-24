package com.scnu.library.model.requestModel;

import com.scnu.library.tools.enums.requestEnum;
import lombok.Data;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 12:41
 */

@Data
public class getBookDesReq {
    private String title;
    private String author;
    private int pageNo = requestEnum.PAGE_NO;
    private int pageSize = requestEnum.PAGE_SIZE;
}
