package com.company;
import java.util.Scanner;

public class J13_Strings_and_print_diff_methods {
    public static void main(String[] args) {
        String name = "AAshit Agrawal";
        //or
        // String name = new String("Aashit Agrawal");
        // both works
        System.out.println(name);

        System.out.print("abcd"); // doesnt print a new line
        System.out.println("efgh"); //prints a new line
        System.out.printf("my name is %s",name); // just like C/C++ ,%d=int, %f=float, %c=char, %s=string
        System.out.format("\n my name is %s \n\n",name); //same as printf

        Scanner sc = new Scanner(System.in);
        String aap;
        aap = sc.next();
        System.out.println(aap);

        //new thing for me
//        float f1 = 57.5; //this will give error
        float f2 = 12.3456f; //you have to write 'f' otherwise it will consider it as float; Coding notes Vid 4
        System.out.printf("%.3f\n",f2);
        //this is round off to 3 decimal and print

        System.out.printf("%10f\n",f2);
        // in total including "." and all digits and spaces -- there will be 10 spaces

        System.out.printf("%15.4f",f2);
        //Total of 15 spaces with only 4 decimal digits

    }
}
