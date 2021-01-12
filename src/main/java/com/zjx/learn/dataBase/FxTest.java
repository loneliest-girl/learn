package com.zjx.learn.dataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description 测试数据库函数
 * @author: zhujingxing
 * @create: 2021-01-12 16:39
 **/
@Component
public class FxTest {

    private final JdbcTemplate jdbcTemplate;

    public FxTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String fxTest() {
        jdbcTemplate.execute("call px_test('龚越泽')");
        return "success";
    }
}
