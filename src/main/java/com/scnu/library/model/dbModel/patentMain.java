package com.scnu.library.model.dbModel;

import java.io.Serializable;
import java.util.Date;

public class patentMain implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getPatentCountry() {
        return patentCountry;
    }

    public void setPatentCountry(String patentCountry) {
        this.patentCountry = patentCountry;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishNo() {
        return publishNo;
    }

    public void setPublishNo(String publishNo) {
        this.publishNo = publishNo;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatentAgency() {
        return patentAgency;
    }

    public void setPatentAgency(String patentAgency) {
        this.patentAgency = patentAgency;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getPatentStatus() {
        return patentStatus;
    }

    public void setPatentStatus(String patentStatus) {
        this.patentStatus = patentStatus;
    }

    public String getSecondaryInstitution() {
        return secondaryInstitution;
    }

    public void setSecondaryInstitution(String secondaryInstitution) {
        this.secondaryInstitution = secondaryInstitution;
    }
}