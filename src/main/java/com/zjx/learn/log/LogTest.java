package com.zjx.learn.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description
 * @author: zhujingxing
 * @create: 2021-01-11 13:45
 **/
@Component
public class LogTest {
    public Logger logger = LoggerFactory.getLogger(LogTest.class);
}
