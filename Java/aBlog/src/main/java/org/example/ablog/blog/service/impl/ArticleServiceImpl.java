package org.example.ablog.blog.service.impl;

import jakarta.annotation.Resource;
import org.example.ablog.blog.dao.ArticleDao;
import org.example.ablog.blog.entity.Article;
import org.example.ablog.blog.mapper.ArticleMapperPlus;
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

    @Resource
    private ArticleDao articleDao;
    @Resource
    private ArticleMapperPlus articleMapperPlus;

    @Override
    public int create(String title, String content, String author) {
        System.out.println("start create create  ");
//        int res =  jdbcTemplate.update("insert into article(title,content,author,add_date,pub_date,is_delete) values(?,?,?,?,?,?)",title,content,author,new java.sql.Timestamp(System.currentTimeMillis()),new java.sql.Timestamp(System.currentTimeMillis()),0);
        int res = articleDao.create(title, content, author);
        System.out.println("create create = " + res);
        return res;
    }

    @Override
    public List<Map<String, Object>> getAll() {
        return jdbcTemplate.queryForList("select * from article where is_delete = 0");
    }

    @Override
    public List<Article> getAllArticle() {
//        return jdbcTemplate.query("select * from article where is_delete = 0", (rs, rowNum) -> {
//            Article article = new Article();
//            article.setId(rs.getLong("id"));
//            article.setTitle(rs.getString("title"));
//            article.setAuthor(rs.getString("author"));
//            article.setContent(rs.getString("content"));
//            article.setAddDate(rs.getTimestamp("add_date"));
//            article.setPubDate(rs.getTimestamp("pub_date"));
//            return article;
//        });
        return articleDao.getAll();
    }

    @Override
    public List<Article> getAllArticlePlus() {
        return articleMapperPlus.selectList(null);
    }

    @Override
    public int insertArticle(String title, String content, String author) {
        Article article = new Article();
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        article.setAddDate(timestamp);
        article.setPubDate(timestamp);
        article.setIsDelete(0);
        int insert = articleMapperPlus.insert(article);
        return insert;
    }

}
