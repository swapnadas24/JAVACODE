package com.javacode.practice.Array;

import java.util.Arrays;

public class EvenOddNumberInArray {
    public static void main(String[] args) {

        // fibonacci series
        int i[] = { 1, 2, 3, 4, 5, 6 };
        int evencount = 0;
        int oddcount = 0;

        int even[] = new int[i.length];
        int odd[] = new int[i.length];

        for (int number : i) {
            if (number % 2 == 0) {

                even[evencount++] = number;
            } else {
                odd[oddcount++] = number;
            }
        }

        System.out.println("even:" + Arrays.toString(Arrays.copyOf(even, evencount)));
        System.out.println("odd:" + Arrays.toString(Arrays.copyOf(odd, oddcount)));

    }
}
