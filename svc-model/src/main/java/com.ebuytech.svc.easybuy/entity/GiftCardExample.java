package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GiftCardExample() {
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

        public Criteria andGiftCardIdIsNull() {
            addCriterion("gift_card_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdIsNotNull() {
            addCriterion("gift_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdEqualTo(String value) {
            addCriterion("gift_card_id =", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdNotEqualTo(String value) {
            addCriterion("gift_card_id <>", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdGreaterThan(String value) {
            addCriterion("gift_card_id >", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("gift_card_id >=", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdLessThan(String value) {
            addCriterion("gift_card_id <", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdLessThanOrEqualTo(String value) {
            addCriterion("gift_card_id <=", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdLike(String value) {
            addCriterion("gift_card_id like", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdNotLike(String value) {
            addCriterion("gift_card_id not like", value, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdIn(List<String> values) {
            addCriterion("gift_card_id in", values, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdNotIn(List<String> values) {
            addCriterion("gift_card_id not in", values, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdBetween(String value1, String value2) {
            addCriterion("gift_card_id between", value1, value2, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardIdNotBetween(String value1, String value2) {
            addCriterion("gift_card_id not between", value1, value2, "giftCardId");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdIsNull() {
            addCriterion("gift_card_pwd is null");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdIsNotNull() {
            addCriterion("gift_card_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdEqualTo(String value) {
            addCriterion("gift_card_pwd =", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdNotEqualTo(String value) {
            addCriterion("gift_card_pwd <>", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdGreaterThan(String value) {
            addCriterion("gift_card_pwd >", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdGreaterThanOrEqualTo(String value) {
            addCriterion("gift_card_pwd >=", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdLessThan(String value) {
            addCriterion("gift_card_pwd <", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdLessThanOrEqualTo(String value) {
            addCriterion("gift_card_pwd <=", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdLike(String value) {
            addCriterion("gift_card_pwd like", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdNotLike(String value) {
            addCriterion("gift_card_pwd not like", value, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdIn(List<String> values) {
            addCriterion("gift_card_pwd in", values, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdNotIn(List<String> values) {
            addCriterion("gift_card_pwd not in", values, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdBetween(String value1, String value2) {
            addCriterion("gift_card_pwd between", value1, value2, "giftCardPwd");
            return (Criteria) this;
        }

        public Criteria andGiftCardPwdNotBetween(String value1, String value2) {
            addCriterion("gift_card_pwd not between", value1, value2, "giftCardPwd");
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

        public Criteria andValueCardIdIsNull() {
            addCriterion("value_card_id is null");
            return (Criteria) this;
        }

        public Criteria andValueCardIdIsNotNull() {
            addCriterion("value_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andValueCardIdEqualTo(String value) {
            addCriterion("value_card_id =", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdNotEqualTo(String value) {
            addCriterion("value_card_id <>", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdGreaterThan(String value) {
            addCriterion("value_card_id >", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("value_card_id >=", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdLessThan(String value) {
            addCriterion("value_card_id <", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdLessThanOrEqualTo(String value) {
            addCriterion("value_card_id <=", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdLike(String value) {
            addCriterion("value_card_id like", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdNotLike(String value) {
            addCriterion("value_card_id not like", value, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdIn(List<String> values) {
            addCriterion("value_card_id in", values, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdNotIn(List<String> values) {
            addCriterion("value_card_id not in", values, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdBetween(String value1, String value2) {
            addCriterion("value_card_id between", value1, value2, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andValueCardIdNotBetween(String value1, String value2) {
            addCriterion("value_card_id not between", value1, value2, "valueCardId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
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

        public Criteria andCoverIdIsNull() {
            addCriterion("cover_id is null");
            return (Criteria) this;
        }

        public Criteria andCoverIdIsNotNull() {
            addCriterion("cover_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoverIdEqualTo(Integer value) {
            addCriterion("cover_id =", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdNotEqualTo(Integer value) {
            addCriterion("cover_id <>", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdGreaterThan(Integer value) {
            addCriterion("cover_id >", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cover_id >=", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdLessThan(Integer value) {
            addCriterion("cover_id <", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdLessThanOrEqualTo(Integer value) {
            addCriterion("cover_id <=", value, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdIn(List<Integer> values) {
            addCriterion("cover_id in", values, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdNotIn(List<Integer> values) {
            addCriterion("cover_id not in", values, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdBetween(Integer value1, Integer value2) {
            addCriterion("cover_id between", value1, value2, "coverId");
            return (Criteria) this;
        }

        public Criteria andCoverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cover_id not between", value1, value2, "coverId");
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