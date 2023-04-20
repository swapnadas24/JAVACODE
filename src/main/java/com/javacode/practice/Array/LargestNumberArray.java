package com.javacode.practice.Array;

import java.util.Arrays;

public class LargestNumberArray {
    //to find Largest Number in an Array

    static int getLargestNumberArray(int arr[],int total){
       
        Arrays.sort(arr);
        return arr[total-1];
    }
    public static void main(String[] args) {
        
        int a[]={4,8,9,0,2,7};
        System.out.println("Largest Number:" +getLargestNumberArray(a,6));
    }
    
}
