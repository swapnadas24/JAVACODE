package com.javacode.practice.Examples;

class Polygon{
    public void render(){
        System.out.println("Polygon is rendering");
    }
}
class Square extends Polygon{
    public void render(){
        System.out.println("Square is rendering");
    }
}
class Circle extends Polygon{
    public void render(){
        System.out.println("Circle is rendering");
    }
}
public class Polymorphism {
public static void main(String[] args) {
    Square s=new Square();
    s.render();//Square is rendering

    Circle c=new Circle();
    c.render();//Circle is rendering

    Polygon p=new Polygon();
    p.render();//Polygon is rendering

    Polygon p1=new Circle();
    p1.render();//Circle is rendering
}
    
}
