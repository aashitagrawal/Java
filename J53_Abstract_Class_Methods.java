package com.company;

abstract class Shape{
    Shape(){
        System.out.println("Select a shape");
    }
    abstract public void myShape();
    abstract public void numberOfSides(); //jab tak saare function define nahi kar lenge tab tak function ke piche abstract lagega
}
class Circle extends Shape{
    @Override
    public void myShape() {
        System.out.println("I am a Circle");
    }
    public void numberOfSides(){
        System.out.println("0 haha");
    }
}
abstract class Rectangle extends Shape{
    @Override
    public void myShape() {
        System.out.println("I am a Rectangle");
    }
}
class completeRect extends Rectangle{
    @Override
    public void numberOfSides() {
        System.out.println("4 sides");
    }
}

public class J53_Abstract_Class_Methods {
    public static void main(String[] args) {
        System.out.println("Hello welcome!");
//      Shape s = new Shape(); --error
        Circle c = new Circle();
        c.myShape();
        c.numberOfSides();
//      Rectangle r = new Rectangle(); -- error
        completeRect r = new completeRect();
        r.myShape();
        r.numberOfSides();
    }
}
