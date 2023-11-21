package com.andrew.BudgetTracker.Transactions;

import java.util.Date;

public class Transaction {
    private final double amount;
    private final Date date;
    private final OperationCategory category;
    private final double currentBalance;

    public Transaction(double amount, Date date, OperationCategory category, double currentBalance) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.currentBalance = currentBalance;
    }

    public double getAmount() {
        return amount;
    }
    @Override
    public String toString() {
        return "DATE: "+ date + " | " + "AMOUNT: " + amount +" | " + "CATEGORY: " + category + " | " + "CURRENT BALANCE: " + currentBalance;
    }
}
