package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ReportChargeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("`date` like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("`date` not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andChargeCountIsNull() {
            addCriterion("charge_count is null");
            return (Criteria) this;
        }

        public Criteria andChargeCountIsNotNull() {
            addCriterion("charge_count is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCountEqualTo(Integer value) {
            addCriterion("charge_count =", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountNotEqualTo(Integer value) {
            addCriterion("charge_count <>", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountGreaterThan(Integer value) {
            addCriterion("charge_count >", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_count >=", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountLessThan(Integer value) {
            addCriterion("charge_count <", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountLessThanOrEqualTo(Integer value) {
            addCriterion("charge_count <=", value, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountIn(List<Integer> values) {
            addCriterion("charge_count in", values, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountNotIn(List<Integer> values) {
            addCriterion("charge_count not in", values, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountBetween(Integer value1, Integer value2) {
            addCriterion("charge_count between", value1, value2, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_count not between", value1, value2, "chargeCount");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIsNull() {
            addCriterion("charge_total is null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIsNotNull() {
            addCriterion("charge_total is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalEqualTo(Integer value) {
            addCriterion("charge_total =", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotEqualTo(Integer value) {
            addCriterion("charge_total <>", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalGreaterThan(Integer value) {
            addCriterion("charge_total >", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_total >=", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalLessThan(Integer value) {
            addCriterion("charge_total <", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalLessThanOrEqualTo(Integer value) {
            addCriterion("charge_total <=", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIn(List<Integer> values) {
            addCriterion("charge_total in", values, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotIn(List<Integer> values) {
            addCriterion("charge_total not in", values, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalBetween(Integer value1, Integer value2) {
            addCriterion("charge_total between", value1, value2, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_total not between", value1, value2, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeSentIsNull() {
            addCriterion("charge_sent is null");
            return (Criteria) this;
        }

        public Criteria andChargeSentIsNotNull() {
            addCriterion("charge_sent is not null");
            return (Criteria) this;
        }

        public Criteria andChargeSentEqualTo(Integer value) {
            addCriterion("charge_sent =", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentNotEqualTo(Integer value) {
            addCriterion("charge_sent <>", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentGreaterThan(Integer value) {
            addCriterion("charge_sent >", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_sent >=", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentLessThan(Integer value) {
            addCriterion("charge_sent <", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentLessThanOrEqualTo(Integer value) {
            addCriterion("charge_sent <=", value, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentIn(List<Integer> values) {
            addCriterion("charge_sent in", values, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentNotIn(List<Integer> values) {
            addCriterion("charge_sent not in", values, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentBetween(Integer value1, Integer value2) {
            addCriterion("charge_sent between", value1, value2, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andChargeSentNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_sent not between", value1, value2, "chargeSent");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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