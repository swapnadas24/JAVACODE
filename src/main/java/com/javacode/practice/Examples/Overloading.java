package com.javacode.practice.Examples;

public class Overloading {
    void method(int i){
      System.out.println("int-arg type");
    }
    void method(float f){
        System.out.println("float-arg type");
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.method(11);//int-arg type
        o.method(12f);//float-arg type
    }
}
