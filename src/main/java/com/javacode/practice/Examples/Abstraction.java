package com.javacode.practice.Examples;

abstract class Abstraction{
    abstract void run();
}
class TestAbstraction extends Abstraction{
    void run(){
        System.out.print("He is a running");
    }
public static void main(String[] args) {
    Abstraction a=new TestAbstraction();
    a.run();
}
}
