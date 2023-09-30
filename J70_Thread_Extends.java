package com.company;

class myThread1 extends Thread{
    public void run()
    {
        int i=1;
        while(i<2000)
        {
            System.out.println("I am cooking a dish");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run()
    {
        int i=1;
        while(i<2000)
        {
            System.out.println("Washing!");
            i++;
        }
    }
}

public class J70_Thread_Extends {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
