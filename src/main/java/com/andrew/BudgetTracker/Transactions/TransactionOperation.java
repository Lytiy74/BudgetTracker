package com.andrew.BudgetTracker.Transactions;

import com.andrew.BudgetTracker.UserService.User;
import com.andrew.DBUtils.CRUDUtils;

import java.util.Date;

public class TransactionOperation {
    private Transaction createTransaction(double amount, OperationCategory category, double balance) {
        return new Transaction(category == OperationCategory.INCOME ? amount : -amount, new Date(), category, balance);
    }
    public void addIncome(double amount,User user){
        Transaction incomeTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.INCOME, user.getBalance());
        user.setBalance(user.getBalance()+amount);
        user.getTransactions().add(incomeTransaction);
        System.out.println("Income successfully added.");
    }
    public void addExpense(double amount, User user){
        Transaction expenseTransaction = new TransactionOperation().createTransaction(amount, OperationCategory.EXPENSE, user.getBalance());
        user.setBalance(user.getBalance()+amount);
        user.getTransactions().add(expenseTransaction);
        System.out.println("Expenses successfully added.");
    }
}
