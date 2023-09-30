package com.company;

public class J27_For_Each_Loop_Arrays {
    public static void main(String[] args) {
        int [] marks = {100,70,34,45,56};
        System.out.println(marks.length); //new thing to me
        String [] students = {"Abhudaya","Boolean", "Chacter"};

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i]);
        }
        System.out.println();
        for (int i= marks.length-1; i>=0;i--)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println();


        //new thing - for each loop in Java
        for(String ele:students)
        {
            System.out.println(ele);
        }
        System.out.println();
        for(int ele2:marks)
        {
            System.out.print(ele2 + " ");
        }
        System.out.println();

    }
}
