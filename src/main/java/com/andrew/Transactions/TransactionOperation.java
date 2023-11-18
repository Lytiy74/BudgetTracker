package com.andrew.Transactions;

import com.andrew.User;

import java.util.Date;

public class TransactionOperation {
    private Transactions createTransaction(double amount, OperationCategory category) {
        return new Transactions(category == OperationCategory.INCOME ? amount : -amount, new Date(), category);
    }
    public void addIncome(double amount,User user){
        Transactions expenseTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.INCOME);
        user.addTransaction(expenseTransaction);
        System.out.println("Прибуток успішно додано.");
    }
    public void addExpense(double amount, User user){
        Transactions expenseTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.OUTCOME);
        user.addTransaction(expenseTransaction);
        System.out.println("Витрати успішно додано.");
    }
}
