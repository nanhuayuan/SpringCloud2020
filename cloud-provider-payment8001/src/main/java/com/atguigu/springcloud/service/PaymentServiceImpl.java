package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author poi 2020/12/21 1:03
 * @version 1.0
 * 2020/12/21 1:03
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        //return paymentDao.create(payment);
        return paymentDao.insert(payment);
    }
    @Override
    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }

}
