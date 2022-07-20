package org.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Account;

import java.io.IOException;
import java.io.InputStream;

public class App
{
    public static void main( String[] args )
    {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Account ac = sqlSession.selectOne("org.example.domain.AccountMapper.GetAccountById", 1);
            System.out.println(ac);

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
