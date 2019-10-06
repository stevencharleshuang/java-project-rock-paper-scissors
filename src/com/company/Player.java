package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private static int playerWins;
    private static int playerLosses;
    private static int playerDraws;
    private static String playerResult;
    private static List<String> playerResults;

    public Player(int playerWins, int playerLosses, int playerDraws, String playerResult, List<String> playerResults) {
        this.playerWins = playerWins;
        this.playerLosses = playerLosses;
        this.playerDraws = playerDraws;
        this.playerResult = playerResult;
        this.playerResults = playerResults;
    }

    public Player() { }

    // Player Accessors
    public int getPlayerWins() {
        return playerWins;
    }

    public int getPlayerLosses() {
        return playerLosses;
    }

    public static int getPlayerDraws() {
        return playerDraws;
    }

    public String getPlayerResult() {
        return playerResult;
    }

    // Player Mutators
    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }

    public void setPlayerLosses(int playerLosses) {
        this.playerLosses = playerLosses;
    }

    public static void setPlayerDraws(int playerDraws) {
        Player.playerDraws = playerDraws;
    }

    public void setPlayerResult(String playerResult) {
        this.playerResult = playerResult;
    }

    public abstract void showPlayerWins();

    public abstract void showPlayerLosses();

    public abstract void showPlayerDraws();

    public abstract void showPlayerResults(String results);

}
