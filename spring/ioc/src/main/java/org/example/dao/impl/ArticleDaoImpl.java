package org.example.dao.impl;

import org.example.dao.ArticleDao;
import org.springframework.stereotype.Component;

@Component("articleDao")
public class ArticleDaoImpl implements ArticleDao {
    public void save() {
        System.out.println("article dao save.");
    }
}
