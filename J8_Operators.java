package com.company;

public class J8_Operators {
    public static void main(String[] args) {

        //Types of operators

        //1. Arithematic operators
        int a,b,c;
        a=7;
        b=5;
        c=9;
        System.out.println("+" + (a+b) +"-" + (a-b) + "*" +(a*b) + "/" +(a/b) + "%" +(a%b) +"a++" + (a++) +"++a" + (++a) + "a--" +(a--) + "--a" +(--a));


        //2. Assignment operators
        a+=3; // meaning  add 3 to 'a'
        // meaning a = a+3
        System.out.println(a);
        a-=3;
        System.out.println(a);
        b*=3;
        System.out.println(b);
        c/=3;
        System.out.println(c);
        a%=4;
        System.out.println(a);

        //3. Comparison op
        System.out.println("\n\n" + (a==b));
        System.out.println(a<b);
        System.out.println(a>b);
        a=6;
        System.out.println(a>=6);
        System.out.println(a<=5);

        //4. Logical op
        System.out.println("\n logical op");
        System.out.println(7<9 && 7>10);
        System.out.println(7<9 && 9<10);
        System.out.println(7>9 && 7>1);
        System.out.println(1>0 || 1<0);
        System.out.println(1!=0 && 1>0);

        //5. Bitwise op
        /* Explaination
        2 in binary is "10", and 3 is "11"
        if we add 2 and 3 in BITWISE,
        10 (1=true, 0=false)
        11 (1=true, 1=true)
        -----
        10 (1 = true+ture, 0 = false + true)
        so BITWISE addition is giving 10, 10 is "2" in decimal so output will be 2
        The output of bitwise AND is 1 if the corresponding bits of two operands is 1. If either bit of an operand is 0, the result of corresponding bit is evaluated to 0.
        The output of bitwise OR is 1 if at least one corresponding bit of two operands is 1. In C Programming, bitwise OR operator is denoted by |.
         & = BITWISE AND
         | = BITWISE OR
         basically, addition is in binary, output is in decimal     */

        System.out.println("\n");
        System.out.println(2&3);
        System.out.println(2|3);

    }
}
