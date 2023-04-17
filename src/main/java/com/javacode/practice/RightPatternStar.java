package com.javacode.practice;

import java.util.Scanner;

public class RightPatternStar {
    
    public static void main(String[] args) {

        int i,j, row;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.print("Enter row number:\n");
        for(i=0;i<=row;i++)
        {
            for(j=0;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println("\n");

        }
    
        
        
    }
}
