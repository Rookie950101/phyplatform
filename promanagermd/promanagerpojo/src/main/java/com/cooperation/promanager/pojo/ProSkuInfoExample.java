package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProSkuInfoExample() {
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

        public Criteria andProskuidIsNull() {
            addCriterion("proskuid is null");
            return (Criteria) this;
        }

        public Criteria andProskuidIsNotNull() {
            addCriterion("proskuid is not null");
            return (Criteria) this;
        }

        public Criteria andProskuidEqualTo(Long value) {
            addCriterion("proskuid =", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidNotEqualTo(Long value) {
            addCriterion("proskuid <>", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidGreaterThan(Long value) {
            addCriterion("proskuid >", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidGreaterThanOrEqualTo(Long value) {
            addCriterion("proskuid >=", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidLessThan(Long value) {
            addCriterion("proskuid <", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidLessThanOrEqualTo(Long value) {
            addCriterion("proskuid <=", value, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidIn(List<Long> values) {
            addCriterion("proskuid in", values, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidNotIn(List<Long> values) {
            addCriterion("proskuid not in", values, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidBetween(Long value1, Long value2) {
            addCriterion("proskuid between", value1, value2, "proskuid");
            return (Criteria) this;
        }

        public Criteria andProskuidNotBetween(Long value1, Long value2) {
            addCriterion("proskuid not between", value1, value2, "proskuid");
            return (Criteria) this;
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

        public Criteria andProskunameIsNull() {
            addCriterion("proskuname is null");
            return (Criteria) this;
        }

        public Criteria andProskunameIsNotNull() {
            addCriterion("proskuname is not null");
            return (Criteria) this;
        }

        public Criteria andProskunameEqualTo(String value) {
            addCriterion("proskuname =", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameNotEqualTo(String value) {
            addCriterion("proskuname <>", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameGreaterThan(String value) {
            addCriterion("proskuname >", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameGreaterThanOrEqualTo(String value) {
            addCriterion("proskuname >=", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameLessThan(String value) {
            addCriterion("proskuname <", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameLessThanOrEqualTo(String value) {
            addCriterion("proskuname <=", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameLike(String value) {
            addCriterion("proskuname like", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameNotLike(String value) {
            addCriterion("proskuname not like", value, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameIn(List<String> values) {
            addCriterion("proskuname in", values, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameNotIn(List<String> values) {
            addCriterion("proskuname not in", values, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameBetween(String value1, String value2) {
            addCriterion("proskuname between", value1, value2, "proskuname");
            return (Criteria) this;
        }

        public Criteria andProskunameNotBetween(String value1, String value2) {
            addCriterion("proskuname not between", value1, value2, "proskuname");
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