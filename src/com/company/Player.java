package com.company;

public abstract class Player {
    private static int playerWins;
    private static int playerLosses;
    private static int playerDraws;
    private static String playerResult;

    public Player(int playerWins, int playerLosses, int playerDraws, String playerResult) {
        this.playerWins = playerWins;
        this.playerLosses = playerLosses;
        this.playerDraws = playerDraws;
        this.playerResult = playerResult;
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

    public abstract void showPlayerWins(int playerWins);

    public abstract void showPlayerLosses(int playerLosses);

    public abstract void showPlayerResults(String results);

}
