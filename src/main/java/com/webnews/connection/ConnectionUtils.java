package com.webnews.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return MySQLConn.getMySQLConnection();
    }
    public static void closeConn(Connection conn){
        try {
            conn.close();
        } catch (Exception e){
        }
    }
    public static void rollbackConn(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
        }
    }
}
