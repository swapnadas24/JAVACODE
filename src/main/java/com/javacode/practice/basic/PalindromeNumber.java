package com.javacode.practice.basic;

public class PalindromeNumber {

    public static void main(String[] args) {

        int reminder, sum = 0, temp;
        int number = 525;
        temp = number;
        while (number > 0) {
            reminder = number % 10;
            sum = sum * 10 + reminder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.print("PalindromeNumber is:" + sum);
        } else {
            System.out.print("PalindromeNumber is not:" + sum);
        }
    }
}
