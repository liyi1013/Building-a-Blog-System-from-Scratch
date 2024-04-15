package org.example.ablog.blog.control;

import org.example.ablog.blog.entity.Article;
import org.example.ablog.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class controller {

    @Resource
    ArticleService articleService;

    @GetMapping(value = "test")
    public String createArticle()
    {
        System.out.println("start createArticle");
        String title = "test";
        String content = "test";
        int res = articleService.create(title,content,"test");
        return ""+res;
    }

    @GetMapping(value = "getAll")
    public String getAll(){
        return articleService.getAll().toString();
    }

    @GetMapping(value = "getAllArticle")
    public List<Article> getAllArticle(){
        return articleService.getAllArticle();
    }
}
