package com.ebuytech.svc.easybuy.dto.BaseC;

public class Base {
    protected    String  group;
    protected  Integer changeValue;
    protected   Integer totalNum;
    protected   Integer extraTotalValue;
    protected  Integer changeTotalValue;

    public Base(String group, Integer changeValue, Integer totalNum, Integer extraTotalValue, Integer changeTotalValue){
        this.group=group;
        this.changeValue=changeValue;
        this.totalNum=totalNum;
        this.extraTotalValue=extraTotalValue;
        this.changeTotalValue=changeTotalValue;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getExtraTotalValue() {
        return extraTotalValue;
    }

    public void setExtraTotalValue(Integer extraTotalValue) {
        this.extraTotalValue = extraTotalValue;
    }

    public Integer getChangeTotalValue() {
        return changeTotalValue;
    }

    public void setChangeTotalValue(Integer changeTotalValue) {
        this.changeTotalValue = changeTotalValue;
    }
}
