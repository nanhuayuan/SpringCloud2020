package com.atguigu.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author poi 2020/12/26 23:38
 * @version 1.0
 * 2020/12/26 23:38
 */

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息....CustomerBlockHandler");

    }
}
