package com.zjx.learn;

import com.zjx.learn.common.BeanUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LearnApplication.class, args);
        BeanUtil.run = run;
    }
}
