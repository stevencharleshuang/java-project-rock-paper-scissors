package com.company;

public class History extends Player {

    @Override
    public void showPlayerWins() {
        System.out.println(getPlayerWins());
    }

    @Override
    public void showPlayerLosses() {
        System.out.println(getPlayerLosses());
    }

    @Override
    public void showPlayerDraws() {
        System.out.println(getPlayerDraws());
    }

    @Override
    public void showPlayerResults(String results) {
        System.out.println(getPlayerResult());
    }
}
