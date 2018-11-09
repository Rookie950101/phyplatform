package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProFacExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProFacExample() {
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

        public Criteria andProfacnameIsNull() {
            addCriterion("profacname is null");
            return (Criteria) this;
        }

        public Criteria andProfacnameIsNotNull() {
            addCriterion("profacname is not null");
            return (Criteria) this;
        }

        public Criteria andProfacnameEqualTo(String value) {
            addCriterion("profacname =", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameNotEqualTo(String value) {
            addCriterion("profacname <>", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameGreaterThan(String value) {
            addCriterion("profacname >", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameGreaterThanOrEqualTo(String value) {
            addCriterion("profacname >=", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameLessThan(String value) {
            addCriterion("profacname <", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameLessThanOrEqualTo(String value) {
            addCriterion("profacname <=", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameLike(String value) {
            addCriterion("profacname like", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameNotLike(String value) {
            addCriterion("profacname not like", value, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameIn(List<String> values) {
            addCriterion("profacname in", values, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameNotIn(List<String> values) {
            addCriterion("profacname not in", values, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameBetween(String value1, String value2) {
            addCriterion("profacname between", value1, value2, "profacname");
            return (Criteria) this;
        }

        public Criteria andProfacnameNotBetween(String value1, String value2) {
            addCriterion("profacname not between", value1, value2, "profacname");
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