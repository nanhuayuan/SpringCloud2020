package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author poi 2020/12/23 21:14
 * @version 1.0
 * 2020/12/23 21:14
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}