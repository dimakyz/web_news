package com.webnews;

import com.webnews.entity.Category;
import com.webnews.entity.News;
import com.webnews.service.AllService;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        AllService allService = new AllService();
        Category category = new Category("City");
        allService.saveCat(category);
        News moscow = new News("Moscow", "redsa ijddapoasdsack o asdpk a", new java.sql.Timestamp(System.currentTimeMillis()));
        moscow.setCategory(category);
        category.addNews(moscow);
        News piter = new News("Piter", "qwtqaf  sfaasfalaasd asfck", new java.sql.Timestamp(System.currentTimeMillis()));
        piter.setCategory(category);
        category.addNews(piter);
        allService.updateCat(category);
    }
}
