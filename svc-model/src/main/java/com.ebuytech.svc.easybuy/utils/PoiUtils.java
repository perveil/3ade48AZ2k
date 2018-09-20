package com.ebuytech.svc.easybuy.utils;


import com.ebuytech.svc.easybuy.dto.BaseC.Base;
import com.ebuytech.svc.easybuy.dto.Daily;
import com.ebuytech.svc.easybuy.dto.DailyT;
import com.ebuytech.svc.easybuy.entity.Account;
import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PoiUtils<T> {
    /*
    * 通过反射拿到所有的field
    * */
    public static ArrayList<String> getKey(Class<?> objClass){
        Field[] fields  =objClass.getDeclaredFields();
        ArrayList<String> aimList=new ArrayList<>();
        for(Field field : fields){
            String fieldName =  field.getName();
            aimList.add(fieldName);
        }
        return aimList;
    }
    public static Object getValueByFieldName(String fieldName,Object object){
        String firstLetter=fieldName.substring(0,1).toUpperCase();
        String getter = "get"+firstLetter+fieldName.substring(1);
        try {
            Method method = object.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(object, new Object[] {});
            return value;
        }catch (Exception e){
            return null;
        }
    }
    public static <T> void CreateExcel(HSSFWorkbook workbook,List<T> Entitylist,String [] titles,String sheetName){
         ArrayList<String> keys=getKey(Entitylist.get(0).getClass().getSuperclass()); //获取到所有的key值
         int columnSize=keys.size();  //获取到列数
         int size=Entitylist.size(); //获取到行数
         HSSFSheet sheet = workbook.createSheet(sheetName);
         HSSFRow[] row = new HSSFRow[size+1];
         HSSFCell[] cell = new HSSFCell[columnSize];
         HSSFCellStyle cellStyle= workbook.createCellStyle();
         //字体
         HSSFFont font = workbook.createFont();
         font.setFontName("宋体");
         cellStyle.setFont(font);
         row[0] = sheet.createRow(0);
         /*
         * 写入表头
         * */
         for(int i=0;i<columnSize;i++){
            cell[i] = row[0].createCell((short)i);
            cell[i].setCellStyle(cellStyle);
            cell[i].setCellValue(titles[i]);
         }
         for(int j=1;j<size+1;j++){
             row[j] = sheet.createRow(j);
             for(int i=0;i<columnSize;i++){
                 cell[i] = row[j].createCell((short)i);
                 if (getValueByFieldName(keys.get(i),Entitylist.get(j ))==null){
                     cell[i].setCellValue("");
                 }else {
                     cell[i].setCellValue(String.valueOf(getValueByFieldName(keys.get(i),Entitylist.get(j ))));
                 }

             }
         }
    }
        public static void main(String[] args) throws ParseException{
            String path =""; //用日期拼接
            String [] title={"时间","面值","充值笔数","充值金额","赠送金额"};
            String [] title2={"充值日期","充值时间","交易流水号","订单号","用户ID","用户手机号","在线充值","充值金额","赠送金额","支付渠道", "支付流水号","支付方式"};
            HSSFWorkbook workbook = new HSSFWorkbook();
            Daily daily  =new Daily("asd",12,12,111,111);
            Daily daily2  =new Daily("asd",12,12,111,111);
            Daily daily3  =new Daily("asd",12,12,111,111);
            Daily daily4  =new Daily("asd",12,12,111,111);
            List<Daily> dailies=new ArrayList<>();
            dailies.add(daily);
            dailies.add(daily2);
            dailies.add(daily3);
            dailies.add(daily4);

          List<DailyT> dailyTList=new ArrayList<>();


            CreateExcel(workbook,dailies,title,"按面值统计");
//            CreateExcel(workbook,dailyTList,title2,"按面值统计");
         //  System.out.println(getValueByFieldName("group",daily));
         // System.out.println(getKey( Daily.class.getSuperclass()));
            try {
                File newFile=new File(path);
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



    }

}
