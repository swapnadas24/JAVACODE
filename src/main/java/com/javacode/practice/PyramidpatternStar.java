package com.javacode.practice;

import java.util.Scanner;

public class PyramidpatternStar {
    public static void main(String[] args) {
        int i,j,row;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row number:\n");
        row=sc.nextInt();
        for(i=0;i<=row;i++)
        {
          for(j=row-i;j>=0;j--)
          {
             System.out.print(" ");
          }
          for(j=0;j<=i;j++)
          {
            System.out.print("* ");
          }
          System.out.println(" ");
        }
        
    }
    
}
