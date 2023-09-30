package com.company;

public class J24_Break_and_Continue {
    public static void main(String[] args) {
        //break
//        int n=1;
//        while (true)
//        {
//            System.out.print(n  + " ");
//            if(n==3)
//            {
//                break;
//            }
//            n++;
//        }
//        System.out.println();

        //continue
        int k=0;
        while (k<=5)
        {
            k++;
            if(k==2)
            {
                continue; //what continue do is, it does not read what is there after it, and continues towards next iteration
            }
            System.out.print(k + " ");
        }
    }
}
