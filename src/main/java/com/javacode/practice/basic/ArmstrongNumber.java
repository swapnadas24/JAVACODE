package com.javacode.practice.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // 153 = 1³ + 5³ + 3³
        int n = 153, rem, count = 0;

        while (n != 0) {

            rem = n % 10;
            count += rem * rem * rem;
            n = n / 10;
        }
        if (n == count) {
            System.out.println(count + " is Armstrong Number");
        } else {
            System.out.println(count + " is not Armstrong Number");
        }
    }

}
