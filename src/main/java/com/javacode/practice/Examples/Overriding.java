package com.javacode.practice.Examples;

class Father{
    public void property(){
        System.out.println("cash+land");
    }
    public void marry(){
        System.out.println("Meera");
    }
}
class Son extends Parent{
    public void marry(){
        System.out.println("Sita");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Father p=new Father();
        p.marry(); //Meera

        Son s=new Son();
        s.marry();//Sita
    }
}
