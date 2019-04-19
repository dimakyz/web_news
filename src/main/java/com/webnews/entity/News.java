package com.webnews.entity;
import java.sql.Date;

public class News {
    private int id_news;
    private String name;
    private String content;
    private Date date;
    private int idcat;

    public News(int id_news, String name, String content, Date date, int idcat) {
        this.id_news = id_news;
        this.name = name;
        this.content = content;
        this.date = date;
        this.idcat = idcat;
    }

    public int getId_news() {
        return id_news;
    }

    public void setId_news(int id_news) {
        this.id_news = id_news;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }
}
