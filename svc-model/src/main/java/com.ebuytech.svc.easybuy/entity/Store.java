package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * store
 * @author 
 */
public class Store implements Serializable {
    /**
     * 门店ID
     */
    private String storeId;

    /**
     * 微信门店id
     */
    private String poiId;

    /**
     * 门店名（15汉字内）
     */
    private String storeName;

    /**
     * 分店名称
     */
    private String storeBranchName;

    /**
     * 所在省（直辖市填市）
     */
    private String storeProvince;

    /**
     * 所在城市
     */
    private String storeCity;

    /**
     * 所在地区
     */
    private String storeDistrict;

    /**
     * 详细地址（不用填写省市信息，直辖市除外，详细到门牌号）
     */
    private String storeAddr;

    /**
     * 联系电话（
     */
    private String storePhone;

    /**
     * 门店分类不同级别用','隔开
     */
    private String categories;

    private Integer offsetType;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 状态 0：可用 1：不可用
     */
    private Integer status;

    /**
     * 操作 0：可用 1：不可用
     */
    private Integer oper;

    /**
     * 照片列表
     */
    private String photoList;

    /**
     * 推荐产品
     */
    private String recommend;

    /**
     * 特色服务
     */
    private String special;

    private String introduction;

    /**
     * 营业时间 用-隔开
     */
    private String openTime;

    /**
     * 均价，大于0的整数
     */
    private Integer avgPrice;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreBranchName() {
        return storeBranchName;
    }

    public void setStoreBranchName(String storeBranchName) {
        this.storeBranchName = storeBranchName;
    }

    public String getStoreProvince() {
        return storeProvince;
    }

    public void setStoreProvince(String storeProvince) {
        this.storeProvince = storeProvince;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreDistrict() {
        return storeDistrict;
    }

    public void setStoreDistrict(String storeDistrict) {
        this.storeDistrict = storeDistrict;
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Integer getOffsetType() {
        return offsetType;
    }

    public void setOffsetType(Integer offsetType) {
        this.offsetType = offsetType;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOper() {
        return oper;
    }

    public void setOper(Integer oper) {
        this.oper = oper;
    }

    public String getPhotoList() {
        return photoList;
    }

    public void setPhotoList(String photoList) {
        this.photoList = photoList;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public Integer getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Store other = (Store) that;
        return (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getPoiId() == null ? other.getPoiId() == null : this.getPoiId().equals(other.getPoiId()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreBranchName() == null ? other.getStoreBranchName() == null : this.getStoreBranchName().equals(other.getStoreBranchName()))
            && (this.getStoreProvince() == null ? other.getStoreProvince() == null : this.getStoreProvince().equals(other.getStoreProvince()))
            && (this.getStoreCity() == null ? other.getStoreCity() == null : this.getStoreCity().equals(other.getStoreCity()))
            && (this.getStoreDistrict() == null ? other.getStoreDistrict() == null : this.getStoreDistrict().equals(other.getStoreDistrict()))
            && (this.getStoreAddr() == null ? other.getStoreAddr() == null : this.getStoreAddr().equals(other.getStoreAddr()))
            && (this.getStorePhone() == null ? other.getStorePhone() == null : this.getStorePhone().equals(other.getStorePhone()))
            && (this.getCategories() == null ? other.getCategories() == null : this.getCategories().equals(other.getCategories()))
            && (this.getOffsetType() == null ? other.getOffsetType() == null : this.getOffsetType().equals(other.getOffsetType()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper()))
            && (this.getPhotoList() == null ? other.getPhotoList() == null : this.getPhotoList().equals(other.getPhotoList()))
            && (this.getRecommend() == null ? other.getRecommend() == null : this.getRecommend().equals(other.getRecommend()))
            && (this.getSpecial() == null ? other.getSpecial() == null : this.getSpecial().equals(other.getSpecial()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getOpenTime() == null ? other.getOpenTime() == null : this.getOpenTime().equals(other.getOpenTime()))
            && (this.getAvgPrice() == null ? other.getAvgPrice() == null : this.getAvgPrice().equals(other.getAvgPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getPoiId() == null) ? 0 : getPoiId().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreBranchName() == null) ? 0 : getStoreBranchName().hashCode());
        result = prime * result + ((getStoreProvince() == null) ? 0 : getStoreProvince().hashCode());
        result = prime * result + ((getStoreCity() == null) ? 0 : getStoreCity().hashCode());
        result = prime * result + ((getStoreDistrict() == null) ? 0 : getStoreDistrict().hashCode());
        result = prime * result + ((getStoreAddr() == null) ? 0 : getStoreAddr().hashCode());
        result = prime * result + ((getStorePhone() == null) ? 0 : getStorePhone().hashCode());
        result = prime * result + ((getCategories() == null) ? 0 : getCategories().hashCode());
        result = prime * result + ((getOffsetType() == null) ? 0 : getOffsetType().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getPhotoList() == null) ? 0 : getPhotoList().hashCode());
        result = prime * result + ((getRecommend() == null) ? 0 : getRecommend().hashCode());
        result = prime * result + ((getSpecial() == null) ? 0 : getSpecial().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getOpenTime() == null) ? 0 : getOpenTime().hashCode());
        result = prime * result + ((getAvgPrice() == null) ? 0 : getAvgPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", poiId=").append(poiId);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeBranchName=").append(storeBranchName);
        sb.append(", storeProvince=").append(storeProvince);
        sb.append(", storeCity=").append(storeCity);
        sb.append(", storeDistrict=").append(storeDistrict);
        sb.append(", storeAddr=").append(storeAddr);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", categories=").append(categories);
        sb.append(", offsetType=").append(offsetType);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", status=").append(status);
        sb.append(", oper=").append(oper);
        sb.append(", photoList=").append(photoList);
        sb.append(", recommend=").append(recommend);
        sb.append(", special=").append(special);
        sb.append(", introduction=").append(introduction);
        sb.append(", openTime=").append(openTime);
        sb.append(", avgPrice=").append(avgPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}