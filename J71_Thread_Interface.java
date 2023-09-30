package com.company;

class myRunnable1 implements Runnable{
    public void run()
    {
        int i=1;
        while(i<2000)
        {
            System.out.println("Hare Krishna Hare Krishna Krishna Krishna");
            i++;
        }
    }
}
class myRunnable2 implements Runnable{
    public void run()
    {
        int i=1;
        while(i<2000)
        {
            System.out.println("Hare Hare");
            i++;
        }
    }
}

public class J71_Thread_Interface {
    public static void main(String[] args) {
        myRunnable1 t1 = new myRunnable1();
        myRunnable2 t2 = new myRunnable2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
