package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IGiftService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by HYS on 2018/9/16.
 */
@RestController
@RequestMapping("/gift")
@Slf4j
public class GiftController {

    @Autowired
    private IGiftService giftService;

    private final static String  PATH = "F:/pp/";


    @PostMapping("/upload")
    public Res upload(@RequestParam("file")MultipartFile file){


        if (file.isEmpty()){
            return ResUtil.error(1,"文件为空");
        }
        String path = PATH + file.getOriginalFilename();
        if (!giftService.uploadIcon(file,path)){
            return ResUtil.error(1,"上传失败");
        }
        return ResUtil.success(path);
    }
}
