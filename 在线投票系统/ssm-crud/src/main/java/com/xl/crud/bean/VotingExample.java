package com.xl.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class VotingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VotingExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPkidIsNull() {
            addCriterion("pkid is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("pkid is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(Integer value) {
            addCriterion("pkid =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(Integer value) {
            addCriterion("pkid <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(Integer value) {
            addCriterion("pkid >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkid >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(Integer value) {
            addCriterion("pkid <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(Integer value) {
            addCriterion("pkid <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<Integer> values) {
            addCriterion("pkid in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<Integer> values) {
            addCriterion("pkid not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(Integer value1, Integer value2) {
            addCriterion("pkid between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("pkid not between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andSingeridIsNull() {
            addCriterion("singerid is null");
            return (Criteria) this;
        }

        public Criteria andSingeridIsNotNull() {
            addCriterion("singerid is not null");
            return (Criteria) this;
        }

        public Criteria andSingeridEqualTo(Integer value) {
            addCriterion("singerid =", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotEqualTo(Integer value) {
            addCriterion("singerid <>", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridGreaterThan(Integer value) {
            addCriterion("singerid >", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("singerid >=", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridLessThan(Integer value) {
            addCriterion("singerid <", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridLessThanOrEqualTo(Integer value) {
            addCriterion("singerid <=", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridIn(List<Integer> values) {
            addCriterion("singerid in", values, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotIn(List<Integer> values) {
            addCriterion("singerid not in", values, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridBetween(Integer value1, Integer value2) {
            addCriterion("singerid between", value1, value2, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotBetween(Integer value1, Integer value2) {
            addCriterion("singerid not between", value1, value2, "singerid");
            return (Criteria) this;
        }

        public Criteria andCoreIsNull() {
            addCriterion("core is null");
            return (Criteria) this;
        }

        public Criteria andCoreIsNotNull() {
            addCriterion("core is not null");
            return (Criteria) this;
        }

        public Criteria andCoreEqualTo(Integer value) {
            addCriterion("core =", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotEqualTo(Integer value) {
            addCriterion("core <>", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThan(Integer value) {
            addCriterion("core >", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("core >=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThan(Integer value) {
            addCriterion("core <", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThanOrEqualTo(Integer value) {
            addCriterion("core <=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreIn(List<Integer> values) {
            addCriterion("core in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotIn(List<Integer> values) {
            addCriterion("core not in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreBetween(Integer value1, Integer value2) {
            addCriterion("core between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotBetween(Integer value1, Integer value2) {
            addCriterion("core not between", value1, value2, "core");
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