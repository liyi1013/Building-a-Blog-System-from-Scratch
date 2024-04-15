package org.example.ablog.blog.service;

import org.example.ablog.blog.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    public int create(String title,String content,String author);

    public List<Map<String, Object>> getAll();

    public List<Article> getAllArticle();

    public List<Article> getAllArticlePlus();

    public int insertArticle(String title, String content, String author);
}
