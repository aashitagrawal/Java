package com.company;

class Grandfather{
    Grandfather()
    {
        System.out.println("Grandfather here");
    }
    Grandfather(int a)
    {
        System.out.println("Grandfather with value a = "+a);
    }
}
class Father extends Grandfather{
    Father()
    {
        System.out.println("Father here");
    }
    Father(int a, int b)
    {
        super(a);
        System.out.println("Father with value b = "+b);
    }
}
class Child extends Father{
    Child()
    {
        System.out.println("Child here");
    }
    Child(int a, int b, int c)
    {
        super(a,b);
        System.out.println("Child with value of c ="+c);
    }
}

public class J46_Constructors_Inheritance {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        System.out.println();
        Father f = new Father();
        System.out.println();
        Child c = new Child();
        System.out.println();

        Child c1 = new Child(3,2,1);

    }
}
