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
            "Type:\n" +
            "1. 'rock'\n" +
            "2. 'paper'\n" +
            "3. 'scissors'\n\n" +
            "Player 1, make your move...");

        String player1Choice = scanner.nextLine().toLowerCase().trim();

        System.out.println("Player 2, make your move...");

        String player2Choice = scanner.nextLine().toLowerCase().trim();

        switch(player1Choice) {
            case "rock":
            case "r":
            case "1":
                play(gameLogic.getRock(), player2Choice);
                break;
            case "paper":
            case "p":
            case "2":
                play(gameLogic.getPaper(), player2Choice);
                break;
            case "scissors":
            case "s":
            case "3":
                play(gameLogic.getScissors(), player2Choice);
                break;
            default:
                break;
        }

        System.out.printf(
                "\nMOAR?\n" +
                        "=====================================\n" +
                        "1. Type 'moar' to play again\n" +
                        "2. Type 'menu' to return to main menu\n");

        String playAgain = scanner.nextLine().toLowerCase().trim();

        if (playAgain.equals("moar") || playAgain.equals("1")) {
            PlayHuman playHuman = new PlayHuman();
        } else {
            Console console = new Console();
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

