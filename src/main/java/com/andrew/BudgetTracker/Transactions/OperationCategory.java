package com.andrew.BudgetTracker.Transactions;

enum OperationCategory {
    INCOME("Прихід"),
    OUTCOME("Витрати");
    private final String title;

    OperationCategory(String title) {
        this.title = title;
    }

}
