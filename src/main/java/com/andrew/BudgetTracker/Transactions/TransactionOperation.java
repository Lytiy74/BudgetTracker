package com.andrew.BudgetTracker.Transactions;

import com.andrew.BudgetTracker.User;

import java.util.Date;

public class TransactionOperation {
    private Transactions createTransaction(double amount, OperationCategory category, double balance) {
        return new Transactions(category == OperationCategory.INCOME ? amount : -amount, new Date(), category, balance);
    }
    public void addIncome(double amount,User user){
        Transactions expenseTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.INCOME, user.getBalance());
        user.addTransaction(expenseTransaction);
        System.out.println("Прибуток успішно додано.");
    }
    public void addExpense(double amount, User user){
        Transactions expenseTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.OUTCOME, user.getBalance());
        user.addTransaction(expenseTransaction);
        System.out.println("Витрати успішно додано.");
    }
}
