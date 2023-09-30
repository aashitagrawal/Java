package com.company;
import java.util.Scanner;

public class J29_Practise_Set {
    public static void main(String[] args) {
        //Que 1
        float sum=0f;
        float [] marks = {3.12f, 3.656f, 7.345f, 8.343f, 9.9f};
        for(int i=0; i< marks.length; i++)
        {
            sum=sum+ marks[i];
        }
        System.out.println(sum);
        System.out.println();

        //Que 2
        boolean isInArray =false;
        System.out.println("Enter a number to check if its in a given array or not");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int [] givenArray = {1,2,3,4,5,6,7,8,9,10};
        for(int abc:givenArray)
        {
            if(num==abc)
            {
                System.out.println("Your number is in the given array :) ");
                isInArray =true;
                break;
            }
        }
        if(isInArray==false)
        {
            System.out.println("Your number is not in the given array :( ");
        }
        System.out.println();


        //Que 3
        sum=0;
        for(float abcd:marks)
        {
            sum=sum+abcd; //abcd ek float hai jiske andar "marks" array ka element store ho jata hai
        }
        System.out.println((float)(sum/5));
        System.out.println();


        //Que 4
        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{1,2,3},{4,5,6}};
        int [][]result = new int[2][3];
        for (int i=0; i<2; i++)
        {
            for (int j=0; j<3; j++)
            {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0; i<2; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        //Que 5
        int [] rev1 = {1,2,3,4,5};
        int [] rev2 = new int[5];
        for (int i =0; i< rev1.length; i++)
        {
            rev2[i]=rev1[rev1.length-1-i];
        }
        for (int ele:rev2)
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        //or
//        int x = Math.floorDiv(6,4); //GIF of x/y
//        System.out.println(x);

        int x = Math.floorDiv(rev1.length,2);
        for (int i=0; i<=x; i++)
        {
            int temp;
            temp = rev1[i];
            rev1[i]=rev1[rev1.length-1-i];
            rev1[rev1.length-1-i]=temp;

        }
        for (int ele2:rev1)
        {
            System.out.print(ele2 + " ");
        }
        System.out.println();


        //Que 6
        int [] matMaxCheck = {1,2,3,4,5,6,67,234,8976,6969};
        int max = matMaxCheck[0];
        for (int i=1; i<matMaxCheck.length; i++)
        {
            if(matMaxCheck[i]>max)
            {
                max=matMaxCheck[i];
            }
        }
        System.out.println(max);
        System.out.println();


        //Que 7
        int [] matMinCheck = {1,2,3,4,5,6,67,234,8976,6969,0};
        int min=matMinCheck[0];
        for (int ele:matMinCheck)
        {
            if(ele<min)
            {
                min=ele;
            }
        }
        System.out.println(min);
        System.out.println();


        //Que 8
        boolean check = true;
        int [] sort = {1,2,3,4,5,6,67,234,8976,9999};
        for (int i=1; i<sort.length; i++)
        {
            if(sort[i-1]>sort[i])
            {
                System.out.println("Its not sorted");
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println("Its sorted");
        }
        System.out.println();


    }
}
