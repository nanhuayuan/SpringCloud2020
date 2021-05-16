package com.atguigu.springcloud.alibaba.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author poi 2021/5/16 23:13
 * @version 1.0
 * 2021/5/16 23:13
 */
@Slf4j
@Component
public class IdSnowflake {
    private long workerId = 0;
    private long ddtacenterId = 1;
    private Snowflake snowflake =IdUtil.createSnowflake(workerId,ddtacenterId);

    @PostConstruct
    public void  init(){
        try {
            workerId = NetUtil.ipv4ToLong(NetUtil.getLocalHostStr());
            log.info("当前机器的workerIdId:{}",workerId);
        }catch (Exception e){
            e.printStackTrace();
            log.warn("当前机器的workerId获取失败");
            workerId = NetUtil.getLocalHostStr().hashCode();
        }
    }

    public synchronized long snowflake(){
        return snowflake.nextId();
    }

    public synchronized long snowflake(long workerId,long ddtacenterId){
        Snowflake snowflake =IdUtil.createSnowflake(workerId,ddtacenterId);
        return snowflake.nextId();
    }

}
