package com.ebuytech.svc.easybuy.web.controller.file;


import com.ebuytech.svc.easybuy.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Excel")
public class ExcelController {
    @Autowired
    private ExcelService excelService;

    /*
    * day格式 20180916
    * */

    @PostMapping("/dayChargeExcel")
    public String dayChargeExcel(String day){
        return   excelService.createDayChargeExcel();
    }
}
