package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import com.ebuytech.svc.easybuy.vo.ChangeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric3 on 2018/9/15.
 */
@RestController @RequestMapping("/change") public class ChangeController {

    @Autowired IChangeService changeService;


    @RequestMapping("/queryChangeListByPage")
    @ResponseBody
    Res<ChangeVO> queryChangeListByPage(int pageNum) {
        return ResUtil.success(changeService.queryChangeListByPage(pageNum));
    }
}
