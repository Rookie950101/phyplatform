package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdcSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdcSkuInfoExample() {
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

        public Criteria andMdcskuidIsNull() {
            addCriterion("mdcskuid is null");
            return (Criteria) this;
        }

        public Criteria andMdcskuidIsNotNull() {
            addCriterion("mdcskuid is not null");
            return (Criteria) this;
        }

        public Criteria andMdcskuidEqualTo(Long value) {
            addCriterion("mdcskuid =", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidNotEqualTo(Long value) {
            addCriterion("mdcskuid <>", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidGreaterThan(Long value) {
            addCriterion("mdcskuid >", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidGreaterThanOrEqualTo(Long value) {
            addCriterion("mdcskuid >=", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidLessThan(Long value) {
            addCriterion("mdcskuid <", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidLessThanOrEqualTo(Long value) {
            addCriterion("mdcskuid <=", value, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidIn(List<Long> values) {
            addCriterion("mdcskuid in", values, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidNotIn(List<Long> values) {
            addCriterion("mdcskuid not in", values, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidBetween(Long value1, Long value2) {
            addCriterion("mdcskuid between", value1, value2, "mdcskuid");
            return (Criteria) this;
        }

        public Criteria andMdcskuidNotBetween(Long value1, Long value2) {
            addCriterion("mdcskuid not between", value1, value2, "mdcskuid");
            return (Criteria) this;
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

        public Criteria andMdcskunameIsNull() {
            addCriterion("mdcskuname is null");
            return (Criteria) this;
        }

        public Criteria andMdcskunameIsNotNull() {
            addCriterion("mdcskuname is not null");
            return (Criteria) this;
        }

        public Criteria andMdcskunameEqualTo(String value) {
            addCriterion("mdcskuname =", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameNotEqualTo(String value) {
            addCriterion("mdcskuname <>", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameGreaterThan(String value) {
            addCriterion("mdcskuname >", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameGreaterThanOrEqualTo(String value) {
            addCriterion("mdcskuname >=", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameLessThan(String value) {
            addCriterion("mdcskuname <", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameLessThanOrEqualTo(String value) {
            addCriterion("mdcskuname <=", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameLike(String value) {
            addCriterion("mdcskuname like", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameNotLike(String value) {
            addCriterion("mdcskuname not like", value, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameIn(List<String> values) {
            addCriterion("mdcskuname in", values, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameNotIn(List<String> values) {
            addCriterion("mdcskuname not in", values, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameBetween(String value1, String value2) {
            addCriterion("mdcskuname between", value1, value2, "mdcskuname");
            return (Criteria) this;
        }

        public Criteria andMdcskunameNotBetween(String value1, String value2) {
            addCriterion("mdcskuname not between", value1, value2, "mdcskuname");
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