package com.andrew.BudgetTracker.UI;

enum MenuElements {
    INCOME("Add income"),
    EXPENSE("Add expense"),
    BALANCE("Get current balance");
    private final String title;

    MenuElements(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
