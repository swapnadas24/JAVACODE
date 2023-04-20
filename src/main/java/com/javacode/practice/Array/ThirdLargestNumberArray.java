package com.javacode.practice.Array;

import java.util.Arrays;

public class ThirdLargestNumberArray{
    //to find Third Largest Number in an Array

    static int getThirdLargestNumberArray(int[]arr,int total){

        Arrays.sort(arr);
        return arr[total-3];
    }
    public static void main(String[] args) {
      int a[]={3,4,6,0,7,1};
      System.out.print("Third Largest Number:"+getThirdLargestNumberArray(a,6));
    }
    
}