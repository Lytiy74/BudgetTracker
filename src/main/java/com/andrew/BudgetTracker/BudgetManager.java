package com.andrew.BudgetTracker;

import com.andrew.DBUtils.DBHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class BudgetManager {
    public void startBudgetTracker() {
        ;
        try(Connection connection = new DBHandler().getConnection()) {
            System.out.println(connection.getSchema());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
