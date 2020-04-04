package com.xl.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class PKExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PKExample() {
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

        public Criteria andSingerid1IsNull() {
            addCriterion("singerid1 is null");
            return (Criteria) this;
        }

        public Criteria andSingerid1IsNotNull() {
            addCriterion("singerid1 is not null");
            return (Criteria) this;
        }

        public Criteria andSingerid1EqualTo(Integer value) {
            addCriterion("singerid1 =", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1NotEqualTo(Integer value) {
            addCriterion("singerid1 <>", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1GreaterThan(Integer value) {
            addCriterion("singerid1 >", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("singerid1 >=", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1LessThan(Integer value) {
            addCriterion("singerid1 <", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1LessThanOrEqualTo(Integer value) {
            addCriterion("singerid1 <=", value, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1In(List<Integer> values) {
            addCriterion("singerid1 in", values, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1NotIn(List<Integer> values) {
            addCriterion("singerid1 not in", values, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1Between(Integer value1, Integer value2) {
            addCriterion("singerid1 between", value1, value2, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid1NotBetween(Integer value1, Integer value2) {
            addCriterion("singerid1 not between", value1, value2, "singerid1");
            return (Criteria) this;
        }

        public Criteria andSingerid2IsNull() {
            addCriterion("singerid2 is null");
            return (Criteria) this;
        }

        public Criteria andSingerid2IsNotNull() {
            addCriterion("singerid2 is not null");
            return (Criteria) this;
        }

        public Criteria andSingerid2EqualTo(Integer value) {
            addCriterion("singerid2 =", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2NotEqualTo(Integer value) {
            addCriterion("singerid2 <>", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2GreaterThan(Integer value) {
            addCriterion("singerid2 >", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("singerid2 >=", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2LessThan(Integer value) {
            addCriterion("singerid2 <", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2LessThanOrEqualTo(Integer value) {
            addCriterion("singerid2 <=", value, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2In(List<Integer> values) {
            addCriterion("singerid2 in", values, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2NotIn(List<Integer> values) {
            addCriterion("singerid2 not in", values, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2Between(Integer value1, Integer value2) {
            addCriterion("singerid2 between", value1, value2, "singerid2");
            return (Criteria) this;
        }

        public Criteria andSingerid2NotBetween(Integer value1, Integer value2) {
            addCriterion("singerid2 not between", value1, value2, "singerid2");
            return (Criteria) this;
        }

        public Criteria andPlayingIsNull() {
            addCriterion("playing is null");
            return (Criteria) this;
        }

        public Criteria andPlayingIsNotNull() {
            addCriterion("playing is not null");
            return (Criteria) this;
        }

        public Criteria andPlayingEqualTo(Integer value) {
            addCriterion("playing =", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingNotEqualTo(Integer value) {
            addCriterion("playing <>", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingGreaterThan(Integer value) {
            addCriterion("playing >", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingGreaterThanOrEqualTo(Integer value) {
            addCriterion("playing >=", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingLessThan(Integer value) {
            addCriterion("playing <", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingLessThanOrEqualTo(Integer value) {
            addCriterion("playing <=", value, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingIn(List<Integer> values) {
            addCriterion("playing in", values, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingNotIn(List<Integer> values) {
            addCriterion("playing not in", values, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingBetween(Integer value1, Integer value2) {
            addCriterion("playing between", value1, value2, "playing");
            return (Criteria) this;
        }

        public Criteria andPlayingNotBetween(Integer value1, Integer value2) {
            addCriterion("playing not between", value1, value2, "playing");
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