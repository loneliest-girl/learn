package com.zjx.learn.site.controller;

import com.zjx.learn.log.LogTest;
import com.zjx.learn.site.dao.FakeIndexTest;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: learn
 * @description
 * @author: zhujingxing
 * @create: 2021-01-11 13:33
 **/
@RestController
public class SiteController {
    public final LogTest logTest;
    public final FakeIndexTest fakeIndexTest;

    public SiteController(LogTest logTest,FakeIndexTest fakeIndexTest) {
        this.logTest = logTest;
        this.fakeIndexTest = fakeIndexTest;
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

    @GetMapping("fake")
    public String fake() {
        fakeIndexTest.fake();
        return "success";
    }
}
