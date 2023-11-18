package com.andrew.Transactions;

import java.util.Date;

public class Transactions {
    private double amount;
    private Date date;
    private OperationCategory category;

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
}
