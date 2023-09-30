package com.company;

public class J23_For_Loop {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<=10; i++)
        {
            System.out.print(2*i + " ");
        }
        System.out.println();
        for (int i=1; i<=10; i++)
        {
            System.out.print(2*i+1 + " ");
        }
        System.out.println();

        //Quick Quiz
        int n =10;
        for (int i =n; i>0; i--)
        {
            System.out.print(i + " ");
        }
    }
}
