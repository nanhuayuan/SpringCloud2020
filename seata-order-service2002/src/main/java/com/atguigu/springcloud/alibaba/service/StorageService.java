package com.atguigu.springcloud.alibaba.service;

/**
 * @author poi 2020/12/27 12:11
 * @version 1.0
 * 2020/12/27 12:11
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
