package com.DBMS.finalproject;

public class Player {

    private String name;
    private String position;
    private int number;
    private boolean signed = false;

    public String getName()
    {
        return name;
    }

    public String getPosition()
    {
        return position;
    }

    public int getNumber()
    {
        return number;
    }

    public boolean getSigned()
    {
        return signed;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setSigned(boolean signed)
    {
        this.signed = signed;
    }

    public void printPlayer()
    {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Number: " + number);
        System.out.println("Signed: " + signed);
    }
}
