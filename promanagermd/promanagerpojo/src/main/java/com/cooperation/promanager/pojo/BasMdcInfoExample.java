package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class BasMdcInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasMdcInfoExample() {
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

        public Criteria andBasemdcidIsNull() {
            addCriterion("basemdcid is null");
            return (Criteria) this;
        }

        public Criteria andBasemdcidIsNotNull() {
            addCriterion("basemdcid is not null");
            return (Criteria) this;
        }

        public Criteria andBasemdcidEqualTo(Long value) {
            addCriterion("basemdcid =", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidNotEqualTo(Long value) {
            addCriterion("basemdcid <>", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidGreaterThan(Long value) {
            addCriterion("basemdcid >", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidGreaterThanOrEqualTo(Long value) {
            addCriterion("basemdcid >=", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidLessThan(Long value) {
            addCriterion("basemdcid <", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidLessThanOrEqualTo(Long value) {
            addCriterion("basemdcid <=", value, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidIn(List<Long> values) {
            addCriterion("basemdcid in", values, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidNotIn(List<Long> values) {
            addCriterion("basemdcid not in", values, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidBetween(Long value1, Long value2) {
            addCriterion("basemdcid between", value1, value2, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andBasemdcidNotBetween(Long value1, Long value2) {
            addCriterion("basemdcid not between", value1, value2, "basemdcid");
            return (Criteria) this;
        }

        public Criteria andMdcnameIsNull() {
            addCriterion("mdcname is null");
            return (Criteria) this;
        }

        public Criteria andMdcnameIsNotNull() {
            addCriterion("mdcname is not null");
            return (Criteria) this;
        }

        public Criteria andMdcnameEqualTo(String value) {
            addCriterion("mdcname =", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameNotEqualTo(String value) {
            addCriterion("mdcname <>", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameGreaterThan(String value) {
            addCriterion("mdcname >", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameGreaterThanOrEqualTo(String value) {
            addCriterion("mdcname >=", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameLessThan(String value) {
            addCriterion("mdcname <", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameLessThanOrEqualTo(String value) {
            addCriterion("mdcname <=", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameLike(String value) {
            addCriterion("mdcname like", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameNotLike(String value) {
            addCriterion("mdcname not like", value, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameIn(List<String> values) {
            addCriterion("mdcname in", values, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameNotIn(List<String> values) {
            addCriterion("mdcname not in", values, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameBetween(String value1, String value2) {
            addCriterion("mdcname between", value1, value2, "mdcname");
            return (Criteria) this;
        }

        public Criteria andMdcnameNotBetween(String value1, String value2) {
            addCriterion("mdcname not between", value1, value2, "mdcname");
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

        public Criteria andAproidIsNull() {
            addCriterion("aproid is null");
            return (Criteria) this;
        }

        public Criteria andAproidIsNotNull() {
            addCriterion("aproid is not null");
            return (Criteria) this;
        }

        public Criteria andAproidEqualTo(String value) {
            addCriterion("aproid =", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidNotEqualTo(String value) {
            addCriterion("aproid <>", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidGreaterThan(String value) {
            addCriterion("aproid >", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidGreaterThanOrEqualTo(String value) {
            addCriterion("aproid >=", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidLessThan(String value) {
            addCriterion("aproid <", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidLessThanOrEqualTo(String value) {
            addCriterion("aproid <=", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidLike(String value) {
            addCriterion("aproid like", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidNotLike(String value) {
            addCriterion("aproid not like", value, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidIn(List<String> values) {
            addCriterion("aproid in", values, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidNotIn(List<String> values) {
            addCriterion("aproid not in", values, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidBetween(String value1, String value2) {
            addCriterion("aproid between", value1, value2, "aproid");
            return (Criteria) this;
        }

        public Criteria andAproidNotBetween(String value1, String value2) {
            addCriterion("aproid not between", value1, value2, "aproid");
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