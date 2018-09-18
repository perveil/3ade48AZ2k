package com.ebuytech.svc.easybuy.web.handle;

import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Component @ControllerAdvice @Slf4j public class ExceptionHandlers {

    @ExceptionHandler(value = AdminException.class) @ResponseBody public Res AdminHandle(Exception e) {
        if (e instanceof AdminException) {
            AdminException lockersException = (AdminException) e;
            log.error(String.valueOf(lockersException.getCode()) + "   " + String.valueOf(lockersException.getMessage()));
            return ResUtil.error(lockersException.getCode(), lockersException.getMessage());
        } else {
            log.error("【系统异常】：{}", e);
            return ResUtil.error(-1, "未知错误");
        }

    }

    @ExceptionHandler(value = ClientException.class) @ResponseBody public Res ClientHandle(Exception e) {
        if (e instanceof ClientException) {
            ClientException socketException = (ClientException) e;
            log.error("【小程序异常】：{}", e);
            return ResUtil.error(socketException.getCode(), socketException.getMessage());
        } else {
            log.error("【小程序异常】：{}", e);
            return ResUtil.error(-1, "未知错误");
        }

    }

    @ExceptionHandler(value = Exception.class) @ResponseBody public Res socketHandle(Exception e) {
        log.error("【系统异常】：{}", e);
        return ResUtil.error(-1, e.getMessage());
    }
}
