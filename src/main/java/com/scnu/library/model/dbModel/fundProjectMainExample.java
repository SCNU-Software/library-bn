package com.scnu.library.model.dbModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class fundProjectMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public fundProjectMainExample() {
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

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIsNull() {
            addCriterion("project_category is null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIsNotNull() {
            addCriterion("project_category is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryEqualTo(String value) {
            addCriterion("project_category =", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryNotEqualTo(String value) {
            addCriterion("project_category <>", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryGreaterThan(String value) {
            addCriterion("project_category >", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("project_category >=", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryLessThan(String value) {
            addCriterion("project_category <", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryLessThanOrEqualTo(String value) {
            addCriterion("project_category <=", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryLike(String value) {
            addCriterion("project_category like", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryNotLike(String value) {
            addCriterion("project_category not like", value, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIn(List<String> values) {
            addCriterion("project_category in", values, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryNotIn(List<String> values) {
            addCriterion("project_category not in", values, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryBetween(String value1, String value2) {
            addCriterion("project_category between", value1, value2, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryNotBetween(String value1, String value2) {
            addCriterion("project_category not between", value1, value2, "projectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryIsNull() {
            addCriterion("subject_category is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryIsNotNull() {
            addCriterion("subject_category is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryEqualTo(String value) {
            addCriterion("subject_category =", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryNotEqualTo(String value) {
            addCriterion("subject_category <>", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryGreaterThan(String value) {
            addCriterion("subject_category >", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("subject_category >=", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryLessThan(String value) {
            addCriterion("subject_category <", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryLessThanOrEqualTo(String value) {
            addCriterion("subject_category <=", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryLike(String value) {
            addCriterion("subject_category like", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryNotLike(String value) {
            addCriterion("subject_category not like", value, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryIn(List<String> values) {
            addCriterion("subject_category in", values, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryNotIn(List<String> values) {
            addCriterion("subject_category not in", values, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryBetween(String value1, String value2) {
            addCriterion("subject_category between", value1, value2, "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryNotBetween(String value1, String value2) {
            addCriterion("subject_category not between", value1, value2, "subjectCategory");
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

        public Criteria andProjectDateIsNull() {
            addCriterion("project_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectDateIsNotNull() {
            addCriterion("project_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_date =", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_date <>", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_date >", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_date >=", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateLessThan(Date value) {
            addCriterionForJDBCDate("project_date <", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_date <=", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_date in", values, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_date not in", values, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_date between", value1, value2, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_date not between", value1, value2, "projectDate");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andMainEmployerIsNull() {
            addCriterion("main_employer is null");
            return (Criteria) this;
        }

        public Criteria andMainEmployerIsNotNull() {
            addCriterion("main_employer is not null");
            return (Criteria) this;
        }

        public Criteria andMainEmployerEqualTo(String value) {
            addCriterion("main_employer =", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerNotEqualTo(String value) {
            addCriterion("main_employer <>", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerGreaterThan(String value) {
            addCriterion("main_employer >", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerGreaterThanOrEqualTo(String value) {
            addCriterion("main_employer >=", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerLessThan(String value) {
            addCriterion("main_employer <", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerLessThanOrEqualTo(String value) {
            addCriterion("main_employer <=", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerLike(String value) {
            addCriterion("main_employer like", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerNotLike(String value) {
            addCriterion("main_employer not like", value, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerIn(List<String> values) {
            addCriterion("main_employer in", values, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerNotIn(List<String> values) {
            addCriterion("main_employer not in", values, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerBetween(String value1, String value2) {
            addCriterion("main_employer between", value1, value2, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andMainEmployerNotBetween(String value1, String value2) {
            addCriterion("main_employer not between", value1, value2, "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerIsNull() {
            addCriterion("sub_employer is null");
            return (Criteria) this;
        }

        public Criteria andSubEmployerIsNotNull() {
            addCriterion("sub_employer is not null");
            return (Criteria) this;
        }

        public Criteria andSubEmployerEqualTo(String value) {
            addCriterion("sub_employer =", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerNotEqualTo(String value) {
            addCriterion("sub_employer <>", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerGreaterThan(String value) {
            addCriterion("sub_employer >", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerGreaterThanOrEqualTo(String value) {
            addCriterion("sub_employer >=", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerLessThan(String value) {
            addCriterion("sub_employer <", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerLessThanOrEqualTo(String value) {
            addCriterion("sub_employer <=", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerLike(String value) {
            addCriterion("sub_employer like", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerNotLike(String value) {
            addCriterion("sub_employer not like", value, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerIn(List<String> values) {
            addCriterion("sub_employer in", values, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerNotIn(List<String> values) {
            addCriterion("sub_employer not in", values, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerBetween(String value1, String value2) {
            addCriterion("sub_employer between", value1, value2, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerNotBetween(String value1, String value2) {
            addCriterion("sub_employer not between", value1, value2, "subEmployer");
            return (Criteria) this;
        }

        public Criteria andFundLevelIsNull() {
            addCriterion("fund_level is null");
            return (Criteria) this;
        }

        public Criteria andFundLevelIsNotNull() {
            addCriterion("fund_level is not null");
            return (Criteria) this;
        }

        public Criteria andFundLevelEqualTo(String value) {
            addCriterion("fund_level =", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelNotEqualTo(String value) {
            addCriterion("fund_level <>", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelGreaterThan(String value) {
            addCriterion("fund_level >", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelGreaterThanOrEqualTo(String value) {
            addCriterion("fund_level >=", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelLessThan(String value) {
            addCriterion("fund_level <", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelLessThanOrEqualTo(String value) {
            addCriterion("fund_level <=", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelLike(String value) {
            addCriterion("fund_level like", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelNotLike(String value) {
            addCriterion("fund_level not like", value, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelIn(List<String> values) {
            addCriterion("fund_level in", values, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelNotIn(List<String> values) {
            addCriterion("fund_level not in", values, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelBetween(String value1, String value2) {
            addCriterion("fund_level between", value1, value2, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFundLevelNotBetween(String value1, String value2) {
            addCriterion("fund_level not between", value1, value2, "fundLevel");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFacultyIsNull() {
            addCriterion("faculty is null");
            return (Criteria) this;
        }

        public Criteria andFacultyIsNotNull() {
            addCriterion("faculty is not null");
            return (Criteria) this;
        }

        public Criteria andFacultyEqualTo(String value) {
            addCriterion("faculty =", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotEqualTo(String value) {
            addCriterion("faculty <>", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThan(String value) {
            addCriterion("faculty >", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThanOrEqualTo(String value) {
            addCriterion("faculty >=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThan(String value) {
            addCriterion("faculty <", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThanOrEqualTo(String value) {
            addCriterion("faculty <=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLike(String value) {
            addCriterion("faculty like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotLike(String value) {
            addCriterion("faculty not like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyIn(List<String> values) {
            addCriterion("faculty in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotIn(List<String> values) {
            addCriterion("faculty not in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyBetween(String value1, String value2) {
            addCriterion("faculty between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotBetween(String value1, String value2) {
            addCriterion("faculty not between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNull() {
            addCriterion("subject_no is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNotNull() {
            addCriterion("subject_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoEqualTo(String value) {
            addCriterion("subject_no =", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotEqualTo(String value) {
            addCriterion("subject_no <>", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThan(String value) {
            addCriterion("subject_no >", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("subject_no >=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThan(String value) {
            addCriterion("subject_no <", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("subject_no <=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLike(String value) {
            addCriterion("subject_no like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotLike(String value) {
            addCriterion("subject_no not like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIn(List<String> values) {
            addCriterion("subject_no in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotIn(List<String> values) {
            addCriterion("subject_no not in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoBetween(String value1, String value2) {
            addCriterion("subject_no between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotBetween(String value1, String value2) {
            addCriterion("subject_no not between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNull() {
            addCriterion("exec_time is null");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNotNull() {
            addCriterion("exec_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecTimeEqualTo(Date value) {
            addCriterionForJDBCDate("exec_time =", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("exec_time <>", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("exec_time >", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exec_time >=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThan(Date value) {
            addCriterionForJDBCDate("exec_time <", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exec_time <=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIn(List<Date> values) {
            addCriterionForJDBCDate("exec_time in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("exec_time not in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exec_time between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exec_time not between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andOwningSystemIsNull() {
            addCriterion("owning_system is null");
            return (Criteria) this;
        }

        public Criteria andOwningSystemIsNotNull() {
            addCriterion("owning_system is not null");
            return (Criteria) this;
        }

        public Criteria andOwningSystemEqualTo(String value) {
            addCriterion("owning_system =", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemNotEqualTo(String value) {
            addCriterion("owning_system <>", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemGreaterThan(String value) {
            addCriterion("owning_system >", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemGreaterThanOrEqualTo(String value) {
            addCriterion("owning_system >=", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemLessThan(String value) {
            addCriterion("owning_system <", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemLessThanOrEqualTo(String value) {
            addCriterion("owning_system <=", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemLike(String value) {
            addCriterion("owning_system like", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemNotLike(String value) {
            addCriterion("owning_system not like", value, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemIn(List<String> values) {
            addCriterion("owning_system in", values, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemNotIn(List<String> values) {
            addCriterion("owning_system not in", values, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemBetween(String value1, String value2) {
            addCriterion("owning_system between", value1, value2, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andOwningSystemNotBetween(String value1, String value2) {
            addCriterion("owning_system not between", value1, value2, "owningSystem");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNull() {
            addCriterion("result_name is null");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNotNull() {
            addCriterion("result_name is not null");
            return (Criteria) this;
        }

        public Criteria andResultNameEqualTo(String value) {
            addCriterion("result_name =", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotEqualTo(String value) {
            addCriterion("result_name <>", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThan(String value) {
            addCriterion("result_name >", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThanOrEqualTo(String value) {
            addCriterion("result_name >=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThan(String value) {
            addCriterion("result_name <", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThanOrEqualTo(String value) {
            addCriterion("result_name <=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLike(String value) {
            addCriterion("result_name like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotLike(String value) {
            addCriterion("result_name not like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameIn(List<String> values) {
            addCriterion("result_name in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotIn(List<String> values) {
            addCriterion("result_name not in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameBetween(String value1, String value2) {
            addCriterion("result_name between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotBetween(String value1, String value2) {
            addCriterion("result_name not between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNull() {
            addCriterion("result_type is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNotNull() {
            addCriterion("result_type is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeEqualTo(String value) {
            addCriterion("result_type =", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotEqualTo(String value) {
            addCriterion("result_type <>", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThan(String value) {
            addCriterion("result_type >", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("result_type >=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThan(String value) {
            addCriterion("result_type <", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThanOrEqualTo(String value) {
            addCriterion("result_type <=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLike(String value) {
            addCriterion("result_type like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotLike(String value) {
            addCriterion("result_type not like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeIn(List<String> values) {
            addCriterion("result_type in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotIn(List<String> values) {
            addCriterion("result_type not in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeBetween(String value1, String value2) {
            addCriterion("result_type between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotBetween(String value1, String value2) {
            addCriterion("result_type not between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultLevelIsNull() {
            addCriterion("result_level is null");
            return (Criteria) this;
        }

        public Criteria andResultLevelIsNotNull() {
            addCriterion("result_level is not null");
            return (Criteria) this;
        }

        public Criteria andResultLevelEqualTo(String value) {
            addCriterion("result_level =", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelNotEqualTo(String value) {
            addCriterion("result_level <>", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelGreaterThan(String value) {
            addCriterion("result_level >", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelGreaterThanOrEqualTo(String value) {
            addCriterion("result_level >=", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelLessThan(String value) {
            addCriterion("result_level <", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelLessThanOrEqualTo(String value) {
            addCriterion("result_level <=", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelLike(String value) {
            addCriterion("result_level like", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelNotLike(String value) {
            addCriterion("result_level not like", value, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelIn(List<String> values) {
            addCriterion("result_level in", values, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelNotIn(List<String> values) {
            addCriterion("result_level not in", values, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelBetween(String value1, String value2) {
            addCriterion("result_level between", value1, value2, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andResultLevelNotBetween(String value1, String value2) {
            addCriterion("result_level not between", value1, value2, "resultLevel");
            return (Criteria) this;
        }

        public Criteria andNoLikeInsensitive(String value) {
            addCriterion("upper(no) like", value.toUpperCase(), "no");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryLikeInsensitive(String value) {
            addCriterion("upper(project_category) like", value.toUpperCase(), "projectCategory");
            return (Criteria) this;
        }

        public Criteria andSubjectCategoryLikeInsensitive(String value) {
            addCriterion("upper(subject_category) like", value.toUpperCase(), "subjectCategory");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPrincipalLikeInsensitive(String value) {
            addCriterion("upper(principal) like", value.toUpperCase(), "principal");
            return (Criteria) this;
        }

        public Criteria andJobTitleLikeInsensitive(String value) {
            addCriterion("upper(job_title) like", value.toUpperCase(), "jobTitle");
            return (Criteria) this;
        }

        public Criteria andMainEmployerLikeInsensitive(String value) {
            addCriterion("upper(main_employer) like", value.toUpperCase(), "mainEmployer");
            return (Criteria) this;
        }

        public Criteria andSubEmployerLikeInsensitive(String value) {
            addCriterion("upper(sub_employer) like", value.toUpperCase(), "subEmployer");
            return (Criteria) this;
        }

        public Criteria andFundLevelLikeInsensitive(String value) {
            addCriterion("upper(fund_level) like", value.toUpperCase(), "fundLevel");
            return (Criteria) this;
        }

        public Criteria andFacultyLikeInsensitive(String value) {
            addCriterion("upper(faculty) like", value.toUpperCase(), "faculty");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLikeInsensitive(String value) {
            addCriterion("upper(subject_no) like", value.toUpperCase(), "subjectNo");
            return (Criteria) this;
        }

        public Criteria andOwningSystemLikeInsensitive(String value) {
            addCriterion("upper(owning_system) like", value.toUpperCase(), "owningSystem");
            return (Criteria) this;
        }

        public Criteria andResultNameLikeInsensitive(String value) {
            addCriterion("upper(result_name) like", value.toUpperCase(), "resultName");
            return (Criteria) this;
        }

        public Criteria andResultTypeLikeInsensitive(String value) {
            addCriterion("upper(result_type) like", value.toUpperCase(), "resultType");
            return (Criteria) this;
        }

        public Criteria andResultLevelLikeInsensitive(String value) {
            addCriterion("upper(result_level) like", value.toUpperCase(), "resultLevel");
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