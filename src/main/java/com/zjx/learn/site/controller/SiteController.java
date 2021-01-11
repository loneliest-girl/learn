package com.zjx.learn.site.controller;

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

    @GetMapping("test")
    public String test() {
        return "test";
    }
}
