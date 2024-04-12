package org.example.ablog.blog.service;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    public int create(String title,String content,String author);

    public List<Map<String, Object>> getAll();
}
