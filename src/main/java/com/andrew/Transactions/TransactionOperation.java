package com.andrew.Transactions;

import java.util.Date;

public class TransactionOperation {
    public Transactions IncomeTransaction(double amount) {
        return new Transactions(amount, new Date(), OperationCategory.INCOME);
    }

    public Transactions OutcomeTransaction(double amount) {
        return new Transactions(-amount, new Date(), OperationCategory.OUTCOME);
    }
}
