package com.andrew.Transactions;

public enum OperationCategory {
    INCOME("Прихід"),
    OUTCOME("Витрати");
    private final String title;
    OperationCategory(String title){
        this.title = title;
    }
}
