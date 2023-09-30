package com.company;

public class J32_Method_Overloading {

    static void changeInt(int x)
    {
        x=108;
    }

    static void changeArray(int [] arr)
    {
        arr[0]=16108;
    }

    static void foo()
    {
        System.out.println("Heyy");
    }

    static void foo(int a)
    {
        System.out.println("Heyy" + a);
    }

    public static void main(String[] args) {
        int a=16; //here 'a' ki value will be copied to 'x' and hence it will not the value
        changeInt(a);
        System.out.println(a);


        int [] marks = {99, 98, 76, 89}; //here "marks" is the address of the array, array is a fixed object in the MEMORY, when we change use method in it, the marks' address will be copied to "arr" and now "arr" is pointing to the OBJECT array, hence it will change the value
        changeArray(marks);
        System.out.println(marks[0]);
        //bottom line = in integer value is being copied, in array reference(address) is passed


        //Method Overloading
        //we can have same name of function but different number of paramenters, you cant have = same name,diff type int/void, same number of paramenter, YOU CAN HAVE = same name, same type int/void, diff number of paramenter
        foo();
        foo(16108); //here 'a' is argument because we are giving value to it, it were a parameter if it was yet to be given any value


    }
}
