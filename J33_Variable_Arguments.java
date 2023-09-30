package com.company;

public class J33_Variable_Arguments {

    static int sum(int ...anyName)
    {
        int add=0;
        //it is available as int [] anyName
        for(int ele:anyName)
        {
            add=add+ele;
        }
        return add;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 and 4 is " + sum(2,4)); //it takes all the arguments and put it in the array
        System.out.println("Sum of 2, 4 and 6 is "+ sum(2,4,6));

    }
}
