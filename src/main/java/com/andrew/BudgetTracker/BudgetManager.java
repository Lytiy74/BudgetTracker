package com.andrew.BudgetTracker;

import com.andrew.BudgetTracker.UI.Menu;
import com.andrew.BudgetTracker.UserService.User;
import com.andrew.dbHandler.DatabaseHandler;

import java.sql.SQLException;


public class BudgetManager {
    public void startBudgetTracker() {
        try (DatabaseHandler databaseHandler = new DatabaseHandler()){
            System.out.println("Successful connection to DB");
            User user = new User("Andrew", 500.0);
            Menu menu = new Menu(user);
            menu.mainMenu();
            user.getTransactions()
                    .forEach(transactions -> System.out.println(transactions.toString()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
