package com.andrew.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler implements AutoCloseable {
    private Connection dbConnection;


    public Connection getDbConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection("jdbc:mysql//localhost:3306/mydb", "root", "root");
        return dbConnection;
    }

    public void close() throws Exception {
        dbConnection.close();
    }
}
