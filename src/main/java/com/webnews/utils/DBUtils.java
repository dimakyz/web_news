/*package com.webnews.utils;

import com.webnews.entity.News;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class DBUtils {

    public static List<News> findNewsByName(Connection conn, String name) throws SQLException {

        String sql = "Select newsdb.news.id_news, newsdb.news.name, newsdb.news.content, newsdb.news.date, newsdb.news.id_cat" +
                " from news where newsdb.news.name = ? ";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, name);
        ResultSet rs = pstm.executeQuery();
        List<News> list = new ArrayList<News>();
        if (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            Date date = rs.getDate("date");
            int idcat = rs.getInt("idcat");

            News news = new News(id, name, content, date, idcat);
            news.setId_news(id);
            news.setName(name);
            news.setContent(content);
            news.setDate(date);
            news.setIdcat(idcat);
            list.add(news);
        }
        return list;
    }

    public static List<News> queryNews(Connection conn) throws SQLException {
        String sql = "Select newsdb.news.id_news, newsdb.news.name, newsdb.news.content, newsdb.news.date, newsdb.news.id_cat " +
                "from education.course";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<News> list = new ArrayList<News>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("Name");
            Date date = rs.getDate("date");
            String content = rs.getString("content");
            int idcat = rs.getInt("idcat");

            News news = new News(id, name, content, date, idcat);
            news.setId_news(id);
            news.setDate(date);
            news.setName(name);
            news.setContent(content);
            news.setIdcat(idcat);
            list.add(news);
        }
        return list;
    }

    public static void editNews(Connection conn, News news) throws SQLException {
        String sql = "Update news set name=?, content=?, date = current_date , id_cat = ? where id_news = ? ";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, news.getName());
        pstm.setString(2, news.getContent());
        pstm.setDate(3, news.getDate());
        pstm.setInt(4,news.getIdcat());

        pstm.executeUpdate();
    }

    public static void insertNews(Connection conn, News news) throws SQLException {
        String sql = "Insert into news( name, content, date = CURRENT_DATE , id_cat) values (?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        //pstm.setInt(1, news.getId_news());
        pstm.setString(1, news.getName());
        pstm.setString(2, news.getContent());
        pstm.setDate(3, news.getDate());
        pstm.setInt(4,news.getIdcat());

        pstm.executeUpdate();
    }

    public static void deleteCourse(Connection conn, int id) throws SQLException {
        String sql = "Delete From news where id_news = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.executeUpdate();
    }
}*/
