package org.example.oop;

public class Wallet {
    private double balance;

    Wallet() {
        this(0);
    }

    Wallet(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException("The amount must be positive or equal to zero");
        }

        this.balance = initialBalance;
    }

    public void addIncome(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be positive");
        }
        this.balance += amount;
    }

    public void addExpense(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be positive");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
