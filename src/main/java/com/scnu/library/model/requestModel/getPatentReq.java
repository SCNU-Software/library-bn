package com.scnu.library.model.requestModel;

import com.scnu.library.tools.enums.requestEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 10:12
 */

@Data
public class getPatentReq {
    // 专利国别
    private String patent_country;
    // 专利类型
    private String patent_type;
    // 名称
    private String name;
    // 公开日
    private Date publish_date;
    // 申请日
    private Date application_date;
    // 主分类号
    private String main_category;
    // 申请人
    private String applicant;
    // 发明人
    private String inventor;
    // 法律状态
    private String legal_status;
    // 专利状态
    private String patent_status;
    // 二级机构
    private String secondary_institution;
    // 分页
    private int pageNo = requestEnum.PAGE_NO;
    private int pageSize = requestEnum.PAGE_SIZE;
}
