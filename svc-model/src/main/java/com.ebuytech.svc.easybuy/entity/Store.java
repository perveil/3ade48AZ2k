package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * store
 *
 * @author
 */
public class Store implements Serializable {
    /**
     * 门店ID
     */
    private String storeId;

    /**
     * 门店名
     */
    private String storeName;

    /**
     * 所在省
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
     * 详细地址
     */
    private String storeAddr;

    /**
     * 联系电话
     */
    private String storePhone;

    /**
     * 状态 0：可用 1：不可用
     */
    private Integer status;

    /**
     * 操作 0：可用 1：不可用
     */
    private Integer oper;

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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    @Override public boolean equals(Object that) {
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
        return (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId())) && (this.getStoreName() == null ?
                other.getStoreName() == null :
                this.getStoreName().equals(other.getStoreName())) && (this.getStoreProvince() == null ? other.getStoreProvince() == null : this.getStoreProvince().equals(other.getStoreProvince()))
               && (this.getStoreCity() == null ? other.getStoreCity() == null : this.getStoreCity().equals(other.getStoreCity())) && (this.getStoreDistrict() == null ?
                other.getStoreDistrict() == null :
                this.getStoreDistrict().equals(other.getStoreDistrict())) && (this.getStoreAddr() == null ? other.getStoreAddr() == null : this.getStoreAddr().equals(other.getStoreAddr())) && (
                       this.getStorePhone() == null ? other.getStorePhone() == null : this.getStorePhone().equals(other.getStorePhone())) && (this.getStatus() == null ?
                other.getStatus() == null :
                this.getStatus().equals(other.getStatus())) && (this.getOper() == null ? other.getOper() == null : this.getOper().equals(other.getOper())) && (this.getCreateTime() == null ?
                other.getCreateTime() == null :
                this.getCreateTime().equals(other.getCreateTime())) && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreProvince() == null) ? 0 : getStoreProvince().hashCode());
        result = prime * result + ((getStoreCity() == null) ? 0 : getStoreCity().hashCode());
        result = prime * result + ((getStoreDistrict() == null) ? 0 : getStoreDistrict().hashCode());
        result = prime * result + ((getStoreAddr() == null) ? 0 : getStoreAddr().hashCode());
        result = prime * result + ((getStorePhone() == null) ? 0 : getStorePhone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOper() == null) ? 0 : getOper().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeProvince=").append(storeProvince);
        sb.append(", storeCity=").append(storeCity);
        sb.append(", storeDistrict=").append(storeDistrict);
        sb.append(", storeAddr=").append(storeAddr);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", status=").append(status);
        sb.append(", oper=").append(oper);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
