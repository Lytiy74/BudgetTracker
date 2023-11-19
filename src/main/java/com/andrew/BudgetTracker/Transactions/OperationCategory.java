package com.andrew.BudgetTracker.Transactions;

enum OperationCategory {
    INCOME("INCOME"),
    EXPENSE("EXPENSE");
    private final String title;

    OperationCategory(String title) {
        this.title = title;
    }

}
