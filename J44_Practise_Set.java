package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int surfaceArea()
    {
        return (int) ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
    }
}

public class J44_Practise_Set {
    public static void main(String[] args) {
        //que 1
//        Cylinder c1 = new Cylinder();
//        c1.setRadius(7);
//        c1.setHeight(5);
//        System.out.println("Volume of cylinder is " + (int)(3.14 * c1.getRadius()  * c1.getRadius() * c1.getHeight() ));
//        System.out.println("Surface area is "+c1.surfaceArea());

        //que 2
        Cylinder c2 = new Cylinder(4,3);
        System.out.println("Surface area = "+c2.surfaceArea());


    }
}
