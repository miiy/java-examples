package org.example.dao.impl;

import org.example.dao.OrderDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OrderDaoImpl implements OrderDao, InitializingBean, DisposableBean {

    public void save() {
        System.out.println("order dao save.");
    }

    public void destroy() throws Exception {
        System.out.println("order destroy.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("order afterPropertiesSet.");

    }
}
