package com.javacode.practice.Array;

public class OddPosition {

  // to print the elements of an array present on odd position

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5 };

    for (int i = 0; i < arr.length; i = i + 2) {
      System.out.print(arr[i]);
    }

  }

}
