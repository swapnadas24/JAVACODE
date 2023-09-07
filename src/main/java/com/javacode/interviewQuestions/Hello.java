package com.javacode.interviewQuestions;

class Parent{
    public void parent(){
        System.out.println("I am parent");
    }
}
class childOne extends Parent{
    public void child_One(){
        System.out.println("I am first child1");
    }
}
class ChildTwo extends Parent{
    public void Child_Two(){
        System.out.println("I am 2nd child");
    }
}
public class  Hello{
    public static void main(String[] args) {

        childOne c1=new childOne();
        c1.parent();
        c1.child_One();

        ChildTwo c2=new ChildTwo();
        c2.parent();
        c2.Child_Two();

        Parent p=new Parent();
        p.parent();
    }
}



