package com.zjx.learn.site.controller;

import com.zjx.learn.log.LogTest;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: learn
 * @description
 * @author: zhujingxing
 * @create: 2021-01-11 13:33
 **/
@RestController
public class SiteController {
    final
    LogTest logTest;

    public SiteController(LogTest logTest) {
        this.logTest = logTest;
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("logTest")
    public void logTest() {
        logTest.logger.error("aaaa");
        Logger logger = logTest.logger;
        System.out.println(logger.getClass());
        System.out.println("aaa");
    }
}
