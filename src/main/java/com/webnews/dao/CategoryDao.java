package com.webnews.dao;

import com.webnews.entity.Category;
import com.webnews.entity.News;
import com.webnews.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDao {
    public Category findById(int id){
        return HibernateSessionFactory.getSessionFactory().openSession().get(Category.class, id);
    }

    public void saveCat(Category category){
        try {
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
            session.close();
        }catch (Exception e){
            System.out.println("smth's wrong");
        }
    }

    public void updateCat(Category category){
        try {
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(category);
            transaction.commit();
            session.close();
        }catch (Exception e)
        {System.out.println("smth wrong");}

    }

    public void deleteCat(Category category){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(category);
        transaction.commit();
        session.close();
    }

    public News findNewsById(int id){
        return HibernateSessionFactory.getSessionFactory().openSession().get(News.class, id);
    }

    public News findNewsByName(String name){
        return HibernateSessionFactory.getSessionFactory().openSession().get(News.class, name);
    }

    public News findNewsByContent(String content){
        return HibernateSessionFactory.getSessionFactory().openSession().get(News.class, content);
    }

    public List<News> findAllNews(){
        List<News> news = (List<News>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("FROM News").list();
        return news;
    }

    public List<Category> findAllCat(){
        List<Category> categories = (List<Category>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("FROM Category").list();
        return categories;
    }

    public void addNews(News news){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(news);
        transaction.commit();
        session.close();
    }
}
