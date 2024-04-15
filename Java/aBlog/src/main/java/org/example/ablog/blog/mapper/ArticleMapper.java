package org.example.ablog.blog.mapper;

import org.apache.ibatis.annotations.*;
import org.example.ablog.blog.entity.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select * from article")
    public List<Article> getAllArticle();

    @Insert("insert into article(title,content,author,add_date,pub_date) values(#{title},#{content},#{author},#{addDate},#{pubDate})")
    public int create(Article article);

    @Update("update article set isDelete=1 where id=#{id}")
    public int deleteLogic(long id);

    @Delete("delete from article where id=#{id}")
    public int delete(long id);
}