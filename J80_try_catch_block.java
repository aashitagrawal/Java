package com.company;

public class J80_try_catch_block {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        //without try
//        int c = a/b;
//        System.out.println(c);
        // error aa gayi

        //with try
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e1){
            System.out.println("Exception aa gayi : ");
            System.out.println(e1);
        }
        //what try catch do is, if exception occurs, it does not terminate the program and continues it

    }
}
