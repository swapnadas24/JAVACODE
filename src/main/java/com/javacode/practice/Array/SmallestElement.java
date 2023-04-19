package com.javacode.practice.Array;

public class SmallestElement {
    // to print the smallest element in an array

    public static void main(String[] args) {
        
        int arr[]=new int[]{3,4,1,9,8};
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<min)
          min=arr[i];
        }
        System.out.print("Smallest element is:" +min);
    }
    
}
