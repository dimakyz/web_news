package com.webnews.utils;

import com.webnews.entity.Category;
import com.webnews.entity.News;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactory {
    private  static SessionFactory sessionFactory;

    private HibernateSessionFactory(){}

    public  static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(News.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Exception" + e);
            }
        }
        return sessionFactory;
    }
}
