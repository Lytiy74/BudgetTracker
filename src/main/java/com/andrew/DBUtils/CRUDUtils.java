package com.andrew.DBUtils;

import com.andrew.BudgetTracker.UserService.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private List<User> userList = new ArrayList<>();
    public List<User> getUserData(String query){
        try(Connection connection = new DBHandler().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
           ResultSet rs = preparedStatement.executeQuery();
           while (rs.next()){
               userList.add(new User(rs.getInt("idusers"),
                       rs.getString("name"),rs.getInt("balance")));
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}
