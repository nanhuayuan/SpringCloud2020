package com.atguigu.springcloud.alibaba;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author poi 2021/5/16 22:59
 * @version 1.0
 * 2021/5/16 22:59
 */
public class IDDemo {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        int length = "11111111111111111111111111111111111111111".length();
        System.out.println(length);
        long time = 2199023255551L;

        Date date = new Date();
        date.setTime(time);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(format);



    }
}
