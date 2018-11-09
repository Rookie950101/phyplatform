package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class BanFmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BanFmExample() {
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

        public Criteria andBanfmidIsNull() {
            addCriterion("banfmid is null");
            return (Criteria) this;
        }

        public Criteria andBanfmidIsNotNull() {
            addCriterion("banfmid is not null");
            return (Criteria) this;
        }

        public Criteria andBanfmidEqualTo(Long value) {
            addCriterion("banfmid =", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidNotEqualTo(Long value) {
            addCriterion("banfmid <>", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidGreaterThan(Long value) {
            addCriterion("banfmid >", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidGreaterThanOrEqualTo(Long value) {
            addCriterion("banfmid >=", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidLessThan(Long value) {
            addCriterion("banfmid <", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidLessThanOrEqualTo(Long value) {
            addCriterion("banfmid <=", value, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidIn(List<Long> values) {
            addCriterion("banfmid in", values, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidNotIn(List<Long> values) {
            addCriterion("banfmid not in", values, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidBetween(Long value1, Long value2) {
            addCriterion("banfmid between", value1, value2, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmidNotBetween(Long value1, Long value2) {
            addCriterion("banfmid not between", value1, value2, "banfmid");
            return (Criteria) this;
        }

        public Criteria andBanfmnameIsNull() {
            addCriterion("banfmname is null");
            return (Criteria) this;
        }

        public Criteria andBanfmnameIsNotNull() {
            addCriterion("banfmname is not null");
            return (Criteria) this;
        }

        public Criteria andBanfmnameEqualTo(String value) {
            addCriterion("banfmname =", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameNotEqualTo(String value) {
            addCriterion("banfmname <>", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameGreaterThan(String value) {
            addCriterion("banfmname >", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameGreaterThanOrEqualTo(String value) {
            addCriterion("banfmname >=", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameLessThan(String value) {
            addCriterion("banfmname <", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameLessThanOrEqualTo(String value) {
            addCriterion("banfmname <=", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameLike(String value) {
            addCriterion("banfmname like", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameNotLike(String value) {
            addCriterion("banfmname not like", value, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameIn(List<String> values) {
            addCriterion("banfmname in", values, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameNotIn(List<String> values) {
            addCriterion("banfmname not in", values, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameBetween(String value1, String value2) {
            addCriterion("banfmname between", value1, value2, "banfmname");
            return (Criteria) this;
        }

        public Criteria andBanfmnameNotBetween(String value1, String value2) {
            addCriterion("banfmname not between", value1, value2, "banfmname");
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