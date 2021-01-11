package com.zjx.learn.dataBase;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description 数据库索引测试
 * @author: zhujingxing
 * @create: 2021-01-11 16:50
 **/
@Component
public class IndexTest {
   public static final String CREATEINDEXSQL = "alter table indexTest add index index_name(name)";
   public final JdbcTemplate jdbcTemplate;

   public IndexTest(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
   }

   public void createIndex() {
      jdbcTemplate.execute(CREATEINDEXSQL);
   }
}
