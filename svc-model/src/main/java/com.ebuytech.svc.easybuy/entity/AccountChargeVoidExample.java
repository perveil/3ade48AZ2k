package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountChargeVoidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AccountChargeVoidExample() {
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

        public Criteria andAccountChargeVoidIdIsNull() {
            addCriterion("account_charge_void_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdIsNotNull() {
            addCriterion("account_charge_void_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdEqualTo(String value) {
            addCriterion("account_charge_void_id =", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdNotEqualTo(String value) {
            addCriterion("account_charge_void_id <>", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdGreaterThan(String value) {
            addCriterion("account_charge_void_id >", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_charge_void_id >=", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdLessThan(String value) {
            addCriterion("account_charge_void_id <", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdLessThanOrEqualTo(String value) {
            addCriterion("account_charge_void_id <=", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdLike(String value) {
            addCriterion("account_charge_void_id like", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdNotLike(String value) {
            addCriterion("account_charge_void_id not like", value, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdIn(List<String> values) {
            addCriterion("account_charge_void_id in", values, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdNotIn(List<String> values) {
            addCriterion("account_charge_void_id not in", values, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdBetween(String value1, String value2) {
            addCriterion("account_charge_void_id between", value1, value2, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeVoidIdNotBetween(String value1, String value2) {
            addCriterion("account_charge_void_id not between", value1, value2, "accountChargeVoidId");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNull() {
            addCriterion("change_value is null");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNotNull() {
            addCriterion("change_value is not null");
            return (Criteria) this;
        }

        public Criteria andChangeValueEqualTo(Integer value) {
            addCriterion("change_value =", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotEqualTo(Integer value) {
            addCriterion("change_value <>", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThan(Integer value) {
            addCriterion("change_value >", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_value >=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThan(Integer value) {
            addCriterion("change_value <", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThanOrEqualTo(Integer value) {
            addCriterion("change_value <=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueIn(List<Integer> values) {
            addCriterion("change_value in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotIn(List<Integer> values) {
            addCriterion("change_value not in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueBetween(Integer value1, Integer value2) {
            addCriterion("change_value between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("change_value not between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeMemoIsNull() {
            addCriterion("change_memo is null");
            return (Criteria) this;
        }

        public Criteria andChangeMemoIsNotNull() {
            addCriterion("change_memo is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMemoEqualTo(String value) {
            addCriterion("change_memo =", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoNotEqualTo(String value) {
            addCriterion("change_memo <>", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoGreaterThan(String value) {
            addCriterion("change_memo >", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("change_memo >=", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoLessThan(String value) {
            addCriterion("change_memo <", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoLessThanOrEqualTo(String value) {
            addCriterion("change_memo <=", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoLike(String value) {
            addCriterion("change_memo like", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoNotLike(String value) {
            addCriterion("change_memo not like", value, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoIn(List<String> values) {
            addCriterion("change_memo in", values, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoNotIn(List<String> values) {
            addCriterion("change_memo not in", values, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoBetween(String value1, String value2) {
            addCriterion("change_memo between", value1, value2, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andChangeMemoNotBetween(String value1, String value2) {
            addCriterion("change_memo not between", value1, value2, "changeMemo");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdIsNull() {
            addCriterion("charge_order_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdIsNotNull() {
            addCriterion("charge_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdEqualTo(String value) {
            addCriterion("charge_order_id =", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdNotEqualTo(String value) {
            addCriterion("charge_order_id <>", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdGreaterThan(String value) {
            addCriterion("charge_order_id >", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("charge_order_id >=", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdLessThan(String value) {
            addCriterion("charge_order_id <", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdLessThanOrEqualTo(String value) {
            addCriterion("charge_order_id <=", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdLike(String value) {
            addCriterion("charge_order_id like", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdNotLike(String value) {
            addCriterion("charge_order_id not like", value, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdIn(List<String> values) {
            addCriterion("charge_order_id in", values, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdNotIn(List<String> values) {
            addCriterion("charge_order_id not in", values, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdBetween(String value1, String value2) {
            addCriterion("charge_order_id between", value1, value2, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeOrderIdNotBetween(String value1, String value2) {
            addCriterion("charge_order_id not between", value1, value2, "chargeOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdIsNull() {
            addCriterion("charge_void_order_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdIsNotNull() {
            addCriterion("charge_void_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdEqualTo(String value) {
            addCriterion("charge_void_order_id =", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdNotEqualTo(String value) {
            addCriterion("charge_void_order_id <>", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdGreaterThan(String value) {
            addCriterion("charge_void_order_id >", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("charge_void_order_id >=", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdLessThan(String value) {
            addCriterion("charge_void_order_id <", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdLessThanOrEqualTo(String value) {
            addCriterion("charge_void_order_id <=", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdLike(String value) {
            addCriterion("charge_void_order_id like", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdNotLike(String value) {
            addCriterion("charge_void_order_id not like", value, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdIn(List<String> values) {
            addCriterion("charge_void_order_id in", values, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdNotIn(List<String> values) {
            addCriterion("charge_void_order_id not in", values, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdBetween(String value1, String value2) {
            addCriterion("charge_void_order_id between", value1, value2, "chargeVoidOrderId");
            return (Criteria) this;
        }

        public Criteria andChargeVoidOrderIdNotBetween(String value1, String value2) {
            addCriterion("charge_void_order_id not between", value1, value2, "chargeVoidOrderId");
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