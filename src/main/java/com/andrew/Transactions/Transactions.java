package com.andrew.Transactions;

import com.andrew.User;

public class Transactions {
    public static void addToBalance(User user, int sum){
        user.setBalance(user.getBalance()+sum);
    }
    public static void removeFromBalance(User user, int sum){
        user.setBalance(user.getBalance()-sum);
    }
}
