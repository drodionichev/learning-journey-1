package org.example.module2;

public class Task2 {
    public static void main(String[] args) {
        for (int row = 0; row <= 5; row++) {
            for (int num = 0; num <= row; num++) {
                if (num == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("  "+ num);
                }
            }
            System.out.println();
        }

        for (int row = 4; row >= 0; row--) {
            for (int num = 0; num <= row; num++) {
                if (num == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("  "+ num);
                }
            }
            System.out.println();
        }
    }
}