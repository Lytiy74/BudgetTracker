package com.andrew;

import com.andrew.Transactions.Transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private List<Transactions> transactions = new ArrayList<>();
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addTransaction(Transactions transaction){
        transactions.add(transaction);
        this.balance += transaction.getAmount();
    }
    @Override
    public String toString() {
        return "User: " + name + ", Balance: " + balance;
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
