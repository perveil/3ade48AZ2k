package com.ebuytech.svc.easybuy.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.dao.AccountChargeDAO;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountCharge;
import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.util.TradeNoUtil;
import com.ebuytech.svc.easybuy.util.WXPayUtil;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayRefundRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayOrderCloseResult;
import com.github.binarywang.wxpay.bean.result.WxPayRefundResult;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service @Slf4j @Transactional public class ChargeServiceImpl implements IChargeService {
    @Resource WxPayService wxPayService;

    @Resource AccountChangeDAO accountChangeDAO;

    @Resource AccountChargeDAO accountChargeDAO;

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
            AccountChange accountChange = new AccountChange();
            accountChange.setAccountChangeId(tradeNo);
            accountChange.setChangeType("1");
            accountChange.setChangeValue(totalFee);
            accountChange.setStatus(2);
            accountChangeDAO.insertSelective(accountChange);
            //  WxPayUnifiedOrderResult wxPayUnifiedOrderResult = wxPayService.unifiedOrder(orderRequest);
            return wxPayService.createOrder(orderRequest);
        } catch (WxPayException e) {
            log.error("微信支付失败 失败原因{}", e.getMessage());
            throw new ClientException(ResultEnums.PAY_FAIL);
        }
    }

    @Override public WxPayUnifiedOrderResult unifiedOrder(String body, Integer totalFee, String accountId) {
        try {
            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            String accountChangeId = TradeNoUtil.getTradeNo(15);
            String accountChargeId = TradeNoUtil.getRandomNo(10);
            orderRequest.setBody(body);
            orderRequest.setOutTradeNo(accountChangeId);
            orderRequest.setTotalFee(totalFee);
            orderRequest.setNotifyUrl("http://weiwei.ngrok.xiaomiqiu.cn/client/payConfirm");

            AccountChange accountChange = new AccountChange();
            AccountCharge accountCharge = new AccountCharge();
            accountCharge.setAccountChangeId(accountChangeId);
            accountCharge.setAccountChargeId(accountChargeId);


            accountChange.setAccountChangeId(accountChangeId);
            accountChange.setChangeType("1");
            accountChange.setChangeValue(totalFee);
            accountChange.setStatus(2);
            accountChangeDAO.insertSelective(accountChange);
            accountChargeDAO.insertSelective(accountCharge);

            WxPayUnifiedOrderResult wxPayUnifiedOrderResult = wxPayService.createOrder(orderRequest);
            log.info("返回信息{}", wxPayUnifiedOrderResult);
            return wxPayUnifiedOrderResult;
        } catch (Exception e) {
            log.error("支付失败原因{}", e.getMessage());
            throw new ClientException(ResultEnums.PAY_FAIL);
        }
    }

    @Override public boolean payNotify(HttpServletRequest request) {
        try {
            String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
            WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(xmlResult);
            // 结果正确
            String accountChangeId = result.getOutTradeNo(); // 商户订单号
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

    @Override public boolean refundOrder(String accountId, String accountChangeId) {
        try {
            WxPayRefundRequest refundRequest = new WxPayRefundRequest();
            WxPayRefundResult refundResult = wxPayService.refund(refundRequest);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    @Override public String payConfirm(HttpServletRequest request) {
        try {
            String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
            WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(xmlResult);
            // 结果正确
            String accountChangeId = result.getOutTradeNo(); //商户订单号
            String transactionId = result.getTransactionId();//  微信支付订单号

            AccountChange accountChange = new AccountChange();
            accountChange.setAccountChangeId(accountChangeId);
            accountChange.setStatus(0);
            accountChangeDAO.updateByPrimaryKey(accountChange);

            HashMap<String, String> res = new HashMap<>();
            res.put("return_code", "SUCCESS");
            res.put("return_msg", "OK");
            return WXPayUtil.mapToXml(res);
        } catch (Exception e) {

            log.error("回调异常,异常原因{}", e.getMessage());
            throw new ClientException(ResultEnums.WXPAY_CALLBACK_ANOMALY);
        }
    }

}
