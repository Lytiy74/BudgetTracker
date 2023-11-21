package com.andrew.BudgetTracker;

import com.andrew.DBUtils.CRUDUtils;
import com.andrew.DBUtils.DBHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class BudgetManager {
    public void startBudgetTracker() {
        ;
        try(Connection connection = new DBHandler().getConnection()) {
            CRUDUtils crudUtils = new CRUDUtils();
            System.out.println(crudUtils.getUserData("SELECT * FROM users"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
