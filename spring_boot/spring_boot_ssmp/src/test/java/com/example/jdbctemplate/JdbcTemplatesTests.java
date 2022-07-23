package com.example.jdbctemplate;

import com.example.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class JdbcTemplatesTests {

    @Test
    void testJdbc(@Autowired JdbcTemplate jdbcTemplate) {
       String sql = "select * from user where id=1";
       RowMapper<User> rm = new RowMapper<>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User temp = new User();
                temp.setId(rs.getLong("id"));
                temp.setName(rs.getString("name"));
                return temp;
            }
       };
       List<User> list = jdbcTemplate.query(sql, rm);
       System.out.println(list);
    }

}
