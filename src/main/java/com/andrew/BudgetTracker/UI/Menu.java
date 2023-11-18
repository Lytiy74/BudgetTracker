package com.andrew.BudgetTracker.UI;


import com.andrew.BudgetTracker.Transactions.TransactionOperation;
import com.andrew.BudgetTracker.User;

import java.util.Scanner;

public class Menu {
   private User user;
   public Menu(User user){
       this.user = user;
   }
    public void mainMenu() {
        boolean exit = false;
        do {
            printMenuElements();
            Double choice = getUserAnswer("option");

            if (choice == 1.0) {
                new TransactionOperation().addIncome(getUserAnswer("income"), user);
            } else if (choice == 2.0) { new TransactionOperation().addExpense(getUserAnswer("expense"),user);
            } else if (choice == 3.0) { System.out.println(user.toString());
            } else if (choice == 0.0) {
                exit = true;
            } else {
                System.out.println("Невідома опція. Спробуйте ще раз.");
            }

        } while (!exit);
    }

    private double getUserAnswer(String option) {
        System.out.println("Enter " + option + " :");
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    private void printMenuElements() {
        for (MenuElements elements : MenuElements.values()) {
            System.out.println(elements.ordinal() + 1 + "." + elements.getTitle());
        }
    }
}
