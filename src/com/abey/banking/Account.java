package com.abey.banking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private final int accountNumber;
    private double balance;
    private final List<String> history = new ArrayList<>();

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        history.add(time() + " Account opened | Initial Balance: ₹" + balance);
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        history.add(time() + " CREDIT | ₹" + amount + " | Balance: ₹" + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount > balance) {
            history.add(time() + " DEBIT FAILED | ₹" + amount);
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        history.add(time() + " DEBIT | ₹" + amount + " | Balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<String> getHistory() {
        return history;
    }

    private String time() {
        return "[" + LocalDateTime.now() + "]";
    }
}
