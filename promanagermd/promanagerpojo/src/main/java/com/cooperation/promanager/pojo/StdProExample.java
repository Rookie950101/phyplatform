package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class StdProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StdProExample() {
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

        public Criteria andShowflagIsNull() {
            addCriterion("showflag is null");
            return (Criteria) this;
        }

        public Criteria andShowflagIsNotNull() {
            addCriterion("showflag is not null");
            return (Criteria) this;
        }

        public Criteria andShowflagEqualTo(Long value) {
            addCriterion("showflag =", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagNotEqualTo(Long value) {
            addCriterion("showflag <>", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagGreaterThan(Long value) {
            addCriterion("showflag >", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagGreaterThanOrEqualTo(Long value) {
            addCriterion("showflag >=", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagLessThan(Long value) {
            addCriterion("showflag <", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagLessThanOrEqualTo(Long value) {
            addCriterion("showflag <=", value, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagIn(List<Long> values) {
            addCriterion("showflag in", values, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagNotIn(List<Long> values) {
            addCriterion("showflag not in", values, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagBetween(Long value1, Long value2) {
            addCriterion("showflag between", value1, value2, "showflag");
            return (Criteria) this;
        }

        public Criteria andShowflagNotBetween(Long value1, Long value2) {
            addCriterion("showflag not between", value1, value2, "showflag");
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