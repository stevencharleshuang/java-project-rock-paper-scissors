package com.company;

public abstract class Player {
    private int playerWins;
    private int playerLosses;
    private String playerResult;

    public Player(int playerWins, int playerLosses, String playerResult) {
        this.playerWins = playerWins;
        this.playerLosses = playerLosses;
        this.playerResult = playerResult;
    }

    public abstract void showPlayerWins(int playerWins);

    public abstract void showPlayerLosses(int playerLosses);

    public abstract void showPLayerChoice(String playerChoice);

}
