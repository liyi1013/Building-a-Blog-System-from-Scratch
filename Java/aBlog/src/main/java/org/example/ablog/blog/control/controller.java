package org.example.ablog.blog.control;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.example.ablog.blog.config.MyConfig;
import org.example.ablog.blog.config.MyProperty;
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

    @GetMapping(value = "getAllArticlePlus")
    public List<Article> getAllArticlePlus(){
        return articleService.getAllArticlePlus();
    }

    @GetMapping(value = "insertArticle")
    public int insertArticle(String title, String content, String author){
        return articleService.insertArticle(title,content,author);
    }

    @GetMapping(value = "getAllArticlePlusPages")
    public IPage getAllArticlePlusPages(int pageNum, int pageSize, String titleLike){
        return articleService.getArticleByPage(pageNum,pageSize,titleLike);
    }

    @Resource
    MyConfig myConfig;

    @GetMapping(value = "getMyConfigProperty")
    public String getMyConfigProperty(){
        return myConfig.getMyProperty().toString();
    }

    @Resource
    MyProperty myProperty;
    @GetMapping(value = "getMyProperty")
    public String getMyProperty(){
        return myProperty.toString();
    }
}
