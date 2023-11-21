package com.andrew.DBUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler implements AutoCloseable {
    private Connection connection;
    private String dbURL;
    private String dbUsername;
    private String dbPassword;
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        getProperties();
        connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        return connection;
    }
    private void getProperties(){
        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            properties.load(fis);
          this.dbURL = properties.getProperty("db.host");
          this.dbUsername = properties.getProperty("db.username");
          this.dbPassword = properties.getProperty("db.password");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
