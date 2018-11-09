package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class StdCycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StdCycleExample() {
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

        public Criteria andStdcyidIsNull() {
            addCriterion("stdcyid is null");
            return (Criteria) this;
        }

        public Criteria andStdcyidIsNotNull() {
            addCriterion("stdcyid is not null");
            return (Criteria) this;
        }

        public Criteria andStdcyidEqualTo(Long value) {
            addCriterion("stdcyid =", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidNotEqualTo(Long value) {
            addCriterion("stdcyid <>", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidGreaterThan(Long value) {
            addCriterion("stdcyid >", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidGreaterThanOrEqualTo(Long value) {
            addCriterion("stdcyid >=", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidLessThan(Long value) {
            addCriterion("stdcyid <", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidLessThanOrEqualTo(Long value) {
            addCriterion("stdcyid <=", value, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidIn(List<Long> values) {
            addCriterion("stdcyid in", values, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidNotIn(List<Long> values) {
            addCriterion("stdcyid not in", values, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidBetween(Long value1, Long value2) {
            addCriterion("stdcyid between", value1, value2, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdcyidNotBetween(Long value1, Long value2) {
            addCriterion("stdcyid not between", value1, value2, "stdcyid");
            return (Criteria) this;
        }

        public Criteria andStdproidIsNull() {
            addCriterion("stdproid is null");
            return (Criteria) this;
        }

        public Criteria andStdproidIsNotNull() {
            addCriterion("stdproid is not null");
            return (Criteria) this;
        }

        public Criteria andStdproidEqualTo(Long value) {
            addCriterion("stdproid =", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidNotEqualTo(Long value) {
            addCriterion("stdproid <>", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidGreaterThan(Long value) {
            addCriterion("stdproid >", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidGreaterThanOrEqualTo(Long value) {
            addCriterion("stdproid >=", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidLessThan(Long value) {
            addCriterion("stdproid <", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidLessThanOrEqualTo(Long value) {
            addCriterion("stdproid <=", value, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidIn(List<Long> values) {
            addCriterion("stdproid in", values, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidNotIn(List<Long> values) {
            addCriterion("stdproid not in", values, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidBetween(Long value1, Long value2) {
            addCriterion("stdproid between", value1, value2, "stdproid");
            return (Criteria) this;
        }

        public Criteria andStdproidNotBetween(Long value1, Long value2) {
            addCriterion("stdproid not between", value1, value2, "stdproid");
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