package org.example.oop;

public class Wallet {
    private double balance;
    private static int walletCount;

    public Wallet() {
        this(0);
    }

    public Wallet(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException("The amount must be positive or equal to zero");
        }
        walletCount++;
        this.balance = initialBalance;
    }

    public void addIncome(double amount) {
        validateAmount(amount);
        this.balance += amount;
    }

    public void addExpense(double amount) {
        validateAmount(amount);
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static int getWalletCount(){
        return walletCount;
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be positive");
        }
    }
}
