package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.service.IGiftService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by HYS on 2018/9/16.
 */
@Service
@Slf4j
public class GiftServiceImpl implements IGiftService {


    @Override public boolean uploadIcon(MultipartFile file, String path) {

        try{

            byte[] bytes = file.getBytes();
            Path path1 = Paths.get(path);
            Files.write(path1,bytes);
        }catch (IOException e){
            log.error("[文件上传]传输错误e={},path={}",e,path);
            return false;
        }
        return true;
    }

    @Override public boolean createGift(String accountId, String memberId, String valueCardId, int money, String endTime, int status, String imgUrl) {
        return false;
    }

}
