package org.example.ablog.blog.entity;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName("article")
public class Article {

  private long id;
  private String title;
  private String content;
  private String author;
  private java.sql.Timestamp addDate;
  private java.sql.Timestamp pubDate;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public java.sql.Timestamp getAddDate() {
    return addDate;
  }

  public void setAddDate(java.sql.Timestamp addDate) {
    this.addDate = addDate;
  }


  public java.sql.Timestamp getPubDate() {
    return pubDate;
  }

  public void setPubDate(java.sql.Timestamp pubDate) {
    this.pubDate = pubDate;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
