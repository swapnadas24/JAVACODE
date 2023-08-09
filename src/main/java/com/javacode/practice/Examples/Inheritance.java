package com.javacode.practice.Examples;

class Parent{
    public void property(){
        System.out.println("land+cash");
    }
    public void marry(){
        System.out.println("Sita");
    }
}
class Child extends Parent{
    public void marry(){
        System.out.println("Riya");
    }
}
class Inheritance{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.property(); 
        p.marry();

        Child c=new Child();
        c.property();
        c.marry();

       // Child c1=new Parent(); //CE: can't convert from parent to child
       Parent p1=new Child();
       p1.property();
       p1.marry();
    }   
}