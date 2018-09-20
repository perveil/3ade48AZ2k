package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChargeDAO;
import com.ebuytech.svc.easybuy.dto.*;
import com.ebuytech.svc.easybuy.service.ExcelService;
import com.ebuytech.svc.easybuy.utils.PoiUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ExcelServiceImpl implements ExcelService {
    final private String [] ChargeSheetOne={"时间","面值","充值笔数","充值金额","赠送金额"}; //充值金额第一个sheet
    final private String [] ChargeSheetTwo={"充值日期","充值时间","交易流水号","订单号","用户ID","用户手机号","在线充值","充值金额","赠送金额","支付渠道", "支付流水号","支付方式"};//充值金额第二个sheet

    final  private String path="D:\\excel\\Excel"; //默认路径

    @Autowired
     private AccountChargeDAO accountChargeDAO;

    @Override
    public String  createDayChargeExcel(String day) {
        String  def="";
        if (day==null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String time = format.format(Calendar.getInstance().getTime());
            def=path+"\\日报"+time+".xlsx";
        }else{
              def=day;
        }
        HSSFWorkbook workbook = new HSSFWorkbook();
        List<Daily>  dailies=accountChargeDAO.getDaily();
        List<DailyT>  dailiTes=accountChargeDAO.getDailyT();
        PoiUtils.CreateExcel(workbook,dailies,ChargeSheetOne,"按面值统计");
        PoiUtils.CreateExcel(workbook,dailiTes,ChargeSheetTwo,"按面值统计");
        try {
            File newFile=new File(def);
            if (!newFile.exists()){
                newFile.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(newFile);
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return def;
    }

    @Override
    public  String createWeekChargeExcel() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String time = format.format(Calendar.getInstance().getTime())+"第"+ Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)+"周"; //获得本日所在的周数
        String def=path+"\\周报"+time+".xlsx";
        HSSFWorkbook workbook = new HSSFWorkbook();
        List<Weekly>  dailies=accountChargeDAO.getWeekly();
        List<WeeklyT>  dailiTes=accountChargeDAO.getWeeklyT();
        PoiUtils.CreateExcel(workbook,dailies,ChargeSheetOne,"按面值统计");
        PoiUtils.CreateExcel(workbook,dailiTes,ChargeSheetTwo,"按面值统计");
        try {
            File newFile=new File(def);
            if (!newFile.exists()){
                newFile.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(newFile);
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return def;
    }

    @Override
    public  String createMonthChargeExcel() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String time = format.format(Calendar.getInstance().getTime())+"-"+ Calendar.getInstance().get(Calendar.MONTH)+"月"; //获得当前月
        String def=path+"\\月报"+time+".xlsx";
        HSSFWorkbook workbook = new HSSFWorkbook();
        List<Monthly>  dailies=accountChargeDAO.getMonthly();
        List<MonthlyT>  dailiTes=accountChargeDAO.getMonthlyT();
        PoiUtils.CreateExcel(workbook,dailies,ChargeSheetOne,"按面值统计");
        PoiUtils.CreateExcel(workbook,dailiTes,ChargeSheetTwo,"按面值统计");
        try {
            File newFile=new File(def);
            if (!newFile.exists()){
                newFile.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(newFile);
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
       return def;

    }

    @Override
    public  String createDaySaleExcel() {
       return "";
    }

    @Override
    public  String createWeekSaleExcel() {
     return "";
    }

    @Override
    public  String createMonthSaleExcel() {
       return "";
    }

    @Override
    public List<Daily> getDaily(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Weekly> getWeekly(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Monthly> getMonthly(int pageNum, int pageSize) {
        return null;
    }

}
