package com.javacode.practice.Array;

public class LargestElement {
   
    //to print the largest element in an array
public static void main(String[] args) {
    
    int arr[]=new int[]{2,3,5,87,23};
    int max = arr[0];
    for(int i=0;i<arr.length;i++)
        {
        if(arr[i]>max)
        max=arr[i];
        }
        System.out.print("Largest element:"+max); 
}
    
    
}
