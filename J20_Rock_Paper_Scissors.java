package com.company;
import java.util.Random;
import java.util.Scanner;


public class J20_Rock_Paper_Scissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int computerChoice = rand.nextInt(3); //chooses 0 or 1 or 2
        System.out.println("Press\n0 for Rock\n1 for Paper\n2 for Scissors");
        Scanner s1 = new Scanner(System.in);
        int userChoice = s1.nextInt();
        if(userChoice==0)
        {
            System.out.println("You choosed Rock");
        }
        else if(userChoice==1)
        {
            System.out.println("You choosed Paper");
        }
        else if (userChoice==2)
        {
            System.out.println("You choosed Scissors");
        }
        else
        {
            System.out.println("Enter a valid input :( ");
        }

        if(computerChoice==0)
        {
            System.out.println("Computer choosed Rock");
        }
        else if(computerChoice==1)
        {
            System.out.println("Computer choosed Paper");
        }
        else if (computerChoice==2)
        {
            System.out.println("Computer choosed Scissors");
        }

        if((userChoice==0 && computerChoice==0) || (userChoice==1 && computerChoice==1) || (userChoice==2 && computerChoice==2))
        {
            System.out.println("Its a tie");
        }
        if( (userChoice==0 && computerChoice==2) ||(userChoice==1 && computerChoice==0) ||(userChoice==2 && computerChoice==1))
        {
            System.out.println("You won ;) ");
        }
        if((userChoice==0 && computerChoice==1) || (userChoice==1 && computerChoice==2) || (userChoice==2 && computerChoice==0))
        {
            System.out.println("You lost :( ");
        }
    }
}
