package com.andrew;

import com.andrew.Transactions.Transactions;

public class Main {

    public static void main(String[] args) {
      User user1 = new User("Andrew",5000);
        System.out.println(user1.toString());
        Transactions.addToBalance(user1,200);
        System.out.println(user1.toString());
        Transactions.removeFromBalance(user1,500);
        System.out.println(user1.toString());
    }
}
