package com.webnews.entity;

public class Category {
    private int id_cat;
    private String name;

    public Category(int id_cat, String name) {
        this.id_cat = id_cat;
        this.name = name;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
