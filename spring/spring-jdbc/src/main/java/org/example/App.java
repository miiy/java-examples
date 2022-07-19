package org.example;

import org.example.domain.Account;
import org.example.domain.AccountMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class App
{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List <Account> accounts = jdbcTemplate.query("select * from accounts", new AccountMapper());
        System.out.println(accounts);
    }
}
