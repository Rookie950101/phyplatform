package com.cooperation.register.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuyerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerInfoExample() {
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

        public Criteria andBuyeridIsNull() {
            addCriterion("buyerid is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNotNull() {
            addCriterion("buyerid is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridEqualTo(Long value) {
            addCriterion("buyerid =", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotEqualTo(Long value) {
            addCriterion("buyerid <>", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThan(Long value) {
            addCriterion("buyerid >", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThanOrEqualTo(Long value) {
            addCriterion("buyerid >=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThan(Long value) {
            addCriterion("buyerid <", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThanOrEqualTo(Long value) {
            addCriterion("buyerid <=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridIn(List<Long> values) {
            addCriterion("buyerid in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotIn(List<Long> values) {
            addCriterion("buyerid not in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridBetween(Long value1, Long value2) {
            addCriterion("buyerid between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotBetween(Long value1, Long value2) {
            addCriterion("buyerid not between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andSysuseridIsNull() {
            addCriterion("sysuserid is null");
            return (Criteria) this;
        }

        public Criteria andSysuseridIsNotNull() {
            addCriterion("sysuserid is not null");
            return (Criteria) this;
        }

        public Criteria andSysuseridEqualTo(Long value) {
            addCriterion("sysuserid =", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotEqualTo(Long value) {
            addCriterion("sysuserid <>", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridGreaterThan(Long value) {
            addCriterion("sysuserid >", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("sysuserid >=", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridLessThan(Long value) {
            addCriterion("sysuserid <", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridLessThanOrEqualTo(Long value) {
            addCriterion("sysuserid <=", value, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridIn(List<Long> values) {
            addCriterion("sysuserid in", values, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotIn(List<Long> values) {
            addCriterion("sysuserid not in", values, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridBetween(Long value1, Long value2) {
            addCriterion("sysuserid between", value1, value2, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andSysuseridNotBetween(Long value1, Long value2) {
            addCriterion("sysuserid not between", value1, value2, "sysuserid");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNull() {
            addCriterion("buyername is null");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNotNull() {
            addCriterion("buyername is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernameEqualTo(String value) {
            addCriterion("buyername =", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotEqualTo(String value) {
            addCriterion("buyername <>", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThan(String value) {
            addCriterion("buyername >", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThanOrEqualTo(String value) {
            addCriterion("buyername >=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThan(String value) {
            addCriterion("buyername <", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThanOrEqualTo(String value) {
            addCriterion("buyername <=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLike(String value) {
            addCriterion("buyername like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotLike(String value) {
            addCriterion("buyername not like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameIn(List<String> values) {
            addCriterion("buyername in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotIn(List<String> values) {
            addCriterion("buyername not in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameBetween(String value1, String value2) {
            addCriterion("buyername between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotBetween(String value1, String value2) {
            addCriterion("buyername not between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyerageIsNull() {
            addCriterion("buyerage is null");
            return (Criteria) this;
        }

        public Criteria andBuyerageIsNotNull() {
            addCriterion("buyerage is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerageEqualTo(Long value) {
            addCriterion("buyerage =", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageNotEqualTo(Long value) {
            addCriterion("buyerage <>", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageGreaterThan(Long value) {
            addCriterion("buyerage >", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageGreaterThanOrEqualTo(Long value) {
            addCriterion("buyerage >=", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageLessThan(Long value) {
            addCriterion("buyerage <", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageLessThanOrEqualTo(Long value) {
            addCriterion("buyerage <=", value, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageIn(List<Long> values) {
            addCriterion("buyerage in", values, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageNotIn(List<Long> values) {
            addCriterion("buyerage not in", values, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageBetween(Long value1, Long value2) {
            addCriterion("buyerage between", value1, value2, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerageNotBetween(Long value1, Long value2) {
            addCriterion("buyerage not between", value1, value2, "buyerage");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIsNull() {
            addCriterion("buyerphone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIsNotNull() {
            addCriterion("buyerphone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneEqualTo(String value) {
            addCriterion("buyerphone =", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotEqualTo(String value) {
            addCriterion("buyerphone <>", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneGreaterThan(String value) {
            addCriterion("buyerphone >", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyerphone >=", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLessThan(String value) {
            addCriterion("buyerphone <", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLessThanOrEqualTo(String value) {
            addCriterion("buyerphone <=", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLike(String value) {
            addCriterion("buyerphone like", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotLike(String value) {
            addCriterion("buyerphone not like", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIn(List<String> values) {
            addCriterion("buyerphone in", values, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotIn(List<String> values) {
            addCriterion("buyerphone not in", values, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneBetween(String value1, String value2) {
            addCriterion("buyerphone between", value1, value2, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotBetween(String value1, String value2) {
            addCriterion("buyerphone not between", value1, value2, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinIsNull() {
            addCriterion("buyerweixin is null");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinIsNotNull() {
            addCriterion("buyerweixin is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinEqualTo(String value) {
            addCriterion("buyerweixin =", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinNotEqualTo(String value) {
            addCriterion("buyerweixin <>", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinGreaterThan(String value) {
            addCriterion("buyerweixin >", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinGreaterThanOrEqualTo(String value) {
            addCriterion("buyerweixin >=", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinLessThan(String value) {
            addCriterion("buyerweixin <", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinLessThanOrEqualTo(String value) {
            addCriterion("buyerweixin <=", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinLike(String value) {
            addCriterion("buyerweixin like", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinNotLike(String value) {
            addCriterion("buyerweixin not like", value, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinIn(List<String> values) {
            addCriterion("buyerweixin in", values, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinNotIn(List<String> values) {
            addCriterion("buyerweixin not in", values, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinBetween(String value1, String value2) {
            addCriterion("buyerweixin between", value1, value2, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyerweixinNotBetween(String value1, String value2) {
            addCriterion("buyerweixin not between", value1, value2, "buyerweixin");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrIsNull() {
            addCriterion("buyeraddr is null");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrIsNotNull() {
            addCriterion("buyeraddr is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrEqualTo(String value) {
            addCriterion("buyeraddr =", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrNotEqualTo(String value) {
            addCriterion("buyeraddr <>", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrGreaterThan(String value) {
            addCriterion("buyeraddr >", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrGreaterThanOrEqualTo(String value) {
            addCriterion("buyeraddr >=", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrLessThan(String value) {
            addCriterion("buyeraddr <", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrLessThanOrEqualTo(String value) {
            addCriterion("buyeraddr <=", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrLike(String value) {
            addCriterion("buyeraddr like", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrNotLike(String value) {
            addCriterion("buyeraddr not like", value, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrIn(List<String> values) {
            addCriterion("buyeraddr in", values, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrNotIn(List<String> values) {
            addCriterion("buyeraddr not in", values, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrBetween(String value1, String value2) {
            addCriterion("buyeraddr between", value1, value2, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeraddrNotBetween(String value1, String value2) {
            addCriterion("buyeraddr not between", value1, value2, "buyeraddr");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityIsNull() {
            addCriterion("buyeridentity is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityIsNotNull() {
            addCriterion("buyeridentity is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityEqualTo(String value) {
            addCriterion("buyeridentity =", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityNotEqualTo(String value) {
            addCriterion("buyeridentity <>", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityGreaterThan(String value) {
            addCriterion("buyeridentity >", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityGreaterThanOrEqualTo(String value) {
            addCriterion("buyeridentity >=", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityLessThan(String value) {
            addCriterion("buyeridentity <", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityLessThanOrEqualTo(String value) {
            addCriterion("buyeridentity <=", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityLike(String value) {
            addCriterion("buyeridentity like", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityNotLike(String value) {
            addCriterion("buyeridentity not like", value, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityIn(List<String> values) {
            addCriterion("buyeridentity in", values, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityNotIn(List<String> values) {
            addCriterion("buyeridentity not in", values, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityBetween(String value1, String value2) {
            addCriterion("buyeridentity between", value1, value2, "buyeridentity");
            return (Criteria) this;
        }

        public Criteria andBuyeridentityNotBetween(String value1, String value2) {
            addCriterion("buyeridentity not between", value1, value2, "buyeridentity");
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