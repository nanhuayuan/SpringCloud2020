package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author poi 2020/12/27 12:07
 * @version 1.0
 * 2020/12/27 12:07
 */

@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}