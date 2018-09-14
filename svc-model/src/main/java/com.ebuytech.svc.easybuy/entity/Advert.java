package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * advert
 *
 * @author
 */
public class Advert implements Serializable {
    /**
     * 广告id
     */
    private Integer advertId;

    /**
     * 有效期 0：永不过期 1：有期限
     */
    private Integer validType;

    /**
     * 有效截止日期
     */
    private String validTime;

    /**
     * 图片url
     */
    private String imgUrl;

    /**
     * 备注
     */
    private String notice;

    /**
     * 状态 0：开启 1：关闭
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Integer advertId) {
        this.advertId = advertId;
    }

    public Integer getValidType() {
        return validType;
    }

    public void setValidType(Integer validType) {
        this.validType = validType;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        Advert other = (Advert) that;
        return (this.getAdvertId() == null ? other.getAdvertId() == null : this.getAdvertId().equals(other.getAdvertId())) && (this.getValidType() == null ?
                other.getValidType() == null :
                this.getValidType().equals(other.getValidType())) && (this.getValidTime() == null ? other.getValidTime() == null : this.getValidTime().equals(other.getValidTime())) && (
                       this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl())) && (this.getNotice() == null ?
                other.getNotice() == null :
                this.getNotice().equals(other.getNotice())) && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (this.getCreateTime() == null ?
                other.getCreateTime() == null :
                this.getCreateTime().equals(other.getCreateTime())) && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdvertId() == null) ? 0 : getAdvertId().hashCode());
        result = prime * result + ((getValidType() == null) ? 0 : getValidType().hashCode());
        result = prime * result + ((getValidTime() == null) ? 0 : getValidTime().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getNotice() == null) ? 0 : getNotice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", advertId=").append(advertId);
        sb.append(", validType=").append(validType);
        sb.append(", validTime=").append(validTime);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", notice=").append(notice);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
