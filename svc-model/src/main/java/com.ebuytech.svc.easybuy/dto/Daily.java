package com.ebuytech.svc.easybuy.dto;

import com.ebuytech.svc.easybuy.dto.BaseC.Base;

public class Daily extends Base {

    public Daily(String  group,Integer changeValue,Integer totalNum,Integer extraTotalValue,Integer changeTotalValue){
        super(group,changeValue,totalNum,extraTotalValue,changeTotalValue);
    }
    @Override
    public String toString() {
        return "Daily{" +
                "group='" + group + '\'' +
                ", changeValue=" + changeValue +
                ", totalNum=" + totalNum +
                ", extraTotalValue=" + extraTotalValue +
                ", changeTotalValue=" + changeTotalValue +
                '}';
    }
}
//class WeeklyTest extends Base{
////    public  WeeklyTest(String  group,Integer changeValue,Integer totalNum,Integer extraTotalValue,Integer changeTotalValue){
////        super(group,changeValue,totalNum,extraTotalValue,changeTotalValue);
////    }
////}
