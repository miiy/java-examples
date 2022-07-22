package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserDaoTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQuery() {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.lambda().eq(User::getName, "zhangsan");
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getName, "lisi");
        User user = userDao.selectOne(lqw);
        System.out.println(user);
    }
    @Test
    public void testSelectPage() {
        IPage page = new Page(1, 1);
        userDao.selectPage(page, null);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setName("a1");
        user.setPassword("123123");
        userDao.insert(user);
    }
}
