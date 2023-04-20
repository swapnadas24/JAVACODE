package com.javacode.practice.Array;

public class SortArrayDescendingOrder {
    //to sort the elements of an array in descending order
    public static void main(String[] args) {

        //Initialize array 
          int arr[]=new int[]{9,6,4,0,2,-1,3};
          int temp=0;

          System.out.println("Elements of original array:");

        //Displaying elements of original array  
          for(int i=0;i<arr.length;i++)
          {
            System.out.print(" "+arr[i]);
          }

        //Sort the array in descending order  
        for(int j=0;j<arr.length;j++)
        {
            for(int k=j+1;k<arr.length;k++)
            {
              if(arr[j]<arr[k])
              {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
              }
            }
        }
        System.out.println(" ");

        //Displaying elements of array after sorting   
        System.out.println("Sorted elements in descending order:"); 
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(" "+arr[l]);
        }    
       
    }

    
}
