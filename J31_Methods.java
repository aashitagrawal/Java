package com.company;

public class J31_Methods {
    static int sum(int x, int y)
    {
        int z;
        z=x+y;
        return z;
    }
    //static nahi use karna toh
    int diff(int x, int y)
    {
        int z;
        z=x-y;
        return z;
    }

    static void gm()
    {
        System.out.println("Good Morning!");
    }

    public static void main(String[] args) {
        int num1=4, num2=7;
        int result;
        result=sum(num1,num2);
        System.out.println(result);

        //static nahi use karna toh object banao
        J31_Methods anyName= new J31_Methods();
        result = anyName.diff(num1,num2);
        System.out.println(result);
        gm();
    }
}
