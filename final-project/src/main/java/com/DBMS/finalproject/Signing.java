package com.DBMS.finalproject;

public class Signing {

    private String teamName;
    private String playerFirstName;
    private String playerLastName;
    private int years;
    private float contractValue;
    private boolean playerOption;

    public String getTeamName()
    {
        return teamName;
    }

    public String getPlayerFirstName()
    {
        return playerFirstName;
    }

    public String getPlayerLastName()
    {
        return playerLastName;
    }

    public int getYears()
    {
        return years;
    }

    public float getContractValue()
    {
        return contractValue;
    }

    public boolean getPlayerOption()
    {
        return playerOption;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public void setPlayerFirstName(String playerFirstName)
    {
        this.playerFirstName = playerFirstName;
    }

    public void setPlayerLastName(String playerLastName)
    {
        this.playerLastName = playerLastName;
    }

    public void setYears(int years)
    {
        this.years = years;
    }

    public void setValue(float contractValue)
    {
        this.contractValue = contractValue;
    }

    public void setPlayerOption(boolean playerOption)
    {
        this.playerOption = playerOption;
    }

    public void printSigning()
    {
        System.out.println("Team Name: " + teamName);
        System.out.println("Player Name: " + playerFirstName + " " + playerLastName);
        System.out.println("Years: " + years);
        System.out.println("Value: " + contractValue);
        System.out.println("Player Option: " + playerOption);
    }
}
