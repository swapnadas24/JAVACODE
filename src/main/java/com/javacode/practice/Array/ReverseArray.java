package com.javacode.practice.Array;

public class ReverseArray {
    
    //to print the elements of an array in reverse order

    public static void main(String[] args) {
       
    int[]arr = new int[]{1,2,3,4,5};
    System.out.println("Original array is:");
    for(int i=0;i<arr.length;i++)
        {
        System.out.print(" "+arr[i]);
        }
    System.out.println(" ");
    System.out.println("Reverse array is:");

    for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(" "+arr[j]);
        }
        
    }    
}
