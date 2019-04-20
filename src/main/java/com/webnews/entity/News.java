package com.webnews.entity;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "news", schema = "newsdb")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_news;
    @Column(name = "name")
    private String name;
    @Column(name = "content")
    private String content;
    private Timestamp date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cat")
    private Category category;

    public News(){
    }

    public News(String name, String content, Timestamp date) {
        this.name = name;
        this.content = content;
        this.date = date;
    }

    public int getId_news() {
        return id_news;
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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString(){
        return name+" "+content+" "+date;
    }
}
