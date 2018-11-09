package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComProStdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComProStdExample() {
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

        public Criteria andProstdidIsNull() {
            addCriterion("prostdid is null");
            return (Criteria) this;
        }

        public Criteria andProstdidIsNotNull() {
            addCriterion("prostdid is not null");
            return (Criteria) this;
        }

        public Criteria andProstdidEqualTo(Long value) {
            addCriterion("prostdid =", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidNotEqualTo(Long value) {
            addCriterion("prostdid <>", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidGreaterThan(Long value) {
            addCriterion("prostdid >", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidGreaterThanOrEqualTo(Long value) {
            addCriterion("prostdid >=", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidLessThan(Long value) {
            addCriterion("prostdid <", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidLessThanOrEqualTo(Long value) {
            addCriterion("prostdid <=", value, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidIn(List<Long> values) {
            addCriterion("prostdid in", values, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidNotIn(List<Long> values) {
            addCriterion("prostdid not in", values, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidBetween(Long value1, Long value2) {
            addCriterion("prostdid between", value1, value2, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdidNotBetween(Long value1, Long value2) {
            addCriterion("prostdid not between", value1, value2, "prostdid");
            return (Criteria) this;
        }

        public Criteria andProstdnameIsNull() {
            addCriterion("prostdname is null");
            return (Criteria) this;
        }

        public Criteria andProstdnameIsNotNull() {
            addCriterion("prostdname is not null");
            return (Criteria) this;
        }

        public Criteria andProstdnameEqualTo(String value) {
            addCriterion("prostdname =", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameNotEqualTo(String value) {
            addCriterion("prostdname <>", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameGreaterThan(String value) {
            addCriterion("prostdname >", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameGreaterThanOrEqualTo(String value) {
            addCriterion("prostdname >=", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameLessThan(String value) {
            addCriterion("prostdname <", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameLessThanOrEqualTo(String value) {
            addCriterion("prostdname <=", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameLike(String value) {
            addCriterion("prostdname like", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameNotLike(String value) {
            addCriterion("prostdname not like", value, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameIn(List<String> values) {
            addCriterion("prostdname in", values, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameNotIn(List<String> values) {
            addCriterion("prostdname not in", values, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameBetween(String value1, String value2) {
            addCriterion("prostdname between", value1, value2, "prostdname");
            return (Criteria) this;
        }

        public Criteria andProstdnameNotBetween(String value1, String value2) {
            addCriterion("prostdname not between", value1, value2, "prostdname");
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