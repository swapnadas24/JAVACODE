package com.javacode.practice.Array;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray{

   public static void main(String[] args) {
    
    /* 
    int arr[]=new int[]{2,4,8,6,4,0,-2,-3};
    Arrays.sort(arr);
    System.out.println("Sorted arrays:");
    
    //Sorted in Ascending order
    for(int i=0;i<arr.length;i++)
    {
     System.out.print(" "+arr[i]);
    }
     */

    //Sorted in Descending order
    Integer arr[]={2,4,8,6,4,0,-2,-3};
    Arrays.sort(arr,Collections.reverseOrder());
    System.out.print("Arrays element in descending order:"+Arrays.toString(arr));
   }
}