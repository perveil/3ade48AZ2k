package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * account_refund
 *
 * @author
 */
public class AccountRefund implements Serializable {
    /**
     * 主键
     */
    private String accountRefundId;

    /**
     * 账户变动id
     */
    private String accountChangeId;

    /**
     * 变动值
     */
    private Integer changeValue;

    /**
     * 变动原因
     */
    private String changeMemo;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 原消费订单号
     */
    private String saleOrderId;

    /**
     * 退款订单号
     */
    private String refundOrderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAccountRefundId() {
        return accountRefundId;
    }

    public void setAccountRefundId(String accountRefundId) {
        this.accountRefundId = accountRefundId;
    }

    public String getAccountChangeId() {
        return accountChangeId;
    }

    public void setAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
    }

    public String getChangeMemo() {
        return changeMemo;
    }

    public void setChangeMemo(String changeMemo) {
        this.changeMemo = changeMemo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
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
        AccountRefund other = (AccountRefund) that;
        return (this.getAccountRefundId() == null ? other.getAccountRefundId() == null : this.getAccountRefundId().equals(other.getAccountRefundId())) && (this.getAccountChangeId() == null ?
                other.getAccountChangeId() == null :
                this.getAccountChangeId().equals(other.getAccountChangeId())) && (this.getChangeValue() == null ? other.getChangeValue() == null : this.getChangeValue().equals(other.getChangeValue()))
               && (this.getChangeMemo() == null ? other.getChangeMemo() == null : this.getChangeMemo().equals(other.getChangeMemo())) && (this.getMemberId() == null ?
                other.getMemberId() == null :
                this.getMemberId().equals(other.getMemberId())) && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId())) && (
                       this.getSaleOrderId() == null ? other.getSaleOrderId() == null : this.getSaleOrderId().equals(other.getSaleOrderId())) && (this.getRefundOrderId() == null ?
                other.getRefundOrderId() == null :
                this.getRefundOrderId().equals(other.getRefundOrderId())) && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime())) && (
                       this.getUpdateTime() == null ?
                               other.getUpdateTime() == null :
                               this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountRefundId() == null) ? 0 : getAccountRefundId().hashCode());
        result = prime * result + ((getAccountChangeId() == null) ? 0 : getAccountChangeId().hashCode());
        result = prime * result + ((getChangeValue() == null) ? 0 : getChangeValue().hashCode());
        result = prime * result + ((getChangeMemo() == null) ? 0 : getChangeMemo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getSaleOrderId() == null) ? 0 : getSaleOrderId().hashCode());
        result = prime * result + ((getRefundOrderId() == null) ? 0 : getRefundOrderId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountRefundId=").append(accountRefundId);
        sb.append(", accountChangeId=").append(accountChangeId);
        sb.append(", changeValue=").append(changeValue);
        sb.append(", changeMemo=").append(changeMemo);
        sb.append(", memberId=").append(memberId);
        sb.append(", accountId=").append(accountId);
        sb.append(", saleOrderId=").append(saleOrderId);
        sb.append(", refundOrderId=").append(refundOrderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
