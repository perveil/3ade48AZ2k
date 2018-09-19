package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.service.IActivityService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import com.ebuytech.svc.easybuy.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HYS on 2018/9/15.
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired IActivityService activityService;

    @PostMapping("/getActivityList")
    public Res<PageVO<Activity>> getActivityList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                 @RequestParam(value = "size",defaultValue = "10")int size){

        if (size < 1)
            return ResUtil.error(1,"页面数据设置错误");
        pageNum -= 1;
        PageVO<Activity> pageVO = activityService.queryActivityListByPage(pageNum,size);

        return ResUtil.success().setData(pageVO);
    }

    @PostMapping("/selectActivityById")
    public Res selectActivityById(int actId){

        Activity activity = activityService.queryActivityByPrimaryKey(actId);
        if (activity == null)
            return ResUtil.error(1,"查询的id不存在");

        return ResUtil.success().setData(activity);
    }

    @PostMapping("/updateActivityStatus")
    public Res updateActivityStatus(int actId,int status){

        if (!activityService.updateActivityStatus(actId,status))
            return ResUtil.error(1,"修改错误");

        return ResUtil.success().setMsg("操作成功");
    }

    @PostMapping("/updateActivityAll")
    public Res updateActivityAll(int actId, int actType, String startTime, String endTime, int actMoney, int cntType, int status, int actCount, String cntInfo)
    {
        if (activityService.updateActivityById(actId,actType,startTime,endTime,actMoney,cntType,status,actCount,cntInfo))
            return ResUtil.error(1,"更新失败");

        return ResUtil.success().setMsg("更新成功");
    }


}
