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

        public Criteria andPoiIdIsNull() {
            addCriterion("poi_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(String value) {
            addCriterion("poi_id =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(String value) {
            addCriterion("poi_id <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(String value) {
            addCriterion("poi_id >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(String value) {
            addCriterion("poi_id >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(String value) {
            addCriterion("poi_id <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(String value) {
            addCriterion("poi_id <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLike(String value) {
            addCriterion("poi_id like", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotLike(String value) {
            addCriterion("poi_id not like", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<String> values) {
            addCriterion("poi_id in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<String> values) {
            addCriterion("poi_id not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(String value1, String value2) {
            addCriterion("poi_id between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(String value1, String value2) {
            addCriterion("poi_id not between", value1, value2, "poiId");
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

        public Criteria andStoreBranchNameIsNull() {
            addCriterion("store_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameIsNotNull() {
            addCriterion("store_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameEqualTo(String value) {
            addCriterion("store_branch_name =", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameNotEqualTo(String value) {
            addCriterion("store_branch_name <>", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameGreaterThan(String value) {
            addCriterion("store_branch_name >", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_branch_name >=", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameLessThan(String value) {
            addCriterion("store_branch_name <", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameLessThanOrEqualTo(String value) {
            addCriterion("store_branch_name <=", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameLike(String value) {
            addCriterion("store_branch_name like", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameNotLike(String value) {
            addCriterion("store_branch_name not like", value, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameIn(List<String> values) {
            addCriterion("store_branch_name in", values, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameNotIn(List<String> values) {
            addCriterion("store_branch_name not in", values, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameBetween(String value1, String value2) {
            addCriterion("store_branch_name between", value1, value2, "storeBranchName");
            return (Criteria) this;
        }

        public Criteria andStoreBranchNameNotBetween(String value1, String value2) {
            addCriterion("store_branch_name not between", value1, value2, "storeBranchName");
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

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeIsNull() {
            addCriterion("offset_type is null");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeIsNotNull() {
            addCriterion("offset_type is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeEqualTo(Integer value) {
            addCriterion("offset_type =", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeNotEqualTo(Integer value) {
            addCriterion("offset_type <>", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeGreaterThan(Integer value) {
            addCriterion("offset_type >", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset_type >=", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeLessThan(Integer value) {
            addCriterion("offset_type <", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("offset_type <=", value, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeIn(List<Integer> values) {
            addCriterion("offset_type in", values, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeNotIn(List<Integer> values) {
            addCriterion("offset_type not in", values, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeBetween(Integer value1, Integer value2) {
            addCriterion("offset_type between", value1, value2, "offsetType");
            return (Criteria) this;
        }

        public Criteria andOffsetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("offset_type not between", value1, value2, "offsetType");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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

        public Criteria andPhotoListIsNull() {
            addCriterion("photo_list is null");
            return (Criteria) this;
        }

        public Criteria andPhotoListIsNotNull() {
            addCriterion("photo_list is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoListEqualTo(String value) {
            addCriterion("photo_list =", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotEqualTo(String value) {
            addCriterion("photo_list <>", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListGreaterThan(String value) {
            addCriterion("photo_list >", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListGreaterThanOrEqualTo(String value) {
            addCriterion("photo_list >=", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLessThan(String value) {
            addCriterion("photo_list <", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLessThanOrEqualTo(String value) {
            addCriterion("photo_list <=", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLike(String value) {
            addCriterion("photo_list like", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotLike(String value) {
            addCriterion("photo_list not like", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListIn(List<String> values) {
            addCriterion("photo_list in", values, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotIn(List<String> values) {
            addCriterion("photo_list not in", values, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListBetween(String value1, String value2) {
            addCriterion("photo_list between", value1, value2, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotBetween(String value1, String value2) {
            addCriterion("photo_list not between", value1, value2, "photoList");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceEqualTo(Integer value) {
            addCriterion("avg_price =", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotEqualTo(Integer value) {
            addCriterion("avg_price <>", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThan(Integer value) {
            addCriterion("avg_price >", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_price >=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThan(Integer value) {
            addCriterion("avg_price <", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("avg_price <=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIn(List<Integer> values) {
            addCriterion("avg_price in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotIn(List<Integer> values) {
            addCriterion("avg_price not in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceBetween(Integer value1, Integer value2) {
            addCriterion("avg_price between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_price not between", value1, value2, "avgPrice");
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