package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author poi 2020/12/27 12:08
 * @version 1.0
 * 2020/12/27 12:08
 */
@Mapper
public interface StorageDao {


    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
