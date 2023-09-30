package com.company;
import java.util.Scanner;
//new thing for me

public class J5_scanner {
    public static void main(String[] args) {
        Scanner ash = new Scanner(System.in);

        //adding two numbers
        int a,b;
        System.out.println("Enter num1 ");
        a = ash.nextInt();
        System.out.println("Enter num2 ");
        b = ash.nextInt();
        System.out.println("Sum is " + (a+b));

        //checking input is integer or not
        System.out.println("\n \nCheck if its integer or not");
        boolean check = ash.hasNextInt();
        System.out.println(check);


        //exploring string

        Scanner ash2 = new Scanner(System.in);
        Scanner ash3 = new Scanner(System.in);



        System.out.println("\n\nEnter a sentence"); // ** use diffrent scanner for string , idk why**
        String s1 = ash2.next(); //next only prints first word of sentence
        System.out.println(s1);
        System.out.println("now enter again");
        String s2 = ash3.nextLine(); // next line prints whole sentencee
        System.out.println(s2);


    }
}
