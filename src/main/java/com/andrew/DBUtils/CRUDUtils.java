package com.andrew.DBUtils;

import com.andrew.BudgetTracker.UserService.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private Connection connection;
    private List<User> userList = new ArrayList<>();

    public CRUDUtils(Connection connection) {
        this.connection = connection;
    }
    public List<User> getUserList() {
        return userList;
    }
    public List<User> getUserData(String query) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                userList.add(new User(rs.getInt("idusers"),
                        rs.getString("name"), rs.getInt("balance")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public void updateUserData() {
    }

    public void updateTransactionData() {

    }
}
