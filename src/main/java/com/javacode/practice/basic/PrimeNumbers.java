package com.javacode.practice.basic;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num, limit = 100;
        System.out.println("prime numbers between 1 to " + limit);

        for (num = 2; num <= limit; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % 2 == 0) {

                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                System.out.print(" " + num);
            }
        }

    }

}
