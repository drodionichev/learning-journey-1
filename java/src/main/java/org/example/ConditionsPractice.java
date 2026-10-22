package org.example;

public class ConditionsPractice {
    public static void main(String[] args) {
        // Task 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Task 2
        int score = 101;
        if (score > 100 || score < 0) {
            System.out.println("InvalidScore");
        } else if (score >= 90){
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // Task 3
        int n = 15;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

        // Task 4
        String username = "admin";
        String password = "qwerty";

        if (username.equals("admin") && password.equals("qwerty")){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Task 5

        double a = 2;
        double b = 0;
        char op = '/';
        double result = 0;
        boolean isOk= true;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Don't divide by 0");
                    isOk = false;
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Unknown operator");
                isOk = false;
        }
        if (isOk){
            System.out.println(result);
        }
    }
}
