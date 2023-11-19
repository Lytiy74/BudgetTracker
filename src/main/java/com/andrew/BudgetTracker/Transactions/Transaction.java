package com.andrew.BudgetTracker.Transactions;

import java.util.Date;

public class Transaction {
    private double amount;
    private Date date;
    private OperationCategory category;
    private double currentBalance;

    public Transaction(double amount, Date date, OperationCategory category, double currentBalance) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.currentBalance = currentBalance;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public OperationCategory getCategory() {
        return category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategory(OperationCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "DATE: "+ date + " | " + "AMOUNT: " + amount +" | " + "CATEGORY: " + category + " | " + "CURRENT BALANCE: " + currentBalance;
    }
}
