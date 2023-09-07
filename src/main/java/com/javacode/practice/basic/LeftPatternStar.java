package com.javacode.practice.basic;

import java.util.Scanner;

public class LeftPatternStar {
    public static void main(String[] args) {

        int i,j, row;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row number:");
        row=sc.nextInt();
        for(i=0;i<=row;i++)
        {
            for(j=0;j<=i;j++)
            {
            System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
