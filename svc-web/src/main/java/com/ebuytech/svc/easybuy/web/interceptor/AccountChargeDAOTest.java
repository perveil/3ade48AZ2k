package com.ebuytech.svc.easybuy.web.interceptor;

import com.ebuytech.svc.easybuy.dao.AccountChargeDAO;
import com.ebuytech.svc.easybuy.dto.Daily;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.web.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppConfig.class)
public class AccountChargeDAOTest {
    @Autowired
    private AccountChargeDAO  iChargeDao;
    @Test
    public void getDaily() {

        // iChargeDao.getDaily();
         System.out.println( iChargeDao.getDaily());
    }

    @Test
    public void getMonthly() {
        System.out.println( iChargeDao.getMonthlyT());
    }

    @Test
    public void getWeekly() {
    }
}