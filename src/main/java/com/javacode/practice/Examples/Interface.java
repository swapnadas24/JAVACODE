package com.javacode.practice.Examples;

interface cat{
    void catBites();
}
interface dog{
    void dogBites();
}
interface snake{
    void snakeBites();
}
class Animal implements cat,dog,snake{
    public void catBites(){
        System.out.println("Cat bites");
    }
    public void dogBites(){
        System.out.println("Dog bites");
    }
    public void snakeBites(){
        System.out.println("Snake bites");
    }
}
public class Interface {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.catBites();
        a.dogBites();
        a.snakeBites();
    }
  
    
}
