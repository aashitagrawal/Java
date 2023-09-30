package com.company;
class MyyEmployee{
    private int id;
    private String name;
    public int getId(){return id;}
    public String getName(){return name;}
    public void setId(int n){id=n;}
    public void setName(String n){name=n;}
}

public class J40_Access_modifiers_getters_setters {
    public static void main(String[] args) {
        MyyEmployee harry = new MyyEmployee();
        MyyEmployee asss = new MyyEmployee();
        harry.setId(1);
        asss.setId(2);
        harry.setName("harry");
        asss.setName("AAAAA");
        System.out.println(harry.getId() + " " + asss.getId() + harry.getName() + asss.getName());
    }
}
