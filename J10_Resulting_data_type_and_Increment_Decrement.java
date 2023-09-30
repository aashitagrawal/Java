package com.company;

public class J10_Resulting_data_type_and_Increment_Decrement {
    public static void main(String[] args) {

        int x=4, y=4;

        int a = ++x;
        // first 4 is increased then it is assigned to 'a'
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        int b = y++;
        // first 4 is assigned to b, then it is incresed
        System.out.println("b = " +  b);
        System.out.println("y = " + y);

        int c=7;
        System.out.println(++c * 8);

        char d = 'a';
        System.out.println("d before = " + d);
        d++;
        System.out.println("d after = " + d);

        char e = 'z';
        e++;
        System.out.println("e = " + e);
    }
}
