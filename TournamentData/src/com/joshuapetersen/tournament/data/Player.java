package com.joshuapetersen.tournament.data;

public class Player
{
    String name;
    int gamesWon,totalGames,position = 1;

    public Player(String name, int gamesWon)
    {
        this.name = name;
        this.gamesWon = gamesWon;
        this.setTotalGames(0);
    }

    public String getName()
    {
        return name;
    }

    public int getGamesWon()
    {
        return gamesWon;
    }

    public int getTotalGames()
    {
        return totalGames;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setGamesWon(int gamesWon)
    {
        this.gamesWon = gamesWon;
    }

    public void setTotalGames(int totalGames)
    {
        this.totalGames = totalGames;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }
}
