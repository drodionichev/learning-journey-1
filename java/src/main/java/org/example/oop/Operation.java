package org.example.oop;

public class Operation {
    private String category;
    private double amount;
    private boolean income;

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public boolean isIncome() {
        return income;
    }

    Operation(String category, double amount, boolean income) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (category.isBlank()) {
            throw new IllegalArgumentException("Category must be filled");
        }

        this.category = category;
        this.amount = amount;
        this.income = income;
    }
}
