package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 10:28
 */

@Data
public class alterPatentReq {
    @NotNull
    private Integer no;

    private String patentCountry;

    private String patentType;

    private String name;

    private String publishNo;

    private Date publishDate;

    private String applicationNo;

    private Date applicationDate;

    private String mainCategory;

    private String subCategory;

    private String applicant;

    private String inventor;

    private String countryCode;

    private String address;

    private String patentAgency;

    private String agent;

    private String legalStatus;

    private String patentStatus;

    private String secondaryInstitution;
}
