package com.scnu.library.model.requestModel;

import com.scnu.library.tools.enums.requestEnum;
import lombok.Data;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:12
 */
@Data
public class getOrderReq {
    private String userName;
    private int pageNo = requestEnum.PAGE_NO;
    private int pageSize = requestEnum.PAGE_SIZE;
}
