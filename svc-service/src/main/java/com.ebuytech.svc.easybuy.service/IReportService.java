package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.ReportCharge;
import com.ebuytech.svc.easybuy.entity.ReportSale;

import java.util.List;

public interface IReportService {

    /**
     * laiso
     * 根据查询的日期返回充值报表
     *
     * @param date
     * @return
     */
    ReportCharge queryChargeByDate(String date);

    /**
     * 分页获取充值报表记录
     *
     * @param pageNum
     * @return
     */
    List<ReportCharge> queryChargeReportByPage(int pageNum);

    /**
     * laiso
     * 根据查询的日期返回消费报表
     *
     * @param date
     * @return
     */
    ReportSale querySaleByDate(String date);

    /**
     * 分页获取消费报表记录
     *
     * @param pageNum
     * @return
     */
    List<ReportSale> querySaleReportByPage(int pageNum);

    /**
     * laiso
     * 生成充值报表表格文件
     */
    void genChargeReport();

    /**
     * laiso
     * 生成消费报表表格文件
     */
    void genSaleReport();
}
