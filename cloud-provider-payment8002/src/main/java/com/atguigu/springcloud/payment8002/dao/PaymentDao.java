package com.atguigu.springcloud.payment8002.dao;

import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author poi 2020/12/21 0:51
 * @version 1.0
 * 2020/12/21 0:51
 */
@Mapper
public interface PaymentDao extends BaseMapper<Payment> {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long Id);

}
