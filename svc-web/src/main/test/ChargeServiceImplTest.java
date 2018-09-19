import com.alibaba.druid.support.json.JSONUtils;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.vo.PageVO;
import com.ebuytech.svc.easybuy.web.AppConfig;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

/**
 * Created by HYS on 2018/9/15.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfig.class)
@Slf4j
public class ChargeServiceImplTest {

    @Autowired
    private IChargeService chargeService;

    @Test
    public void addCharge() throws Exception {
        assert chargeService.addCharge(400,2,1,"2018-9-15",0,0);
    }

    @Test
    public void queryCharge() throws Exception{

        PageVO pageVO = chargeService.queryChargeListByPage(0,10);

        assert pageVO.getList().size() > 0;
    }

    @Test
    public void updateIsValid()throws Exception{

        assert chargeService.updateChargeisValidById(1,1);

    }

}
