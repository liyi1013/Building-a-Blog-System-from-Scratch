package org.example.ablog.blog.service.impl;

import org.example.ablog.blog.entity.Article;
import org.example.ablog.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(String title,String content,String author){
        System.out.println("start create create  ");
        int res =  jdbcTemplate.update("insert into article(title,content,author,add_date,pub_date,is_delete) values(?,?,?,?,?,?)",title,content,author,new java.sql.Timestamp(System.currentTimeMillis()),new java.sql.Timestamp(System.currentTimeMillis()),0);
        System.out.println("create create = "+res);
        return res;
    }

    @Override
    public List<Map<String, Object>> getAll(){
        return jdbcTemplate.queryForList("select * from article where is_delete = 0");
    }

    @Override
    public List<Article> getAllArticle(){
        return jdbcTemplate.query("select * from article where is_delete = 0", (rs, rowNum) -> {
            Article article = new Article();
            article.setId(rs.getLong("id"));
            article.setTitle(rs.getString("title"));
            article.setAuthor(rs.getString("author"));
            article.setContent(rs.getString("content"));
            article.setAddDate(rs.getTimestamp("add_date"));
            article.setPubDate(rs.getTimestamp("pub_date"));
            return article;
        });
    }
}
