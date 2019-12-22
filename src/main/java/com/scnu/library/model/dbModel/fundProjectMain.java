package com.scnu.library.model.dbModel;

import java.io.Serializable;
import java.util.Date;

public class fundProjectMain implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public String getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(String subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMainEmployer() {
        return mainEmployer;
    }

    public void setMainEmployer(String mainEmployer) {
        this.mainEmployer = mainEmployer;
    }

    public String getSubEmployer() {
        return subEmployer;
    }

    public void setSubEmployer(String subEmployer) {
        this.subEmployer = subEmployer;
    }

    public String getFundLevel() {
        return fundLevel;
    }

    public void setFundLevel(String fundLevel) {
        this.fundLevel = fundLevel;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getOwningSystem() {
        return owningSystem;
    }

    public void setOwningSystem(String owningSystem) {
        this.owningSystem = owningSystem;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getResultLevel() {
        return resultLevel;
    }

    public void setResultLevel(String resultLevel) {
        this.resultLevel = resultLevel;
    }
}