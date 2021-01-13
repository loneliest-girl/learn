package com.zjx.learn.test;

import com.zjx.test.JarTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: learn
 * @description main方法，一些输出测试
 * @author: zhujingxing
 * @create: 2021-01-11 16:24
 **/
public class SopTest {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        System.out.println(new Date());
        Timestamp timestamp = new Timestamp(new Date().getTime());
        String s = timestamp.toString();
        System.out.println(s);
        System.out.println(new Timestamp(new Date().getTime()));
        System.out.println(new Date().getTime());
        System.out.println(JarTest.test());
    }
}
