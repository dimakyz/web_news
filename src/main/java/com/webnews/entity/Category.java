package com.webnews.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category", schema = "newsdb")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cat;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<News> news;

    public Category(){
    }

    public Category(String name) {
        this.name = name;
        news = new ArrayList<News>();
    }

    public void addNews(News tid){
        tid.setCategory(this);
        news.add(tid);
    }

    public void removeNews(News tid){
        news.remove(tid);
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
    public List<News> getNews(){
        return news;
    }

    public int getId_cat() {
        return id_cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "entity.Category{"+
                "id_cat="+id_cat+
                ", name='"+name+'\''+
                '}';
    }
}
