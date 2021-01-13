package com.zjx.learn.site.controller;

import com.zjx.learn.dataBase.FxTest;
import com.zjx.learn.dataBase.IndexTest;
import com.zjx.learn.log.LogTest;
import com.zjx.learn.site.dao.FakeIndexTest;
import com.zjx.returnResult.ReturnResult;
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
    public final FxTest fxTest;
    public final LogTest logTest;
    public final FakeIndexTest fakeIndexTest;
    public final IndexTest indexTest;

    public SiteController(LogTest logTest, FakeIndexTest fakeIndexTest, IndexTest indexTest, FxTest fxTest) {
        this.logTest = logTest;
        this.fakeIndexTest = fakeIndexTest;
        this.indexTest = indexTest;
        this.fxTest = fxTest;
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
    public ReturnResult<String> fake() {
        return fakeIndexTest.fake();
    }

    @GetMapping("indexTest")
    public String indexTest() {
        indexTest.createIndex();
        return "success";
    }

    @GetMapping("pxTest")
    public String pxTest() {
        fxTest.fxTest();
        return "success";
    }
}
