package com.andrew.DBUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler implements AutoCloseable {
    Connection connection;
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Properties properties = getProperties();
        return DriverManager.getConnection(properties.getProperty("db.host"), properties.getProperty("db.username"), properties.getProperty("db.password"));
    }
    private Properties getProperties(){
        Properties properties = new Properties();
        try(FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
