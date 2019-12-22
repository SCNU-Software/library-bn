package com.scnu.library.model.requestModel;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 12:35
 */

@Data
public class alterFundProjectReq {
    @NotNull
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
