package org.example;

public class LoopsPractice {
    public static void main(String[] args) {
//        // Task 1
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//           System.out.println(i);
//        }
//        // Task 2
//
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // Task 3

//        int i = 5;
//        while (i >= 1) {
//            System.out.println(i);
//            i--;
//        }
//        System.out.println("Liftoff! 🚀");

        // Task 4

//        for (int n = 1; n <= 30; n++) {
//            if (n % 3 == 0 && n % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (n % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (n % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(n);
//            }
//        }

        // Task 5

//        for (int i = 100; i >= 100; i++) {
//            if (i % 7 == 0 && i % 13 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        int i = 101;
        while (true) {
            if (i % 7 == 0 && i % 13 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}