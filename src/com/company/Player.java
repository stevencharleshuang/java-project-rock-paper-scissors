package com.company;

import java.util.ArrayList;

public abstract class Player {
    private static int playerWins;
    private static int playerLosses;
    private static int playerDraws;
    private static String playerResult;
    // This will track and store the player's results
    private static ArrayList<String> playerResults;

    public Player(int playerWins, int playerLosses, int playerDraws, String playerResult, ArrayList<String> playerResults) {
        this.playerWins = playerWins;
        this.playerLosses = playerLosses;
        this.playerDraws = playerDraws;
        this.playerResult = playerResult;
        this.playerResults = playerResults;
    }

    public Player() {
    }

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

    public static ArrayList<String> getPlayerResults() {
        return playerResults;
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

    public static void setPlayerResults(ArrayList<String> playerResults) {
        Player.playerResults = playerResults;
    }

    public abstract void showPlayerWins();

    public abstract void showPlayerLosses();

    public abstract void showPlayerDraws();
}
