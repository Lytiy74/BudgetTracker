package com.andrew.BudgetTracker.UserService;

import com.andrew.BudgetTracker.Transactions.Transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {
    private List<Transaction> transactions = new ArrayList<>();
    private int id;
    private String name;
    private double balance;

    public User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        this.balance += transaction.getAmount();
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof User))
            return false;
        return (((User) o).name.equals(this.name) && ((User) o).balance == this.balance);
        // FIXME: 18.11.2023
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
        // FIXME: 18.11.2023
    }
}
