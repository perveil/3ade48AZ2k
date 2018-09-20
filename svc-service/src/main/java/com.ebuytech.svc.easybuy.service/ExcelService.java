package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.dto.Daily;
import com.ebuytech.svc.easybuy.dto.Monthly;
import com.ebuytech.svc.easybuy.dto.Weekly;

import java.util.List;

public interface ExcelService {
        String createDayChargeExcel(String day); //充值日报
        String createWeekChargeExcel(); //充值周报
        String createMonthChargeExcel(); //充值月报

        String createDaySaleExcel(); //门店消费日报
        String createWeekSaleExcel(); //门店消费周报
        String createMonthSaleExcel(); //门店消费月报

        List<Daily>  getDaily(int pageNum, int pageSize);
        List<Weekly>  getWeekly(int pageNum, int pageSize);
        List<Monthly>  getMonthly(int pageNum, int pageSize);

}
