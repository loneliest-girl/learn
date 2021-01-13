package com.zjx.learn.site.dao;

import com.github.javafaker.Faker;
import com.zjx.returnResult.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public final JdbcTemplate jdbcTemplate;

    public FakeIndexTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public ReturnResult<String> fake() {
        try {
            Faker faker = new Faker(Locale.CHINA);
            String s;
            for (long i = 0; i <= 1000; i++){
                s = "'" + UUID.randomUUID() + "','" + faker.name().name() +"','" +faker.phoneNumber().cellPhone() +"'";
                jdbcTemplate.execute("insert into indexTest (id,name,phone) values (" + s + ")");
            }
            return new ReturnResult<>("success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ReturnResult<>("error");
        }
    }
}
