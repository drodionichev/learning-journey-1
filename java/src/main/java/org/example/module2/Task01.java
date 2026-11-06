package org.example.module2;
public class Task01 {
    public static void main(String[] args) {
        int even = 0;
        for (even = 0; even <= 100; even++){
            if (even % 5 == 0) {
                System.out.println(even);
            }
        }

        for (even = 0; even <= 100; even+=5){
            System.out.println(even);
        }
    }
}

