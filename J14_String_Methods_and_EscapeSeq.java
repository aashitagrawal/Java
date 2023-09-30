package com.company;

public class J14_String_Methods_and_EscapeSeq {
    public static void main(String[] args) {
        String name = "AAshit AGrawal";

        //length
        int value = name.length();
        System.out.println(value);
        //or
        System.out.println(name.length());


        //Lowercase
        String name1 = name.toLowerCase();
        System.out.println(name1);
        //or
        System.out.println(name.toLowerCase());


        //Uppercase
        String name2 = name.toUpperCase();
        System.out.println(name2);
        //or
        System.out.println(name.toUpperCase());


        //Trim
        String nonTrimmed = "     Aashit Agrawal    ";
        System.out.printf("Normal =\n  %s\n",nonTrimmed);
        //now
        String name3 = nonTrimmed.trim();
        System.out.println(name3);
        //or
        System.out.println(nonTrimmed.trim());


        //Substring
        //if substring(3) --> meaning start with 3rd letter and prints all letter from there
        //note in Aashit = A=0,a=1,s=2,h=3,i=4,t=5; --> basically starts with 0
        System.out.println(name.substring(3));

        //if substring(3,10) --> meaning starts from 3 ends at 9, 10 not included
        System.out.println(name.substring(3,10));


        //Replace
        System.out.println(name.replace('a','b'));
        System.out.println(name.replace("shit","poop"));
        String CWH = "Harry";
        System.out.println(CWH.replace('r','p').replace("y","ier"));


        //Starts with and Ends with
        System.out.println(name.startsWith("AAs"));
        System.out.println(name.startsWith("Aas"));
        System.out.println(name.endsWith("wal"));


        //print specific char
        System.out.println(name.charAt(3));


        //Index of --- gives position of specific char
        System.out.println(name.indexOf('s'));
        String modifiedName = "Aashit agrawal";
        System.out.println(modifiedName.indexOf('a',4)); //position of a, start searching from 4th position


        //lastIndexOf ---- same as index of, just it start searching from last character
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('A',6)); // start searching from 6, backwards


        //equals
        System.out.println(name.equals("AAshit AGrawal")); //it should match the string character to character - case sensitive
        System.out.println(name.equalsIgnoreCase("aashit agrawal")); //same as equal but case insensitive




        //ESCAPE SEQUENCE CHARACTER
        //if you want to print ' " / etc
        // you need to write backslash before it
        System.out.println(" \' \" \\");
        System.out.println(" \n \t a\b");
        // \n is new line, \t is tab, \b is backspace


    }
}
