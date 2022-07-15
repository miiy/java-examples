package org.example;

import org.example.dao.BookDao;
import org.example.dao.OrderDao;
import org.example.dao.UserDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 1.pom.xml 配置 spring-context
        // 2.定义抽象接口
        // 3.创建Spring配置文件，定义bean
        // 4.获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 5.获取Bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();

        UserDao userDao2 = (UserDao) ctx.getBean("userDao2");
        userDao2.save();
    }
}
