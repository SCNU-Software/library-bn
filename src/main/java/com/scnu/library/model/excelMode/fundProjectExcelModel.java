package com.scnu.library.model.excelMode;

import lombok.Data;

import java.util.Date;

/**
 * @Author: JabinGP
 */

@Data
public class fundProjectExcelModel{
    private String no;
    private String projectCategory;
    private String subjectCategory;
    private String name;
    private Date projectDate;
    private String principal;
    private String jobTitle;
    private String mainEmployer;
    private String subEmployer;
    private String fundLevel;
    private Float amount;
    private String faculty;
    private String subjectNo;
    private Date execTime;
    private String owningSystem;
    private String resultName;
    private String resultType;
    private String resultLevel;
}
