package com.atguigu.springcloud.payment8002.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.atguigu.springcloud.payment8002.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author poi 2020/12/21 1:05
 * @version 1.0
 * 2020/12/21 1:05
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String servicePort;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        //int result = paymentService.create(payment);
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功" + servicePort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功" + servicePort, payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return servicePort;
    }
}
