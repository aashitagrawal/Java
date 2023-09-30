package com.company;
import java.util.Scanner;
public class J16_If_Else_Relational_Operators {
    public static void main(String[] args) {
        Scanner ash = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = ash.nextInt();
        if(age>=18)
        {
            System.out.println("You can drive");
        }
        else
        {
            System.out.println("You cannot drive yet");
        }
    }
}
