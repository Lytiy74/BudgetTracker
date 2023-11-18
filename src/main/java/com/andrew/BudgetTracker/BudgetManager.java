package com.andrew.BudgetTracker;

import com.andrew.BudgetTracker.UI.Menu;


public class BudgetManager {

    public void startBudgetTracker() {
        User user = new User("Andrew", 500.0);
        Menu menu = new Menu(user);
        menu.mainMenu();
        user.getTransactions()
                .forEach(transactions -> System.out.println(transactions.toString()));
    }
}
