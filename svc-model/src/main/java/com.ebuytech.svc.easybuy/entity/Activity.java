package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * activity
 * @author 
 */
public class Activity implements Serializable {
    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 活动状态 0:开启 1：关闭
     */
    private Integer status;

    /**
     * 活动类型 0：充送活动 1：礼品卡购买活动
     */
    private Integer actType;

    /**
     * 优惠类型 0：送金额 1：会员折扣 2：优惠券（未开发）
     */
    private Integer cntType;

    /**
     * 优惠内容
     */
    private String cntInfo;

    /**
     * 活动金额
     */
    private Integer actMoney;

    /**
     * 活动折扣
     */
    private Integer actCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
    }

    public Integer getCntType() {
        return cntType;
    }

    public void setCntType(Integer cntType) {
        this.cntType = cntType;
    }

    public String getCntInfo() {
        return cntInfo;
    }

    public void setCntInfo(String cntInfo) {
        this.cntInfo = cntInfo;
    }

    public Integer getActMoney() {
        return actMoney;
    }

    public void setActMoney(Integer actMoney) {
        this.actMoney = actMoney;
    }

    public Integer getActCount() {
        return actCount;
    }

    public void setActCount(Integer actCount) {
        this.actCount = actCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        Activity other = (Activity) that;
        return (this.getActId() == null ? other.getActId() == null : this.getActId().equals(other.getActId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getActType() == null ? other.getActType() == null : this.getActType().equals(other.getActType()))
            && (this.getCntType() == null ? other.getCntType() == null : this.getCntType().equals(other.getCntType()))
            && (this.getCntInfo() == null ? other.getCntInfo() == null : this.getCntInfo().equals(other.getCntInfo()))
            && (this.getActMoney() == null ? other.getActMoney() == null : this.getActMoney().equals(other.getActMoney()))
            && (this.getActCount() == null ? other.getActCount() == null : this.getActCount().equals(other.getActCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActId() == null) ? 0 : getActId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getActType() == null) ? 0 : getActType().hashCode());
        result = prime * result + ((getCntType() == null) ? 0 : getCntType().hashCode());
        result = prime * result + ((getCntInfo() == null) ? 0 : getCntInfo().hashCode());
        result = prime * result + ((getActMoney() == null) ? 0 : getActMoney().hashCode());
        result = prime * result + ((getActCount() == null) ? 0 : getActCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actId=").append(actId);
        sb.append(", status=").append(status);
        sb.append(", actType=").append(actType);
        sb.append(", cntType=").append(cntType);
        sb.append(", cntInfo=").append(cntInfo);
        sb.append(", actMoney=").append(actMoney);
        sb.append(", actCount=").append(actCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}