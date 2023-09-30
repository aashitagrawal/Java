package com.company;
import java.util.Scanner;

public class J12_Practise_Set {
    public static void main(String[] args) {
        //Ques 1
        float a = 7/4 * 9/2; //now precedence sholud be left to right
        //but here 7,4 & 9,2 are considered as integer
        //so 7/4 will give integer, as both 7&4 are integer,
        //so 7/4 = 1,and 9*1 =9
        // and 9/2=4, as 4.5 will be considered as integer so decimal will be ingnored

        //in order to make them consider as Float
        System.out.println(a);

        float b = 7/4.f * 9/2.f; //now it will give correct result
        System.out.println(b);




        //Ques 2
        //Assuming -> Higher the alphabet = better your grade :)
        char grade;
        System.out.println("Enter your original grade");
        Scanner s1 = new Scanner(System.in);
        grade = s1.next().charAt(0);
        System.out.println("Show this grade to your Dad");
        grade = (char)(grade + 8);
        /*Here what is did is
        first 8 is just random number
        grade + 8 that is char+int will give us int -> we learnt this in J10
        but we want result in char, so I put (char)
         */
        System.out.println(grade);

        //Now decrypting the grade
        grade = (char)(grade-8);
        System.out.println("Your original \"decrypted\" grade is "+grade);


        //Ques 3
        System.out.println("\n\n");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter a number to check if its bigger than my number");
        int d = s2.nextInt();
        System.out.println(d>50);


    }
}
