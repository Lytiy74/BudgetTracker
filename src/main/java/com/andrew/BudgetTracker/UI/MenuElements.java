package com.andrew.BudgetTracker.UI;

enum MenuElements {
    INCOME("Додати прихід"),
    OUTCOME("Додати витрати"),
    BALANCE("Отримати поточний баланс");
    private final String title;

    MenuElements(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
