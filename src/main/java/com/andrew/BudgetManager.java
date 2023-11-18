package com.andrew;

import com.andrew.UI.Menu;


public class BudgetManager {

    public void startBudgetTracker() {
        User user = new User("Andrew", 500.0);
        Menu menu = new Menu(user);
        menu.mainMenu();
    }
}
