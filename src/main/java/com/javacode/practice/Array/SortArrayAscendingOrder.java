package com.javacode.practice.Array;

public class SortArrayAscendingOrder {

    //to sort the elements of an array in ascending order

    public static void main(String[] args) {
        
        //initializ the array
        int arr[]=new int[]{3,4,6,2,9,0};
        int temp=0;

        //Displaying elements of original array  
        System.out.println("Elements of original array:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(" "+arr[i]);
        }
       
         //Sort the array in ascending order 
         for(int j=0;j<arr.length;j++)
         {
            for(int k=j+1;k<arr.length;k++)
            {
               if(arr[j]>arr[k])
               {
                 temp=arr[j];
                 arr[j]=arr[k];
                 arr[k]=temp;
               }
            }
         }
        System.out.println(" ");
        System.out.println("Elements of array in ascending order:");
         //Displaying elements of array after sorting   
         for(int l=0;l<arr.length;l++)
         {
           System.out.print(" "+arr[l]);
         }


    }
    
}
