package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdcCycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdcCycleExample() {
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

        public Criteria andMdccyidIsNull() {
            addCriterion("mdccyid is null");
            return (Criteria) this;
        }

        public Criteria andMdccyidIsNotNull() {
            addCriterion("mdccyid is not null");
            return (Criteria) this;
        }

        public Criteria andMdccyidEqualTo(Long value) {
            addCriterion("mdccyid =", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidNotEqualTo(Long value) {
            addCriterion("mdccyid <>", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidGreaterThan(Long value) {
            addCriterion("mdccyid >", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidGreaterThanOrEqualTo(Long value) {
            addCriterion("mdccyid >=", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidLessThan(Long value) {
            addCriterion("mdccyid <", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidLessThanOrEqualTo(Long value) {
            addCriterion("mdccyid <=", value, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidIn(List<Long> values) {
            addCriterion("mdccyid in", values, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidNotIn(List<Long> values) {
            addCriterion("mdccyid not in", values, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidBetween(Long value1, Long value2) {
            addCriterion("mdccyid between", value1, value2, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdccyidNotBetween(Long value1, Long value2) {
            addCriterion("mdccyid not between", value1, value2, "mdccyid");
            return (Criteria) this;
        }

        public Criteria andMdcidIsNull() {
            addCriterion("mdcid is null");
            return (Criteria) this;
        }

        public Criteria andMdcidIsNotNull() {
            addCriterion("mdcid is not null");
            return (Criteria) this;
        }

        public Criteria andMdcidEqualTo(Long value) {
            addCriterion("mdcid =", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidNotEqualTo(Long value) {
            addCriterion("mdcid <>", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidGreaterThan(Long value) {
            addCriterion("mdcid >", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidGreaterThanOrEqualTo(Long value) {
            addCriterion("mdcid >=", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidLessThan(Long value) {
            addCriterion("mdcid <", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidLessThanOrEqualTo(Long value) {
            addCriterion("mdcid <=", value, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidIn(List<Long> values) {
            addCriterion("mdcid in", values, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidNotIn(List<Long> values) {
            addCriterion("mdcid not in", values, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidBetween(Long value1, Long value2) {
            addCriterion("mdcid between", value1, value2, "mdcid");
            return (Criteria) this;
        }

        public Criteria andMdcidNotBetween(Long value1, Long value2) {
            addCriterion("mdcid not between", value1, value2, "mdcid");
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