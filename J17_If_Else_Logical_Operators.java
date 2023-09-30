package com.company;

public class J17_If_Else_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
//        boolean c = true;
//        boolean d = false;

        // a && b meaning -- both a and b sholud be true, then only is print 'Y'
        // a || b meaning -- if anyone one of them is true, then it will print 'Y'
        if (a && b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        if(a || b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println(!a);
        System.out.println(!b);
    }
}
