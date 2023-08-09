package com.javacode.practice.Examples;

 class Encapsulation{
   int x;
   int getx(int i){
    return i=x;
   }
   int setx(int value){
    if(value<15){
       return 0;
    }else{
        x=value;
    }
    return value;
   }
 }
 class TestEncaps{
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        System.out.println(e.setx(17));
        System.out.println(e.setx(11));
        System.out.println(e.setx(15));
    }
 }