package com.company;

import java.util.Map;
import java.util.Scanner;

public class PlayHuman implements GameFlowInterface {
    private GameLogic gameLogic = new GameLogic();

    public PlayHuman() {
        Scanner scanner = new Scanner(System.in);

        // Print welcome and menu for single player mode
        System.out.println(
                "\nEnter the Thunderdome!\n" +
                        "===========================================\n" +
                        "Type:\n" +
                        "1. 'rock'\n" +
                        "2. 'paper'\n" +
                        "3. 'scissors'\n\n" +
                        "Player 1, make your move...");

        // Get the play selections from User1 and User2
        String player1Choice = scanner.nextLine().toLowerCase().trim();
        player1Choice = getPlayerChoice(player1Choice);

        System.out.println("Player 2, make your move...");

        String player2Choice = scanner.nextLine().toLowerCase().trim();
        player2Choice = getPlayerChoice(player2Choice);

        // Switch statement to handle Users' inputs
        switch (player1Choice) {
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

        playAgain(scanner);
    }

    @Override
    public void playAgain(Scanner scanner) {
        // Option to continue game mode or return to Main Menu
        System.out.println(
                "\nMOAR?\n" +
                        "===========================================\n" +
                        "1. Type 'moar' to play again\n" +
                        "2. Type 'menu' to return to main menu\n");

        String playAgain = scanner.nextLine().toLowerCase().trim();

        // Handle User input
        if (playAgain.equals("moar") || playAgain.equals("1")) {
            PlayHuman playHuman = new PlayHuman();
        } else if (playAgain.equals("menu") || playAgain.equals("2")) {
            Console console = new Console();
        } else {
            System.out.println("Please type 'moar' or 'menu'...");
            playAgain(scanner);
        }
    }

    // Outputs the result of the game to the Users
    private void play(Map<String, String> player1Play, String player2Play) {
        if (player2Play.equals(player1Play.get("wins"))) {
            System.out.println("Player 1 played, '" + player1Play.get("type") +
                    "'. Player 2 played, '" +
                    player2Play +
                    "'");
            System.out.println("Player 1 wins! =D\n" + "Sorry, Player 2 =(");
        } else if (player2Play.equals(player1Play.get("loses"))) {
            System.out.println("Player 1 played, '" + player1Play.get("type") +
                    "'. Player 2 played, '" +
                    player2Play +
                    "'");
            System.out.println("Player 2 wins! =D\n" + "Sorry, Player 1 =(");
        } else {
            System.out.println("Player 1 played, '" + player1Play.get("type") +
                    "'. Player 2 played, '" +
                    player2Play +
                    "'");
            System.out.println("It's a draw! You both lose...LOL");
        }
    }

    // Get Player 1 choice
    private String getPlayerChoice(String playerChoice) {
        String choice = "";
        // Switch statement to handle Users' inputs
        switch (playerChoice) {
            case "rock":
            case "r":
            case "1":
                choice = gameLogic.getRock().get("type");
                break;
            case "paper":
            case "p":
            case "2":
                choice = gameLogic.getPaper().get("type");
                break;
            case "scissors":
            case "s":
            case "3":
                choice = gameLogic.getScissors().get("type");
                break;
            default:
                System.out.println(
                        "Someone's messed up their inputs...\n" +
                                "let's try that again...\n" +
                                "===========================================\n");
                PlayHuman playHuman = new PlayHuman();
                break;
        }
        return choice;
    }
}

