package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * report_sale
 *
 * @author
 */
public class ReportSale implements Serializable {
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
    private Integer saleCount;

    /**
     * 充值总金额
     */
    private Integer saleTotal;

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

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Integer saleTotal) {
        this.saleTotal = saleTotal;
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
        ReportSale other = (ReportSale) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate())) && (
                this.getSaleCount() == null ?
                        other.getSaleCount() == null :
                        this.getSaleCount().equals(other.getSaleCount())) && (this.getSaleTotal() == null ? other.getSaleTotal() == null : this.getSaleTotal().equals(other.getSaleTotal())) && (
                       this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime())) && (this.getUpdateTime() == null ?
                other.getUpdateTime() == null :
                this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getSaleCount() == null) ? 0 : getSaleCount().hashCode());
        result = prime * result + ((getSaleTotal() == null) ? 0 : getSaleTotal().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", saleCount=").append(saleCount);
        sb.append(", saleTotal=").append(saleTotal);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
