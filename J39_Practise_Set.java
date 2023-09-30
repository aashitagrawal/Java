package com.company;
import java.util.Scanner;

class Employee{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

class Square{
    float side,perimeter,area,diagonal;
    public void setSide(float n)
    {
        side=n;
    }
    public void printSide() {
        System.out.println("Side length is "+side);
    }
    public void printPerimeter(){
        System.out.println("Perimeter is "+(4*side));
    }
    public void printArea(){
        System.out.println("Area is "+ (side*side));
    }
    public void printDiagonal(){
        System.out.println("Diagonal is "+(1.414*side));
    }
}

public class J39_Practise_Set {
    public static void main(String[] args) {

        //Que 1
        Employee ash = new Employee();
        Employee ashKaBachha = new Employee();
        ash.name = "Anshu Ash";
        ash.salary = 20300000;
        ashKaBachha.salary = 2300000;
        System.out.println("Name is "+ash.getName()+" and salaray is "+ash.getSalary());
        Scanner s1 = new Scanner(System.in);
        System.out.println("Naam karan karo ash ke bacche ka ");
        String naamKaran = s1.nextLine();
        ashKaBachha.setName(naamKaran);
        System.out.println("Name is "+ashKaBachha.getName()+" and salaray is "+ashKaBachha.getSalary());


        //Que 3
        Square test1 = new Square();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter side length of Sqaure 1 ");
        float square1 = s2.nextFloat();
        test1.setSide(square1);
        System.out.println("Enter side length of Sqaure 2 ");
        float square2 = s2.nextFloat();
        Square test2 = new Square();
        test2.setSide(square2);
        System.out.println("Enter side length of Sqaure 3 ");
        float square3 = s2.nextFloat();
        Square test3 = new Square();
        test3.setSide(square3);
        System.out.println("Square 1");
        test1.printSide();
        test1.printPerimeter();
        test1.printArea();
        test1.printDiagonal();
        System.out.println("square 2");
        test2.printSide();
        test2.printPerimeter();
        test2.printArea();
        test2.printDiagonal();
        System.out.println("Square 3");
        test3.printSide();
        test3.printPerimeter();
        test3.printArea();
        test3.printDiagonal();

    }
}
