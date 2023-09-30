package com.company;
import java.util.Random;
import java.util.Scanner;

public class J43_Guess_the_number {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s1 = new Scanner(System.in);

        System.out.println("Welcome to the \"Guess the Number game\" \nGuess number between 1 to 100");
        System.out.print("Enter a number ");
        int userNum, playAgain,computerNum,count;

        do {
            count=0;
            computerNum = rand.nextInt(100);
            computerNum = computerNum + 1;
            do {

//                System.out.println(computerNum);

                userNum = s1.nextInt();
                if (computerNum < userNum) {
                    System.out.print("Guess lower ");count++;
                } else if (computerNum > userNum) {
                    System.out.print("Guess higher "); count++;
                } else {System.out.println("Spot on");}
            } while (userNum != computerNum);
            System.out.println("You took "+count+" guesses");
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to play again");
            playAgain = s1.nextInt();
            if (playAgain == 0) {
                System.out.println("Byee");break;}
            else if (playAgain != 1) {System.out.println("Enter 0 or 1 only");}
        } while (playAgain == 1);
    }
}
