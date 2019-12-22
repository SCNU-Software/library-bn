package com.scnu.library.model.requestModel;

import com.scnu.library.tools.enums.requestEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 12:15
 */

@Data
public class getFundProjectReq {
    private String no;
    private String project_category;
    private String subject_category;
    private String name;
    private Date project_date;
    private String principal;
    private String main_employer;
    private String sub_employer;
    private String fund_level;
    // 分页
    private int pageNo = requestEnum.PAGE_NO;
    private int pageSize = requestEnum.PAGE_SIZE;
}
