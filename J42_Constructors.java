package com.company;

class Animals{
    String name;
    int age;

    public String getName(){return name;}
    public int getAge(){return age;}

    public Animals(String n, int a){
        name = n;
        age = a;
    }
    public Animals(){
        name = "blue whale";
        age = 100;
    }
}

public class J42_Constructors {
    public static void main(String[] args) {
        Animals dog = new Animals("chihuahua",15); //method overloading
        Animals bw = new Animals(); //method overloading
        Animals cat = new Animals("Bengal cat", 20);

        System.out.println(dog.getName() +" " + dog.getAge());
        System.out.println(bw.getName() + " " + bw.getAge());
        System.out.println(cat.getName() + " "+cat.getAge());
    }
}
