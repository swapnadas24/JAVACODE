package com.javacode.practice.basic;

import java.util.Scanner;

public class NumbersPattern {
    public static void main(String[] args) {
        int i, j, rows = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers:");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {

            for (j = rows - i; j >= 0; j--) {

                System.out.print(" " + i);
            }
            for (j = 1; j < i; j++) {
                System.out.print(" * ");
            }

            System.out.println("\n");
        }
    }
}
