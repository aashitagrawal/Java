package com.company;

class donkeys{
    int id;
    String name;
}

class testa{
    int marks;
    String name;
    public void printIt()
    {
        System.out.print("My name is "+name+". My marks is "+marks+"\n");
    }
}

public class J38_Custom_Java_Class {
    public static void main(String[] args) {
        donkeys abc = new donkeys(); //instantiating a new donkey object
        abc.id = 1; //Setting the attributes
        abc.name = "Gadha Prasad";
        System.out.println(abc.id + "\n" +abc.name); //printing the attributes

        testa student1 = new testa();
        testa student2 = new testa();
        student1.name = "ABC DEF";
        student1.marks = 99;

        student2.name = "GHI JLK";
        student2.marks = 79;

        student1.printIt();
        student2.printIt();

    }
}
