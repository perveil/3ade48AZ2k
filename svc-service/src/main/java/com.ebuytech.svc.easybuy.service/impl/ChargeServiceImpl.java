package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.util.TradeNoUtil;
import com.ebuytech.svc.easybuy.util.WXPayUtil;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayOrderCloseResult;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service @Slf4j @Transactional public class ChargeServiceImpl implements IChargeService {
    @Resource WxPayService wxPayService;

    @Resource AccountChangeDAO accountChangeDAO;

    @Override public List<Charge> queryChargeListByPage(int pageNum) {
        return null;
    }

    @Override public boolean addCharge(int chargeMoney, int actId, int validType, String validTime) {
        return false;
    }

    @Override public boolean createOrder(String body, Integer totalFee, String openId) {
        try {
            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            String tradeNo = TradeNoUtil.getTradeNo(15);
            orderRequest.setBody(body);
            orderRequest.setOutTradeNo(tradeNo);
            orderRequest.setTotalFee(totalFee);
            orderRequest.setOpenid(openId);
            orderRequest.setNotifyUrl("http://weiwei.ngrok.xiaomiqiu.cn/client/user/");
            // orderRequest.setSpbillCreateIp("");
            //  orderRequest.setTimeStart(String.valueOf(WXPayUtil.getCurrentTimestamp()));
            //  orderRequest.setTimeExpire();
            AccountChange accountChange = new AccountChange();
            accountChange.setAccountChangeId(tradeNo);
            accountChange.setChangeType("1");
            accountChange.setChangeValue(totalFee);
            accountChange.setStatus(2);
            accountChangeDAO.insertSelective(accountChange);
            return wxPayService.createOrder(orderRequest);
        } catch (WxPayException e) {
            log.error("微信支付失败 失败原因{}", e.getMessage());
            throw new ClientException(ResultEnums.PAY_FAIL);
        }
    }

    @Override public boolean payNotify(HttpServletRequest request) {
        try {
            String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
            WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(xmlResult);
            // 结果正确
            String accountChangeId = result.getOutTradeNo(); //商户订单号
            String transactionId = result.getTransactionId();//  微信支付订单号

            return true;
        } catch (Exception e) {
            log.error("回调异常,异常原因{}", e.getMessage());
            throw new ClientException(ResultEnums.WXPAY_CALLBACK_ANOMALY);
        }
    }

    @Override public boolean closeOrder(String outTradeNo) {
        try {
            WxPayOrderCloseResult orderCloseResult = wxPayService.closeOrder(outTradeNo);
            log.info("结果信息{}", orderCloseResult.getResultMsg());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
