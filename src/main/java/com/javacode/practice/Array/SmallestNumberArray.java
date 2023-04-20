package com.javacode.practice.Array;

import java.util.Arrays;

public class SmallestNumberArray {
   
    //Find Smallest Number in Array using Arrays
    static int getSmallestNumberArray(int arr[],int total){

       Arrays.sort(arr);
        return arr[0];    
    }
    public static void main(String[] args) {
        
        int a[]={4,8,9,6,1,0};
        System.out.print("Smallest Number:"+getSmallestNumberArray(a,6));
    }
    
}
