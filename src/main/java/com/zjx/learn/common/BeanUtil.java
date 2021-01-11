package com.zjx.learn.common;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: learn
 * @description
 * @author: zhujingxing
 * @create: 2021-01-11 18:01
 **/
public class BeanUtil {
    public static ConfigurableApplicationContext run;
    public static <T>T getBean(Class<T> c) {
        return run.getBean(c);
    }
}
