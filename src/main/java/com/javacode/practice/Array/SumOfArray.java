package com.javacode.practice.Array;

public class SumOfArray {
    //to print the sum of all the items of the array

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5};
        int sum=0;

        for(int i=0;i< arr.length;i++)
        {
         sum=sum+arr[i];
        }
        System.out.print("Sum of array is:"+sum);
    }
    
}
