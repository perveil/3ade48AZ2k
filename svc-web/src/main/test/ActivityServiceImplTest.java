import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.service.IActivityService;
import com.ebuytech.svc.easybuy.vo.PageVO;
import com.ebuytech.svc.easybuy.web.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HYS on 2018/9/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfig.class)
public class ActivityServiceImplTest {

    @Autowired IActivityService activityService;

    @Test public void addActivity() throws Exception {

        assert activityService.addActivity(0,1,1,"送500",500,
                90,"2018-09-15","2018-9-16");

    }

    @Test
    public void Activity()throws Exception{

        PageVO<Activity> activityPageVO = activityService.queryActivityListByPage(1,2);
        List<Activity> activities = activityPageVO.getList();
        for (Activity activity : activities)
            System.out.println(activity.toString());
        assertNotEquals(activityPageVO.getList().size(),0);
    }

    @Test
    public void updateActivity()throws Exception{

        assert activityService.updateActivityById(1,0,"2018-20-0","2018",90,0,1,90,"满500减500");
    }

}
