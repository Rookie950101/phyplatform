package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class BasProInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasProInfoExample() {
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

        public Criteria andBaseproidIsNull() {
            addCriterion("baseproid is null");
            return (Criteria) this;
        }

        public Criteria andBaseproidIsNotNull() {
            addCriterion("baseproid is not null");
            return (Criteria) this;
        }

        public Criteria andBaseproidEqualTo(Long value) {
            addCriterion("baseproid =", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidNotEqualTo(Long value) {
            addCriterion("baseproid <>", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidGreaterThan(Long value) {
            addCriterion("baseproid >", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidGreaterThanOrEqualTo(Long value) {
            addCriterion("baseproid >=", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidLessThan(Long value) {
            addCriterion("baseproid <", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidLessThanOrEqualTo(Long value) {
            addCriterion("baseproid <=", value, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidIn(List<Long> values) {
            addCriterion("baseproid in", values, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidNotIn(List<Long> values) {
            addCriterion("baseproid not in", values, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidBetween(Long value1, Long value2) {
            addCriterion("baseproid between", value1, value2, "baseproid");
            return (Criteria) this;
        }

        public Criteria andBaseproidNotBetween(Long value1, Long value2) {
            addCriterion("baseproid not between", value1, value2, "baseproid");
            return (Criteria) this;
        }

        public Criteria andProcateidIsNull() {
            addCriterion("procateid is null");
            return (Criteria) this;
        }

        public Criteria andProcateidIsNotNull() {
            addCriterion("procateid is not null");
            return (Criteria) this;
        }

        public Criteria andProcateidEqualTo(Long value) {
            addCriterion("procateid =", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidNotEqualTo(Long value) {
            addCriterion("procateid <>", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidGreaterThan(Long value) {
            addCriterion("procateid >", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidGreaterThanOrEqualTo(Long value) {
            addCriterion("procateid >=", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidLessThan(Long value) {
            addCriterion("procateid <", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidLessThanOrEqualTo(Long value) {
            addCriterion("procateid <=", value, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidIn(List<Long> values) {
            addCriterion("procateid in", values, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidNotIn(List<Long> values) {
            addCriterion("procateid not in", values, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidBetween(Long value1, Long value2) {
            addCriterion("procateid between", value1, value2, "procateid");
            return (Criteria) this;
        }

        public Criteria andProcateidNotBetween(Long value1, Long value2) {
            addCriterion("procateid not between", value1, value2, "procateid");
            return (Criteria) this;
        }

        public Criteria andProbandidIsNull() {
            addCriterion("probandid is null");
            return (Criteria) this;
        }

        public Criteria andProbandidIsNotNull() {
            addCriterion("probandid is not null");
            return (Criteria) this;
        }

        public Criteria andProbandidEqualTo(Long value) {
            addCriterion("probandid =", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidNotEqualTo(Long value) {
            addCriterion("probandid <>", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidGreaterThan(Long value) {
            addCriterion("probandid >", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidGreaterThanOrEqualTo(Long value) {
            addCriterion("probandid >=", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidLessThan(Long value) {
            addCriterion("probandid <", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidLessThanOrEqualTo(Long value) {
            addCriterion("probandid <=", value, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidIn(List<Long> values) {
            addCriterion("probandid in", values, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidNotIn(List<Long> values) {
            addCriterion("probandid not in", values, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidBetween(Long value1, Long value2) {
            addCriterion("probandid between", value1, value2, "probandid");
            return (Criteria) this;
        }

        public Criteria andProbandidNotBetween(Long value1, Long value2) {
            addCriterion("probandid not between", value1, value2, "probandid");
            return (Criteria) this;
        }

        public Criteria andProfacidIsNull() {
            addCriterion("profacid is null");
            return (Criteria) this;
        }

        public Criteria andProfacidIsNotNull() {
            addCriterion("profacid is not null");
            return (Criteria) this;
        }

        public Criteria andProfacidEqualTo(Long value) {
            addCriterion("profacid =", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidNotEqualTo(Long value) {
            addCriterion("profacid <>", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidGreaterThan(Long value) {
            addCriterion("profacid >", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidGreaterThanOrEqualTo(Long value) {
            addCriterion("profacid >=", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidLessThan(Long value) {
            addCriterion("profacid <", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidLessThanOrEqualTo(Long value) {
            addCriterion("profacid <=", value, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidIn(List<Long> values) {
            addCriterion("profacid in", values, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidNotIn(List<Long> values) {
            addCriterion("profacid not in", values, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidBetween(Long value1, Long value2) {
            addCriterion("profacid between", value1, value2, "profacid");
            return (Criteria) this;
        }

        public Criteria andProfacidNotBetween(Long value1, Long value2) {
            addCriterion("profacid not between", value1, value2, "profacid");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proname is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proname is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proname =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proname <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proname >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proname >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proname <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proname <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proname like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proname not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proname in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proname not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proname between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proname not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andApronumIsNull() {
            addCriterion("apronum is null");
            return (Criteria) this;
        }

        public Criteria andApronumIsNotNull() {
            addCriterion("apronum is not null");
            return (Criteria) this;
        }

        public Criteria andApronumEqualTo(String value) {
            addCriterion("apronum =", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumNotEqualTo(String value) {
            addCriterion("apronum <>", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumGreaterThan(String value) {
            addCriterion("apronum >", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumGreaterThanOrEqualTo(String value) {
            addCriterion("apronum >=", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumLessThan(String value) {
            addCriterion("apronum <", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumLessThanOrEqualTo(String value) {
            addCriterion("apronum <=", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumLike(String value) {
            addCriterion("apronum like", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumNotLike(String value) {
            addCriterion("apronum not like", value, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumIn(List<String> values) {
            addCriterion("apronum in", values, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumNotIn(List<String> values) {
            addCriterion("apronum not in", values, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumBetween(String value1, String value2) {
            addCriterion("apronum between", value1, value2, "apronum");
            return (Criteria) this;
        }

        public Criteria andApronumNotBetween(String value1, String value2) {
            addCriterion("apronum not between", value1, value2, "apronum");
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