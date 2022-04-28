package com.DBMS.finalproject;
public class Team {

    private String name;
    private String location;
    private String conference;
    private float capSpace;

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public String getConference()
    {
        return conference;
    }

    public float getCapSpace()
    {
        return capSpace;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setConference(String conference)
    {
        this.conference = conference;
    }

    public void setCapSpace(float capSpace)
    {
        this.capSpace = capSpace;
    }

    public void printTeam() 
    {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Conference: " + conference);
        System.out.println("Cap Space: " + capSpace);
    }
}
