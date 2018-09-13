package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * advert_pos
 * @author 
 */
public class AdvertPos implements Serializable {
    /**
     * 广告位id
     */
    private Integer posId;

    /**
     * 广告位名称
     */
    private String posName;

    /**
     * 状态 0：使用中 1：空闲
     */
    private Integer status;

    /**
     * 尺寸
     */
    private String size;

    /**
     * 广告个数
     */
    private Integer advertCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getAdvertCount() {
        return advertCount;
    }

    public void setAdvertCount(Integer advertCount) {
        this.advertCount = advertCount;
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
        AdvertPos other = (AdvertPos) that;
        return (this.getPosId() == null ? other.getPosId() == null : this.getPosId().equals(other.getPosId()))
            && (this.getPosName() == null ? other.getPosName() == null : this.getPosName().equals(other.getPosName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getAdvertCount() == null ? other.getAdvertCount() == null : this.getAdvertCount().equals(other.getAdvertCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPosId() == null) ? 0 : getPosId().hashCode());
        result = prime * result + ((getPosName() == null) ? 0 : getPosName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getAdvertCount() == null) ? 0 : getAdvertCount().hashCode());
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
        sb.append(", posId=").append(posId);
        sb.append(", posName=").append(posName);
        sb.append(", status=").append(status);
        sb.append(", size=").append(size);
        sb.append(", advertCount=").append(advertCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}