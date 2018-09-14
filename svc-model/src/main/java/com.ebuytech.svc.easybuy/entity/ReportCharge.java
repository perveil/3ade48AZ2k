package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * report_charge
 * @author 
 */
public class ReportCharge implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 日期
     */
    private String date;

    /**
     * 充值笔数
     */
    private Integer chargeCount;

    /**
     * 充值总金额
     */
    private Integer chargeTotal;

    /**
     * 赠送金额
     */
    private Integer chargeSent;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getChargeCount() {
        return chargeCount;
    }

    public void setChargeCount(Integer chargeCount) {
        this.chargeCount = chargeCount;
    }

    public Integer getChargeTotal() {
        return chargeTotal;
    }

    public void setChargeTotal(Integer chargeTotal) {
        this.chargeTotal = chargeTotal;
    }

    public Integer getChargeSent() {
        return chargeSent;
    }

    public void setChargeSent(Integer chargeSent) {
        this.chargeSent = chargeSent;
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
        ReportCharge other = (ReportCharge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getChargeCount() == null ? other.getChargeCount() == null : this.getChargeCount().equals(other.getChargeCount()))
            && (this.getChargeTotal() == null ? other.getChargeTotal() == null : this.getChargeTotal().equals(other.getChargeTotal()))
            && (this.getChargeSent() == null ? other.getChargeSent() == null : this.getChargeSent().equals(other.getChargeSent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getChargeCount() == null) ? 0 : getChargeCount().hashCode());
        result = prime * result + ((getChargeTotal() == null) ? 0 : getChargeTotal().hashCode());
        result = prime * result + ((getChargeSent() == null) ? 0 : getChargeSent().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", chargeCount=").append(chargeCount);
        sb.append(", chargeTotal=").append(chargeTotal);
        sb.append(", chargeSent=").append(chargeSent);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}