package com.ebuytech.svc.easybuy.utils;


import com.ebuytech.svc.easybuy.entity.Account;
import org.apache.poi.hssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PoiUtils<T> {
    private T Object;
    /*
    * 通过反射拿到所有的field
    * */
    public static ArrayList<String> getKey(Object obj){
        Field[] fields  =obj.getClass().getDeclaredFields();
        ArrayList<String> aimList=new ArrayList<>();
        for(Field field : fields){
            String fieldName =  field.getName();
            aimList.add(fieldName);
        }
        return aimList;
    }
    private static Object getValueByFieldName(String fieldName,Object object){
        String firstLetter=fieldName.substring(0,1).toUpperCase();
        String getter = "get"+firstLetter+fieldName.substring(1);
        try {
            Method method = object.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(object, new Object[] {});
            if(value.getClass().equals(Date.class)){
                Date date =  new Date(((Date)value).getTime());
                SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return time.format(date);
            }
            return value;
        }catch (Exception e){
            return null;
        }
    }
    private static <T> void CreateExcel(List<T> Entitylist,String path){
         ArrayList<String> keys=getKey(Entitylist.get(0)); //获取到所有的key值
         int columnSize=keys.size();  //获取到列数
         int size=Entitylist.size(); //获取到行数
         HSSFWorkbook workbook = new HSSFWorkbook();
         HSSFSheet sheet = workbook.createSheet(Entitylist.get(0).getClass().getName());
         HSSFRow[] row = new HSSFRow[size];
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
            cell[i].setCellValue(keys.get(i));
         }
         for(int j=1;j<=size;j++){ //???
             row[j] = sheet.createRow(j);
             for(int i=0;i<columnSize;i++){
                 cell[i] = row[j].createCell((short)i);
                 if (getValueByFieldName(keys.get(i),Entitylist.get(j-1 ))==null){
                     cell[i].setCellValue("");
                 }else {
                     cell[i].setCellValue(String.valueOf(getValueByFieldName(keys.get(i),Entitylist.get(j-1 ))));
                 }

             }
         }
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
        public static void main(String[] args) throws ParseException {
//          System.out.println(getKey(new Account()));
            Calendar  calendar = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            calendar.setTime(format.parse("2018-09-14 17:36:48"));
            int week = calendar.get(Calendar.WEEK_OF_YEAR);
//            int year = calendar.get(Calendar.YEAR);
//            int month = calendar.get(Calendar.MONTH) + 1;
          //  calendar.set(new Date("2018-09-14 17:36:48").getYear(), new Date("2018-09-14 17:36:48").getMonth(), new Date("2018-09-14 17:36:48").getDay());
          System.out.println(calendar.getWeeksInWeekYear());
          System.out.println(week);
       //   System.out.println(calendar);




    }

}
