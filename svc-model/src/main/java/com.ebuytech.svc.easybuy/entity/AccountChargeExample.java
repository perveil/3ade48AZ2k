package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AccountChargeExample() {
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

        public Criteria andAccountChargeIdIsNull() {
            addCriterion("account_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdIsNotNull() {
            addCriterion("account_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdEqualTo(String value) {
            addCriterion("account_charge_id =", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdNotEqualTo(String value) {
            addCriterion("account_charge_id <>", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdGreaterThan(String value) {
            addCriterion("account_charge_id >", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_charge_id >=", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdLessThan(String value) {
            addCriterion("account_charge_id <", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdLessThanOrEqualTo(String value) {
            addCriterion("account_charge_id <=", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdLike(String value) {
            addCriterion("account_charge_id like", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdNotLike(String value) {
            addCriterion("account_charge_id not like", value, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdIn(List<String> values) {
            addCriterion("account_charge_id in", values, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdNotIn(List<String> values) {
            addCriterion("account_charge_id not in", values, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdBetween(String value1, String value2) {
            addCriterion("account_charge_id between", value1, value2, "accountChargeId");
            return (Criteria) this;
        }

        public Criteria andAccountChargeIdNotBetween(String value1, String value2) {
            addCriterion("account_charge_id not between", value1, value2, "accountChargeId");
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

        public Criteria andChangeExtraIsNull() {
            addCriterion("change_extra is null");
            return (Criteria) this;
        }

        public Criteria andChangeExtraIsNotNull() {
            addCriterion("change_extra is not null");
            return (Criteria) this;
        }

        public Criteria andChangeExtraEqualTo(Integer value) {
            addCriterion("change_extra =", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraNotEqualTo(Integer value) {
            addCriterion("change_extra <>", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraGreaterThan(Integer value) {
            addCriterion("change_extra >", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_extra >=", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraLessThan(Integer value) {
            addCriterion("change_extra <", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraLessThanOrEqualTo(Integer value) {
            addCriterion("change_extra <=", value, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraIn(List<Integer> values) {
            addCriterion("change_extra in", values, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraNotIn(List<Integer> values) {
            addCriterion("change_extra not in", values, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraBetween(Integer value1, Integer value2) {
            addCriterion("change_extra between", value1, value2, "changeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeExtraNotBetween(Integer value1, Integer value2) {
            addCriterion("change_extra not between", value1, value2, "changeExtra");
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

        public Criteria andChargeOrderSerialIsNull() {
            addCriterion("charge_order_serial is null");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialIsNotNull() {
            addCriterion("charge_order_serial is not null");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialEqualTo(String value) {
            addCriterion("charge_order_serial =", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialNotEqualTo(String value) {
            addCriterion("charge_order_serial <>", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialGreaterThan(String value) {
            addCriterion("charge_order_serial >", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialGreaterThanOrEqualTo(String value) {
            addCriterion("charge_order_serial >=", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialLessThan(String value) {
            addCriterion("charge_order_serial <", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialLessThanOrEqualTo(String value) {
            addCriterion("charge_order_serial <=", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialLike(String value) {
            addCriterion("charge_order_serial like", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialNotLike(String value) {
            addCriterion("charge_order_serial not like", value, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialIn(List<String> values) {
            addCriterion("charge_order_serial in", values, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialNotIn(List<String> values) {
            addCriterion("charge_order_serial not in", values, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialBetween(String value1, String value2) {
            addCriterion("charge_order_serial between", value1, value2, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeOrderSerialNotBetween(String value1, String value2) {
            addCriterion("charge_order_serial not between", value1, value2, "chargeOrderSerial");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("charge_type like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("charge_type not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
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

        public Criteria andChargeWayIsNull() {
            addCriterion("charge_way is null");
            return (Criteria) this;
        }

        public Criteria andChargeWayIsNotNull() {
            addCriterion("charge_way is not null");
            return (Criteria) this;
        }

        public Criteria andChargeWayEqualTo(String value) {
            addCriterion("charge_way =", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotEqualTo(String value) {
            addCriterion("charge_way <>", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayGreaterThan(String value) {
            addCriterion("charge_way >", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayGreaterThanOrEqualTo(String value) {
            addCriterion("charge_way >=", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLessThan(String value) {
            addCriterion("charge_way <", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLessThanOrEqualTo(String value) {
            addCriterion("charge_way <=", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLike(String value) {
            addCriterion("charge_way like", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotLike(String value) {
            addCriterion("charge_way not like", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayIn(List<String> values) {
            addCriterion("charge_way in", values, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotIn(List<String> values) {
            addCriterion("charge_way not in", values, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayBetween(String value1, String value2) {
            addCriterion("charge_way between", value1, value2, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotBetween(String value1, String value2) {
            addCriterion("charge_way not between", value1, value2, "chargeWay");
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

        public Criteria andPayAccountIsNull() {
            addCriterion("pay_account is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("pay_account is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("pay_account =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("pay_account <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("pay_account >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("pay_account <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("pay_account <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("pay_account like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("pay_account not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("pay_account in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("pay_account not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("pay_account between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("pay_account not between", value1, value2, "payAccount");
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