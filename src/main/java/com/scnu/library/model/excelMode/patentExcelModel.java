package com.scnu.library.model.excelMode;

import lombok.Data;

import java.util.Date;

/**
 * @Author: JabinGP
 */

@Data
public class patentExcelModel{
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
