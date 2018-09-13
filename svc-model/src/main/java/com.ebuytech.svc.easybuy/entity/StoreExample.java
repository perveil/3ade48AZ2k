package com.ebuytech.svc.easybuy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StoreExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceIsNull() {
            addCriterion("store_province is null");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceIsNotNull() {
            addCriterion("store_province is not null");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceEqualTo(String value) {
            addCriterion("store_province =", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceNotEqualTo(String value) {
            addCriterion("store_province <>", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceGreaterThan(String value) {
            addCriterion("store_province >", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("store_province >=", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceLessThan(String value) {
            addCriterion("store_province <", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceLessThanOrEqualTo(String value) {
            addCriterion("store_province <=", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceLike(String value) {
            addCriterion("store_province like", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceNotLike(String value) {
            addCriterion("store_province not like", value, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceIn(List<String> values) {
            addCriterion("store_province in", values, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceNotIn(List<String> values) {
            addCriterion("store_province not in", values, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceBetween(String value1, String value2) {
            addCriterion("store_province between", value1, value2, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreProvinceNotBetween(String value1, String value2) {
            addCriterion("store_province not between", value1, value2, "storeProvince");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNull() {
            addCriterion("store_city is null");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNotNull() {
            addCriterion("store_city is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCityEqualTo(String value) {
            addCriterion("store_city =", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotEqualTo(String value) {
            addCriterion("store_city <>", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThan(String value) {
            addCriterion("store_city >", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThanOrEqualTo(String value) {
            addCriterion("store_city >=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThan(String value) {
            addCriterion("store_city <", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThanOrEqualTo(String value) {
            addCriterion("store_city <=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLike(String value) {
            addCriterion("store_city like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotLike(String value) {
            addCriterion("store_city not like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityIn(List<String> values) {
            addCriterion("store_city in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotIn(List<String> values) {
            addCriterion("store_city not in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityBetween(String value1, String value2) {
            addCriterion("store_city between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotBetween(String value1, String value2) {
            addCriterion("store_city not between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictIsNull() {
            addCriterion("store_district is null");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictIsNotNull() {
            addCriterion("store_district is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictEqualTo(String value) {
            addCriterion("store_district =", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictNotEqualTo(String value) {
            addCriterion("store_district <>", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictGreaterThan(String value) {
            addCriterion("store_district >", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("store_district >=", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictLessThan(String value) {
            addCriterion("store_district <", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictLessThanOrEqualTo(String value) {
            addCriterion("store_district <=", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictLike(String value) {
            addCriterion("store_district like", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictNotLike(String value) {
            addCriterion("store_district not like", value, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictIn(List<String> values) {
            addCriterion("store_district in", values, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictNotIn(List<String> values) {
            addCriterion("store_district not in", values, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictBetween(String value1, String value2) {
            addCriterion("store_district between", value1, value2, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreDistrictNotBetween(String value1, String value2) {
            addCriterion("store_district not between", value1, value2, "storeDistrict");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIsNull() {
            addCriterion("store_addr is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIsNotNull() {
            addCriterion("store_addr is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrEqualTo(String value) {
            addCriterion("store_addr =", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotEqualTo(String value) {
            addCriterion("store_addr <>", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrGreaterThan(String value) {
            addCriterion("store_addr >", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrGreaterThanOrEqualTo(String value) {
            addCriterion("store_addr >=", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLessThan(String value) {
            addCriterion("store_addr <", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLessThanOrEqualTo(String value) {
            addCriterion("store_addr <=", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLike(String value) {
            addCriterion("store_addr like", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotLike(String value) {
            addCriterion("store_addr not like", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIn(List<String> values) {
            addCriterion("store_addr in", values, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotIn(List<String> values) {
            addCriterion("store_addr not in", values, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrBetween(String value1, String value2) {
            addCriterion("store_addr between", value1, value2, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotBetween(String value1, String value2) {
            addCriterion("store_addr not between", value1, value2, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
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

        public Criteria andOperIsNull() {
            addCriterion("oper is null");
            return (Criteria) this;
        }

        public Criteria andOperIsNotNull() {
            addCriterion("oper is not null");
            return (Criteria) this;
        }

        public Criteria andOperEqualTo(Integer value) {
            addCriterion("oper =", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperNotEqualTo(Integer value) {
            addCriterion("oper <>", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperGreaterThan(Integer value) {
            addCriterion("oper >", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper >=", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperLessThan(Integer value) {
            addCriterion("oper <", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperLessThanOrEqualTo(Integer value) {
            addCriterion("oper <=", value, "oper");
            return (Criteria) this;
        }

        public Criteria andOperIn(List<Integer> values) {
            addCriterion("oper in", values, "oper");
            return (Criteria) this;
        }

        public Criteria andOperNotIn(List<Integer> values) {
            addCriterion("oper not in", values, "oper");
            return (Criteria) this;
        }

        public Criteria andOperBetween(Integer value1, Integer value2) {
            addCriterion("oper between", value1, value2, "oper");
            return (Criteria) this;
        }

        public Criteria andOperNotBetween(Integer value1, Integer value2) {
            addCriterion("oper not between", value1, value2, "oper");
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