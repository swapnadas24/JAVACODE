package com.javacode.practice.basic;

public class FactorialNumber {
    public static void main(String[] args) {
        int i, number=5, fact=1;
        for(i=1;i<=number;i++)
        {
          fact=fact*i;
        }
        System.out.print("factorial number of" +number+ "is:" +fact);
    }
    
}
