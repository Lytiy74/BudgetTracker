package com.andrew.BudgetTracker;

import com.andrew.BudgetTracker.Transactions.TransactionOperation;
import com.andrew.BudgetTracker.UI.Menu;
import com.andrew.DBUtils.CRUDUtils;
import com.andrew.DBUtils.DBHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class BudgetManager {
    public void startBudgetTracker() {
            CRUDUtils crudUtils = new CRUDUtils();
            System.out.println(crudUtils.getUserData("SELECT * FROM users"));
            TransactionOperation transactionOperation = new TransactionOperation();
            transactionOperation.addExpense(500,crudUtils.getUserList().get(0));
            System.out.println(crudUtils.getUserData("SELECT * FROM users"));
    }
}
