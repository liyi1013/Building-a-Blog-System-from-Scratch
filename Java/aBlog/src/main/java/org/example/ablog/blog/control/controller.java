package org.example.ablog.blog.control;

import org.example.ablog.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
