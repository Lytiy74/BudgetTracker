package com.andrew.DBUtils;

import com.andrew.BudgetTracker.UserService.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils{
    private List<User> userList = new ArrayList<>();
    public List<User> getUserList() {
        return userList;
    }
    public List<User> getUserData(String query) {
        try (Connection connection = new DBHandler().getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                userList.add(new User(rs.getInt("idusers"),
                        rs.getString("name"), rs.getInt("balance")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public void saveUserData(User user) {
        String INSERT_DATA = "INSERT INTO users(name, balance) VALUES (?, ?)";
        try (Connection connection = new DBHandler().getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA)) {
            preparedStatement.setString(0,user.getName());
            preparedStatement.setDouble(0,user.getBalance());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateUserData(User user) {
        String UPDATE_DATA = "UPDATE users SET balance = ? WHERE idusers = ?";
        try (Connection connection = new DBHandler().getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DATA)) {
            preparedStatement.setDouble(1,user.getBalance());
            preparedStatement.setInt(2,user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
