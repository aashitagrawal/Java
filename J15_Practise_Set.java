package com.company;
import java.util.Scanner;

import java.util.Locale;

public class J15_Practise_Set {
    public static void main(String[] args) {
        //Que 1
        String myName = "AASHIT Agrawal";
        System.out.println(myName.toLowerCase());

        //Que 2
        System.out.println(myName.replace(' ','_'));

        //Que 3
        Scanner scan = new Scanner(System.in);
        String yourName = scan.nextLine();
        System.out.printf("Dear %s, Thanks a lot!\n",yourName);

        //Que 4
        String random = "Yo ere  wd trh ergrgr ewf";
        System.out.println(random.indexOf("  "));
        System.out.println(random.indexOf("   "));

        //Que 5
        String myMessage = "\"Dear Harry,\n\tThis Java course is nice af.\n\tThanks!\"";
        System.out.println(myMessage);
    }
}
