package com.webnews.service;

import com.webnews.dao.CategoryDao;
import com.webnews.entity.Category;
import com.webnews.entity.News;

import java.util.List;

public class AllService {
    private CategoryDao categoryDao = new CategoryDao();

    public AllService(){
    }

    public Category findCat(int id){
        return categoryDao.findById(id);
    }

    public void saveCat(Category category){
        categoryDao.saveCat(category);
    }

    public void deleteCat(Category category){
        categoryDao.deleteCat(category);
    }

    public void updateCat(Category category){
        categoryDao.updateCat(category);
    }

    public List<Category> findAllCat(){
        return categoryDao.findAllCat();
    }

    public List<News> findAllNews(){
        return categoryDao.findAllNews();
    }
    public void addNews(News news){
        categoryDao.addNews(news);
    }
}
