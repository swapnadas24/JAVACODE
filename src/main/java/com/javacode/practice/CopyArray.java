package com.javacode.practice;

public class CopyArray {

 //Program to copy all elements of one array into another array  
    /* Ex:
    ARRAY 1  
    1   2  3  4  5  
    ARRAY 2  
    1   2  3  4  5   */

    public static void main(String[] args)
    {

        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
        }
        System.out.print("Enter original array:");
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
        System.out.println();
        System.out.print("Element of new array:");

        for(int k=0;k<arr2.length;k++){
            System.out.print(arr2[k]+" ");
        }     
    }
}
