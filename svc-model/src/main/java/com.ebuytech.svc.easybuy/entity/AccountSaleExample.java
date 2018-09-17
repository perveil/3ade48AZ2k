package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AccountSaleExample() {
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

        public Criteria andAccountSaleIdIsNull() {
            addCriterion("account_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdIsNotNull() {
            addCriterion("account_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdEqualTo(String value) {
            addCriterion("account_sale_id =", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdNotEqualTo(String value) {
            addCriterion("account_sale_id <>", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdGreaterThan(String value) {
            addCriterion("account_sale_id >", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_sale_id >=", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdLessThan(String value) {
            addCriterion("account_sale_id <", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdLessThanOrEqualTo(String value) {
            addCriterion("account_sale_id <=", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdLike(String value) {
            addCriterion("account_sale_id like", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdNotLike(String value) {
            addCriterion("account_sale_id not like", value, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdIn(List<String> values) {
            addCriterion("account_sale_id in", values, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdNotIn(List<String> values) {
            addCriterion("account_sale_id not in", values, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdBetween(String value1, String value2) {
            addCriterion("account_sale_id between", value1, value2, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountSaleIdNotBetween(String value1, String value2) {
            addCriterion("account_sale_id not between", value1, value2, "accountSaleId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdIsNull() {
            addCriterion("account_change_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdIsNotNull() {
            addCriterion("account_change_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdEqualTo(String value) {
            addCriterion("account_change_id =", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdNotEqualTo(String value) {
            addCriterion("account_change_id <>", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdGreaterThan(String value) {
            addCriterion("account_change_id >", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_change_id >=", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdLessThan(String value) {
            addCriterion("account_change_id <", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdLessThanOrEqualTo(String value) {
            addCriterion("account_change_id <=", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdLike(String value) {
            addCriterion("account_change_id like", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdNotLike(String value) {
            addCriterion("account_change_id not like", value, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdIn(List<String> values) {
            addCriterion("account_change_id in", values, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdNotIn(List<String> values) {
            addCriterion("account_change_id not in", values, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdBetween(String value1, String value2) {
            addCriterion("account_change_id between", value1, value2, "accountChangeId");
            return (Criteria) this;
        }

        public Criteria andAccountChangeIdNotBetween(String value1, String value2) {
            addCriterion("account_change_id not between", value1, value2, "accountChangeId");
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

        public Criteria andSaleOrderIdIsNull() {
            addCriterion("sale_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNotNull() {
            addCriterion("sale_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdEqualTo(String value) {
            addCriterion("sale_order_id =", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotEqualTo(String value) {
            addCriterion("sale_order_id <>", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThan(String value) {
            addCriterion("sale_order_id >", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order_id >=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThan(String value) {
            addCriterion("sale_order_id <", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sale_order_id <=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLike(String value) {
            addCriterion("sale_order_id like", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotLike(String value) {
            addCriterion("sale_order_id not like", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIn(List<String> values) {
            addCriterion("sale_order_id in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotIn(List<String> values) {
            addCriterion("sale_order_id not in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdBetween(String value1, String value2) {
            addCriterion("sale_order_id between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotBetween(String value1, String value2) {
            addCriterion("sale_order_id not between", value1, value2, "saleOrderId");
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

        public Criteria andSaleTerIdIsNull() {
            addCriterion("sale_ter_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdIsNotNull() {
            addCriterion("sale_ter_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdEqualTo(String value) {
            addCriterion("sale_ter_id =", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdNotEqualTo(String value) {
            addCriterion("sale_ter_id <>", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdGreaterThan(String value) {
            addCriterion("sale_ter_id >", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_ter_id >=", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdLessThan(String value) {
            addCriterion("sale_ter_id <", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdLessThanOrEqualTo(String value) {
            addCriterion("sale_ter_id <=", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdLike(String value) {
            addCriterion("sale_ter_id like", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdNotLike(String value) {
            addCriterion("sale_ter_id not like", value, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdIn(List<String> values) {
            addCriterion("sale_ter_id in", values, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdNotIn(List<String> values) {
            addCriterion("sale_ter_id not in", values, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdBetween(String value1, String value2) {
            addCriterion("sale_ter_id between", value1, value2, "saleTerId");
            return (Criteria) this;
        }

        public Criteria andSaleTerIdNotBetween(String value1, String value2) {
            addCriterion("sale_ter_id not between", value1, value2, "saleTerId");
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