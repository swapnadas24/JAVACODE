package com.javacode.practice;

public class PalindromNumber {

    public static void main(String[] args) {
        
        int reminder,sum=0,temp;
        int number=525;
        temp=number;
        while(number>0){
        reminder=number%10;
        sum=sum*10+reminder;
        number=number/10;
        }
        if(temp==sum)
        {
        System.out.print("PalendromNumber is:"+sum);
        }else
        {
            System.out.print("PalendromNumber is not:"+sum);
        }
    }
    
}
