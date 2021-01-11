package com.zjx.learn.site.dao;

import com.github.javafaker.Faker;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Locale;
import java.util.UUID;

/**
 * @program: learn
 * @description 为indexTest表造假数据
 * @author: zhujingxing
 * @create: 2021-01-11 17:20
 **/
@Repository
public class FakeIndexTest {
    public final JdbcTemplate jdbcTemplate;

    public FakeIndexTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String fake() {
        Faker faker = new Faker(Locale.CHINA);
        String s;
        for (int i = 0; i <= 10; i++){
            s = "'" + UUID.randomUUID() + "','" + faker.name() +"','" +faker.phoneNumber() +"'";
            jdbcTemplate.execute("insert into indexTest (uuid,name,phone) values (" + s + ")");
        }
        return "success";
    }
}
