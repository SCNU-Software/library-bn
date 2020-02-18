package com.scnu.library.model.requestModel;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishDate;

    private String applicationNo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
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
