package org.example.factory;

import org.example.dao.OrderDao;
import org.example.dao.UserDao;
import org.example.dao.impl.OrderDaoImpl;
import org.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        System.out.println("factory setup.");
        return new UserDaoImpl();
    }
}
