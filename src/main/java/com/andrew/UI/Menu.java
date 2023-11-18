package com.andrew.UI;

import com.andrew.Transactions.TransactionOperation;
import com.andrew.Transactions.Transactions;

import java.util.Scanner;

public class Menu {
    public void mainMenu() {
    }

    private int getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private void printMenuElements() {
        for (MenuElements elements : MenuElements.values()) {
            System.out.println(elements.ordinal() + 1 + "." + elements.getTitle());
        }
    }
}
