package com.github.phuctle.textttt.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataSource {
        private static SqlDataSource instance;
        private String url;
        private String user;
        private String password;
    
        private SqlDataSource() {
            url = System.getProperty("database.url", "jdbc:postgresql://localhost:5432/tttdb");
            user = System.getProperty("database.username", "tttdb");
            password = System.getProperty("database.password", "tttdb");
        }
    
        public static SqlDataSource getInstance() {
            if (instance == null) {
                instance = new SqlDataSource();
            }
            return instance;
        }
    
        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }
    }
