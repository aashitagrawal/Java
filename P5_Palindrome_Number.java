package com.company;
import java.util.Scanner;

public class P5_Palindrome_Number {
    static int checkReverse(int n)
    {
        int temp,rem,rev=0;
        temp=n;
        while (temp!=0) {
            rem = temp % 10;
            rev = rev*10 + rem;
            temp = temp / 10;
        }
        if(n==rev)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Print all prime palindrome numbers till N");
        System.out.print("N = ");
        int n = s1.nextInt();
        int check,count=0;
        for(int i=10; i<=n; i++)
        {
            for (int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    break;
                }
                else if(j==(i-1))
                {
                    check = checkReverse(i);
                    if(check==1)
                    {
                        if(count==15)
                        {
                            System.out.println();
                            count=0;
                        }
                        System.out.print(i +", ");
                        count++;

                    }
                }
            }
        }
        System.out.println("\b\b");
    }
}
