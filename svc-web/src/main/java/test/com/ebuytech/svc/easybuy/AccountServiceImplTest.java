/*
package test.com.ebuytech.svc.easybuy;

import com.ebuytech.svc.easybuy.service.impl.AccountServiceImpl;
import com.ebuytech.svc.easybuy.vo.ChangeForm;
import com.ebuytech.svc.easybuy.vo.ChangeTransDTO;
import com.ebuytech.svc.easybuy.web.AppConfig;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

*/
/**
 * Created by Eric3 on 2018/9/18.
 *//*

@RunWith(SpringRunner.class) @SpringBootTest(classes = AppConfig.class)
@Slf4j
public class AccountServiceImplTest {

    @Autowired AccountServiceImpl accountService;

    @Test public void change() throws Exception {
        ChangeForm changeForm = new ChangeForm();
        changeForm.setPhone("13642168712");
        List<ChangeTransDTO> changeTransDTOList = accountService.change(changeForm);

        //log.info("e={}",changeTransDTO.toString());
        assert changeTransDTOList != null;

    }

}
*/
