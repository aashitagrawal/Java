package com.company;
import java.util.Scanner;

public class J18_Else_If_Ladder_SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }


        switch(age)
        {
            case 18:
                System.out.println("You r 18");
                break;
            case 21:
                System.out.println("you r 21");
                break;
            default:
                System.out.println("HEHEHHEHE");
        }

        //enhanced switch -- here break; is understood
        switch (age) {
            case 18 -> System.out.println("You r 18");
            case 21 -> System.out.println("you r 21");
            default -> System.out.println("HEHEHHEHE");
        }
    }
}
