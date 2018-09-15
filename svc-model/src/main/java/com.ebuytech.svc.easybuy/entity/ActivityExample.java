package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ActivityExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
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

        public Criteria andActTypeIsNull() {
            addCriterion("act_type is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("act_type is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(Integer value) {
            addCriterion("act_type =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(Integer value) {
            addCriterion("act_type <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(Integer value) {
            addCriterion("act_type >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_type >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(Integer value) {
            addCriterion("act_type <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(Integer value) {
            addCriterion("act_type <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<Integer> values) {
            addCriterion("act_type in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<Integer> values) {
            addCriterion("act_type not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(Integer value1, Integer value2) {
            addCriterion("act_type between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("act_type not between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andCntTypeIsNull() {
            addCriterion("cnt_type is null");
            return (Criteria) this;
        }

        public Criteria andCntTypeIsNotNull() {
            addCriterion("cnt_type is not null");
            return (Criteria) this;
        }

        public Criteria andCntTypeEqualTo(Integer value) {
            addCriterion("cnt_type =", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeNotEqualTo(Integer value) {
            addCriterion("cnt_type <>", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeGreaterThan(Integer value) {
            addCriterion("cnt_type >", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_type >=", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeLessThan(Integer value) {
            addCriterion("cnt_type <", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_type <=", value, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeIn(List<Integer> values) {
            addCriterion("cnt_type in", values, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeNotIn(List<Integer> values) {
            addCriterion("cnt_type not in", values, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeBetween(Integer value1, Integer value2) {
            addCriterion("cnt_type between", value1, value2, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_type not between", value1, value2, "cntType");
            return (Criteria) this;
        }

        public Criteria andCntInfoIsNull() {
            addCriterion("cnt_info is null");
            return (Criteria) this;
        }

        public Criteria andCntInfoIsNotNull() {
            addCriterion("cnt_info is not null");
            return (Criteria) this;
        }

        public Criteria andCntInfoEqualTo(String value) {
            addCriterion("cnt_info =", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoNotEqualTo(String value) {
            addCriterion("cnt_info <>", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoGreaterThan(String value) {
            addCriterion("cnt_info >", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cnt_info >=", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoLessThan(String value) {
            addCriterion("cnt_info <", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoLessThanOrEqualTo(String value) {
            addCriterion("cnt_info <=", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoLike(String value) {
            addCriterion("cnt_info like", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoNotLike(String value) {
            addCriterion("cnt_info not like", value, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoIn(List<String> values) {
            addCriterion("cnt_info in", values, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoNotIn(List<String> values) {
            addCriterion("cnt_info not in", values, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoBetween(String value1, String value2) {
            addCriterion("cnt_info between", value1, value2, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andCntInfoNotBetween(String value1, String value2) {
            addCriterion("cnt_info not between", value1, value2, "cntInfo");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNull() {
            addCriterion("act_money is null");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNotNull() {
            addCriterion("act_money is not null");
            return (Criteria) this;
        }

        public Criteria andActMoneyEqualTo(Integer value) {
            addCriterion("act_money =", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotEqualTo(Integer value) {
            addCriterion("act_money <>", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThan(Integer value) {
            addCriterion("act_money >", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_money >=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThan(Integer value) {
            addCriterion("act_money <", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("act_money <=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyIn(List<Integer> values) {
            addCriterion("act_money in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotIn(List<Integer> values) {
            addCriterion("act_money not in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyBetween(Integer value1, Integer value2) {
            addCriterion("act_money between", value1, value2, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("act_money not between", value1, value2, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActCountIsNull() {
            addCriterion("act_count is null");
            return (Criteria) this;
        }

        public Criteria andActCountIsNotNull() {
            addCriterion("act_count is not null");
            return (Criteria) this;
        }

        public Criteria andActCountEqualTo(Integer value) {
            addCriterion("act_count =", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotEqualTo(Integer value) {
            addCriterion("act_count <>", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountGreaterThan(Integer value) {
            addCriterion("act_count >", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_count >=", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountLessThan(Integer value) {
            addCriterion("act_count <", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountLessThanOrEqualTo(Integer value) {
            addCriterion("act_count <=", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountIn(List<Integer> values) {
            addCriterion("act_count in", values, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotIn(List<Integer> values) {
            addCriterion("act_count not in", values, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountBetween(Integer value1, Integer value2) {
            addCriterion("act_count between", value1, value2, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotBetween(Integer value1, Integer value2) {
            addCriterion("act_count not between", value1, value2, "actCount");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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