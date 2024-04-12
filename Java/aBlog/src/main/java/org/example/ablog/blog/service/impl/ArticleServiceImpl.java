package org.example.ablog.blog.service.impl;

import org.example.ablog.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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

}
