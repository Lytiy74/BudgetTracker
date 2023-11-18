package com.andrew.BudgetTracker.Auth;


import java.util.Scanner;

public class Authenticator {
    String userName = "Andrew";
    public boolean Login(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals(userName))
            return true;
        return false;
    }
}
