package org.example;

public class SortPractice {
    public static void main(String[] args){
        int [] arr = {4, 2, 5, 1, 3};
        int maxIdx = 0;
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        System.out.println(maxIdx);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        System.out.println(minIdx);
    }
}
