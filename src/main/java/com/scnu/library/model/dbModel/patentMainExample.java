package com.scnu.library.model.dbModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class patentMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public patentMainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andPatentCountryIsNull() {
            addCriterion("patent_country is null");
            return (Criteria) this;
        }

        public Criteria andPatentCountryIsNotNull() {
            addCriterion("patent_country is not null");
            return (Criteria) this;
        }

        public Criteria andPatentCountryEqualTo(String value) {
            addCriterion("patent_country =", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryNotEqualTo(String value) {
            addCriterion("patent_country <>", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryGreaterThan(String value) {
            addCriterion("patent_country >", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryGreaterThanOrEqualTo(String value) {
            addCriterion("patent_country >=", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryLessThan(String value) {
            addCriterion("patent_country <", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryLessThanOrEqualTo(String value) {
            addCriterion("patent_country <=", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryLike(String value) {
            addCriterion("patent_country like", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryNotLike(String value) {
            addCriterion("patent_country not like", value, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryIn(List<String> values) {
            addCriterion("patent_country in", values, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryNotIn(List<String> values) {
            addCriterion("patent_country not in", values, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryBetween(String value1, String value2) {
            addCriterion("patent_country between", value1, value2, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentCountryNotBetween(String value1, String value2) {
            addCriterion("patent_country not between", value1, value2, "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNull() {
            addCriterion("patent_type is null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNotNull() {
            addCriterion("patent_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeEqualTo(String value) {
            addCriterion("patent_type =", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotEqualTo(String value) {
            addCriterion("patent_type <>", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThan(String value) {
            addCriterion("patent_type >", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patent_type >=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThan(String value) {
            addCriterion("patent_type <", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThanOrEqualTo(String value) {
            addCriterion("patent_type <=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLike(String value) {
            addCriterion("patent_type like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotLike(String value) {
            addCriterion("patent_type not like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIn(List<String> values) {
            addCriterion("patent_type in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotIn(List<String> values) {
            addCriterion("patent_type not in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeBetween(String value1, String value2) {
            addCriterion("patent_type between", value1, value2, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotBetween(String value1, String value2) {
            addCriterion("patent_type not between", value1, value2, "patentType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPublishNoIsNull() {
            addCriterion("publish_no is null");
            return (Criteria) this;
        }

        public Criteria andPublishNoIsNotNull() {
            addCriterion("publish_no is not null");
            return (Criteria) this;
        }

        public Criteria andPublishNoEqualTo(String value) {
            addCriterion("publish_no =", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotEqualTo(String value) {
            addCriterion("publish_no <>", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoGreaterThan(String value) {
            addCriterion("publish_no >", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoGreaterThanOrEqualTo(String value) {
            addCriterion("publish_no >=", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLessThan(String value) {
            addCriterion("publish_no <", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLessThanOrEqualTo(String value) {
            addCriterion("publish_no <=", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLike(String value) {
            addCriterion("publish_no like", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotLike(String value) {
            addCriterion("publish_no not like", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoIn(List<String> values) {
            addCriterion("publish_no in", values, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotIn(List<String> values) {
            addCriterion("publish_no not in", values, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoBetween(String value1, String value2) {
            addCriterion("publish_no between", value1, value2, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotBetween(String value1, String value2) {
            addCriterion("publish_no not between", value1, value2, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNull() {
            addCriterion("application_no is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNotNull() {
            addCriterion("application_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoEqualTo(String value) {
            addCriterion("application_no =", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotEqualTo(String value) {
            addCriterion("application_no <>", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThan(String value) {
            addCriterion("application_no >", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("application_no >=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThan(String value) {
            addCriterion("application_no <", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThanOrEqualTo(String value) {
            addCriterion("application_no <=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLike(String value) {
            addCriterion("application_no like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotLike(String value) {
            addCriterion("application_no not like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIn(List<String> values) {
            addCriterion("application_no in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotIn(List<String> values) {
            addCriterion("application_no not in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoBetween(String value1, String value2) {
            addCriterion("application_no between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotBetween(String value1, String value2) {
            addCriterion("application_no not between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNull() {
            addCriterion("application_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNotNull() {
            addCriterion("application_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateEqualTo(Date value) {
            addCriterionForJDBCDate("application_date =", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("application_date <>", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("application_date >", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("application_date >=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThan(Date value) {
            addCriterionForJDBCDate("application_date <", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("application_date <=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIn(List<Date> values) {
            addCriterionForJDBCDate("application_date in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("application_date not in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("application_date between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("application_date not between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNull() {
            addCriterion("main_category is null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNotNull() {
            addCriterion("main_category is not null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryEqualTo(String value) {
            addCriterion("main_category =", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotEqualTo(String value) {
            addCriterion("main_category <>", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThan(String value) {
            addCriterion("main_category >", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("main_category >=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThan(String value) {
            addCriterion("main_category <", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThanOrEqualTo(String value) {
            addCriterion("main_category <=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLike(String value) {
            addCriterion("main_category like", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotLike(String value) {
            addCriterion("main_category not like", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIn(List<String> values) {
            addCriterion("main_category in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotIn(List<String> values) {
            addCriterion("main_category not in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryBetween(String value1, String value2) {
            addCriterion("main_category between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotBetween(String value1, String value2) {
            addCriterion("main_category not between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIsNull() {
            addCriterion("sub_category is null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIsNotNull() {
            addCriterion("sub_category is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryEqualTo(String value) {
            addCriterion("sub_category =", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNotEqualTo(String value) {
            addCriterion("sub_category <>", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryGreaterThan(String value) {
            addCriterion("sub_category >", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("sub_category >=", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryLessThan(String value) {
            addCriterion("sub_category <", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryLessThanOrEqualTo(String value) {
            addCriterion("sub_category <=", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryLike(String value) {
            addCriterion("sub_category like", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNotLike(String value) {
            addCriterion("sub_category not like", value, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIn(List<String> values) {
            addCriterion("sub_category in", values, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNotIn(List<String> values) {
            addCriterion("sub_category not in", values, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryBetween(String value1, String value2) {
            addCriterion("sub_category between", value1, value2, "subCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNotBetween(String value1, String value2) {
            addCriterion("sub_category not between", value1, value2, "subCategory");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andInventorIsNull() {
            addCriterion("inventor is null");
            return (Criteria) this;
        }

        public Criteria andInventorIsNotNull() {
            addCriterion("inventor is not null");
            return (Criteria) this;
        }

        public Criteria andInventorEqualTo(String value) {
            addCriterion("inventor =", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotEqualTo(String value) {
            addCriterion("inventor <>", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThan(String value) {
            addCriterion("inventor >", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThanOrEqualTo(String value) {
            addCriterion("inventor >=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThan(String value) {
            addCriterion("inventor <", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThanOrEqualTo(String value) {
            addCriterion("inventor <=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLike(String value) {
            addCriterion("inventor like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotLike(String value) {
            addCriterion("inventor not like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorIn(List<String> values) {
            addCriterion("inventor in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotIn(List<String> values) {
            addCriterion("inventor not in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorBetween(String value1, String value2) {
            addCriterion("inventor between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotBetween(String value1, String value2) {
            addCriterion("inventor not between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyIsNull() {
            addCriterion("patent_agency is null");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyIsNotNull() {
            addCriterion("patent_agency is not null");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyEqualTo(String value) {
            addCriterion("patent_agency =", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyNotEqualTo(String value) {
            addCriterion("patent_agency <>", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyGreaterThan(String value) {
            addCriterion("patent_agency >", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("patent_agency >=", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyLessThan(String value) {
            addCriterion("patent_agency <", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyLessThanOrEqualTo(String value) {
            addCriterion("patent_agency <=", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyLike(String value) {
            addCriterion("patent_agency like", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyNotLike(String value) {
            addCriterion("patent_agency not like", value, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyIn(List<String> values) {
            addCriterion("patent_agency in", values, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyNotIn(List<String> values) {
            addCriterion("patent_agency not in", values, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyBetween(String value1, String value2) {
            addCriterion("patent_agency between", value1, value2, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyNotBetween(String value1, String value2) {
            addCriterion("patent_agency not between", value1, value2, "patentAgency");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIsNull() {
            addCriterion("legal_status is null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIsNotNull() {
            addCriterion("legal_status is not null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusEqualTo(String value) {
            addCriterion("legal_status =", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotEqualTo(String value) {
            addCriterion("legal_status <>", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusGreaterThan(String value) {
            addCriterion("legal_status >", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("legal_status >=", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLessThan(String value) {
            addCriterion("legal_status <", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLessThanOrEqualTo(String value) {
            addCriterion("legal_status <=", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLike(String value) {
            addCriterion("legal_status like", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotLike(String value) {
            addCriterion("legal_status not like", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIn(List<String> values) {
            addCriterion("legal_status in", values, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotIn(List<String> values) {
            addCriterion("legal_status not in", values, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusBetween(String value1, String value2) {
            addCriterion("legal_status between", value1, value2, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotBetween(String value1, String value2) {
            addCriterion("legal_status not between", value1, value2, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusIsNull() {
            addCriterion("patent_status is null");
            return (Criteria) this;
        }

        public Criteria andPatentStatusIsNotNull() {
            addCriterion("patent_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatentStatusEqualTo(String value) {
            addCriterion("patent_status =", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusNotEqualTo(String value) {
            addCriterion("patent_status <>", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusGreaterThan(String value) {
            addCriterion("patent_status >", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("patent_status >=", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusLessThan(String value) {
            addCriterion("patent_status <", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusLessThanOrEqualTo(String value) {
            addCriterion("patent_status <=", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusLike(String value) {
            addCriterion("patent_status like", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusNotLike(String value) {
            addCriterion("patent_status not like", value, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusIn(List<String> values) {
            addCriterion("patent_status in", values, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusNotIn(List<String> values) {
            addCriterion("patent_status not in", values, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusBetween(String value1, String value2) {
            addCriterion("patent_status between", value1, value2, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusNotBetween(String value1, String value2) {
            addCriterion("patent_status not between", value1, value2, "patentStatus");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionIsNull() {
            addCriterion("secondary_institution is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionIsNotNull() {
            addCriterion("secondary_institution is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionEqualTo(String value) {
            addCriterion("secondary_institution =", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionNotEqualTo(String value) {
            addCriterion("secondary_institution <>", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionGreaterThan(String value) {
            addCriterion("secondary_institution >", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("secondary_institution >=", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionLessThan(String value) {
            addCriterion("secondary_institution <", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionLessThanOrEqualTo(String value) {
            addCriterion("secondary_institution <=", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionLike(String value) {
            addCriterion("secondary_institution like", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionNotLike(String value) {
            addCriterion("secondary_institution not like", value, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionIn(List<String> values) {
            addCriterion("secondary_institution in", values, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionNotIn(List<String> values) {
            addCriterion("secondary_institution not in", values, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionBetween(String value1, String value2) {
            addCriterion("secondary_institution between", value1, value2, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionNotBetween(String value1, String value2) {
            addCriterion("secondary_institution not between", value1, value2, "secondaryInstitution");
            return (Criteria) this;
        }

        public Criteria andPatentCountryLikeInsensitive(String value) {
            addCriterion("upper(patent_country) like", value.toUpperCase(), "patentCountry");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLikeInsensitive(String value) {
            addCriterion("upper(patent_type) like", value.toUpperCase(), "patentType");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPublishNoLikeInsensitive(String value) {
            addCriterion("upper(publish_no) like", value.toUpperCase(), "publishNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLikeInsensitive(String value) {
            addCriterion("upper(application_no) like", value.toUpperCase(), "applicationNo");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLikeInsensitive(String value) {
            addCriterion("upper(main_category) like", value.toUpperCase(), "mainCategory");
            return (Criteria) this;
        }

        public Criteria andSubCategoryLikeInsensitive(String value) {
            addCriterion("upper(sub_category) like", value.toUpperCase(), "subCategory");
            return (Criteria) this;
        }

        public Criteria andApplicantLikeInsensitive(String value) {
            addCriterion("upper(applicant) like", value.toUpperCase(), "applicant");
            return (Criteria) this;
        }

        public Criteria andInventorLikeInsensitive(String value) {
            addCriterion("upper(inventor) like", value.toUpperCase(), "inventor");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLikeInsensitive(String value) {
            addCriterion("upper(country_code) like", value.toUpperCase(), "countryCode");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andPatentAgencyLikeInsensitive(String value) {
            addCriterion("upper(patent_agency) like", value.toUpperCase(), "patentAgency");
            return (Criteria) this;
        }

        public Criteria andAgentLikeInsensitive(String value) {
            addCriterion("upper(agent) like", value.toUpperCase(), "agent");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLikeInsensitive(String value) {
            addCriterion("upper(legal_status) like", value.toUpperCase(), "legalStatus");
            return (Criteria) this;
        }

        public Criteria andPatentStatusLikeInsensitive(String value) {
            addCriterion("upper(patent_status) like", value.toUpperCase(), "patentStatus");
            return (Criteria) this;
        }

        public Criteria andSecondaryInstitutionLikeInsensitive(String value) {
            addCriterion("upper(secondary_institution) like", value.toUpperCase(), "secondaryInstitution");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}