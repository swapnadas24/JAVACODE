package com.javacode.practice.basic;
public class ReverseNumber {

public static void main(String[] args) {

    int number=53421,reminder, reverse=0;
        /* 
        //using while loop
        while(number!=0)
        {
        reminder=number%10;
        reverse=reverse*10+reminder;
        number=number/10;
        }  
        */  

//using for loop
 for(;number!=0;number=number/10)
 {
   reminder=number%10;
   reverse=reverse*10+reminder;
 }
 System.out.print("Reverse number is:"+reverse);
}
    
}
