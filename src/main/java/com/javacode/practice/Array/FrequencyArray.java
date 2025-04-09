package com.javacode.practice.Array;

public class FrequencyArray {

    // Program to find the frequency of each element in the array
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int frequency[] = new int[arr.length];
        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = value;
                }
            }
            if (frequency[i] != value)
                frequency[i] = count;

        }
        System.out.println("Element | Frequency");
        System.out.println("------------------");
        for (int k = 0; k < frequency.length; k++) {
            if (frequency[k] != value) {
                System.out.println(arr[k] + " | " + frequency[k]);
            }
        }
    }

}
