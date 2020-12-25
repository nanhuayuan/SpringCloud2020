package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author poi 2020/12/21 1:02
 * @version 1.0
 * 2020/12/21 1:02
 */
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById( Long id);  //读取
}
