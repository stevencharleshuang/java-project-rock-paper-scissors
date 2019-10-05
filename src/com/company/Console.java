package com.company;

import java.util.Scanner;

public class Console {
    public Console() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Welcome to Rock, Paper, Scissors! \n\n" +
            "MAIN MENU\n" +
            "===========================================\n" +
            "1. Type '1p' to play against the computer\n" +
            "2. Type '2p' to play 2 player mode\n" +
            "3. Type 'history' to view your game history\n" +
            "4. Type 'quit' to stop playing");

        String mainMenuChoice = scanner.nextLine();

        switch(mainMenuChoice) {
            case "1p":
                System.out.println("Going solo!");
                initGame("1p");
                break;
            case "2p":
                System.out.println("Bring it on!");
                initGame("2p");
                break;
            case "history":
                System.out.println("History of the World Part I");
                showHistory();
                break;
            case "quit":
                System.out.println("Thanks for playing!");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void initGame(String mode) {
        Game game = new Game();
        game.setGameMode(mode);
        game.playGame();
    }

    public void showHistory() {}
}
