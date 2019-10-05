package com.company;

import java.util.Map;
import java.util.Scanner;

public class PlayHuman {
    private GameLogic gameLogic = new GameLogic();

    public PlayHuman() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nEnter the Thunderdome!\n" +
            "==================================\n" +
            "Type 'rock', 'paper' or 'scissors'\n\n" +
            "Player 1, make your move...");

        String player1Choice = scanner.nextLine().toLowerCase();

        System.out.println("Player 2, make your move...");

        String player2Choice = scanner.nextLine().toLowerCase();

        switch(player1Choice) {
            case "rock":
                play(gameLogic.getRock(), player2Choice);
                break;
            case "paper":
                play(gameLogic.getPaper(), player2Choice);
                break;
            case "scissors":
                play(gameLogic.getScissors(), player2Choice);
                break;
            default:
                break;
        }
    }

    void play(Map<String, String> player1Play, String player2Play) {
        if (player2Play.equals(player1Play.get("wins"))) {
            System.out.println("Player 1 wins! =D\n" + "Sorry, Player 2 =(");
        } else if (player2Play.equals(player1Play.get("loses"))) {
            System.out.println("Player 2 wins! =D\n" + "Sorry, Player 1 =(");
        } else {
            System.out.println("It's a draw! You both lose...LOL");
        }
    }
}

