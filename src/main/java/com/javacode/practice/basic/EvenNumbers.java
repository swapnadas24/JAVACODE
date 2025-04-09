package com.javacode.practice.basic;

public class EvenNumbers {

    public static void main(String[] args) {

        int n = 20;
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println("even:" + i);
            } else {
                System.out.println("odd:" + i);
            }

        }
    }
}
