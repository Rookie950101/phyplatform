package com.cooperation.promanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class UnStdProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnStdProExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proid is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proid is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Long value) {
            addCriterion("proid =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Long value) {
            addCriterion("proid <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Long value) {
            addCriterion("proid >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Long value) {
            addCriterion("proid >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Long value) {
            addCriterion("proid <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Long value) {
            addCriterion("proid <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Long> values) {
            addCriterion("proid in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Long> values) {
            addCriterion("proid not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Long value1, Long value2) {
            addCriterion("proid between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Long value1, Long value2) {
            addCriterion("proid not between", value1, value2, "proid");
            return (Criteria) this;
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

        public Criteria andUnstdpronameIsNull() {
            addCriterion("unstdproname is null");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameIsNotNull() {
            addCriterion("unstdproname is not null");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameEqualTo(String value) {
            addCriterion("unstdproname =", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameNotEqualTo(String value) {
            addCriterion("unstdproname <>", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameGreaterThan(String value) {
            addCriterion("unstdproname >", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameGreaterThanOrEqualTo(String value) {
            addCriterion("unstdproname >=", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameLessThan(String value) {
            addCriterion("unstdproname <", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameLessThanOrEqualTo(String value) {
            addCriterion("unstdproname <=", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameLike(String value) {
            addCriterion("unstdproname like", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameNotLike(String value) {
            addCriterion("unstdproname not like", value, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameIn(List<String> values) {
            addCriterion("unstdproname in", values, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameNotIn(List<String> values) {
            addCriterion("unstdproname not in", values, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameBetween(String value1, String value2) {
            addCriterion("unstdproname between", value1, value2, "unstdproname");
            return (Criteria) this;
        }

        public Criteria andUnstdpronameNotBetween(String value1, String value2) {
            addCriterion("unstdproname not between", value1, value2, "unstdproname");
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