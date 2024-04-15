package org.example.ablog.blog.dao;

import jakarta.annotation.Resource;
import org.example.ablog.blog.entity.Article;
import org.example.ablog.blog.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleDao {

    @Resource
    private ArticleMapper articleMapper;
    public int create(String title,String content,String author)
    {
        Article a = new Article();
        a.setTitle(title);
        a.setContent(content);
        a.setAuthor(author);
        a.setAddDate(new java.sql.Timestamp(System.currentTimeMillis()));
        a.setPubDate(new java.sql.Timestamp(System.currentTimeMillis()));
        return articleMapper.create(a);
    }

    public int deleteLogic(long id)
    {
        return articleMapper.deleteLogic(id);
    }

    public int delete(long id)
    {
        return articleMapper.delete(id);
    }

    public List<Article> getAll()
        {
            return articleMapper.getAllArticle();
        }
}
