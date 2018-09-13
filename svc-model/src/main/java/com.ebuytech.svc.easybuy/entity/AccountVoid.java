package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * account_void
 * @author 
 */
public class AccountVoid implements Serializable {
    /**
     * 主键
     */
    private String accountVoidId;

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
     * 撤销订单号
     */
    private String voidOrderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAccountVoidId() {
        return accountVoidId;
    }

    public void setAccountVoidId(String accountVoidId) {
        this.accountVoidId = accountVoidId;
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

    public String getVoidOrderId() {
        return voidOrderId;
    }

    public void setVoidOrderId(String voidOrderId) {
        this.voidOrderId = voidOrderId;
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
        AccountVoid other = (AccountVoid) that;
        return (this.getAccountVoidId() == null ? other.getAccountVoidId() == null : this.getAccountVoidId().equals(other.getAccountVoidId()))
            && (this.getChangeValue() == null ? other.getChangeValue() == null : this.getChangeValue().equals(other.getChangeValue()))
            && (this.getChangeMemo() == null ? other.getChangeMemo() == null : this.getChangeMemo().equals(other.getChangeMemo()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getSaleOrderId() == null ? other.getSaleOrderId() == null : this.getSaleOrderId().equals(other.getSaleOrderId()))
            && (this.getVoidOrderId() == null ? other.getVoidOrderId() == null : this.getVoidOrderId().equals(other.getVoidOrderId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountVoidId() == null) ? 0 : getAccountVoidId().hashCode());
        result = prime * result + ((getChangeValue() == null) ? 0 : getChangeValue().hashCode());
        result = prime * result + ((getChangeMemo() == null) ? 0 : getChangeMemo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getSaleOrderId() == null) ? 0 : getSaleOrderId().hashCode());
        result = prime * result + ((getVoidOrderId() == null) ? 0 : getVoidOrderId().hashCode());
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
        sb.append(", accountVoidId=").append(accountVoidId);
        sb.append(", changeValue=").append(changeValue);
        sb.append(", changeMemo=").append(changeMemo);
        sb.append(", memberId=").append(memberId);
        sb.append(", accountId=").append(accountId);
        sb.append(", saleOrderId=").append(saleOrderId);
        sb.append(", voidOrderId=").append(voidOrderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}