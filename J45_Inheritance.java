package com.company;

class FatherClass{
    public int x;
    public void setX(int a)
    {
        x=a;
    }
    public int getX()
    {
        return x;
    }
}

class ChildClass extends FatherClass{
    public int y;
    public void setY(int a)
    {
        y=a;
    }
    public int getY()
    {
        return y;
    }
}

public class J45_Inheritance {
    public static void main(String[] args) {
        FatherClass f = new FatherClass();
        f.setX(5);
        System.out.println(f.getX());

        ChildClass c = new ChildClass();
        c.setX(4);
        System.out.println(c.getX());
        c.setY(3);
        System.out.println(c.getY());

    }
}
