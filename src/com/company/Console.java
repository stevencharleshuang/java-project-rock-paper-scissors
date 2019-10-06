package com.company;

import java.util.Scanner;

public class Console {
    public Console() {
        Scanner scanner = new Scanner(System.in);

        // Print Welcome and Main Menu
        // All numerated menu options accept numerical input
        System.out.println(
            "Welcome to Rock, Paper, Scissors! \n\n" +
            "MAIN MENU\n" +
            "===========================================\n" +
            "1. Type '1p' to play against the computer\n" +
            "2. Type '2p' to play 2 player mode\n" +
            "3. Type 'history' to view your game history\n" +
            "4. Type 'quit' to stop playing");

        // Get User selection from Main Menu
        String mainMenuChoice = scanner.nextLine().toLowerCase().trim();

        // Switch statement to handle User selection
        switch(mainMenuChoice) {
            case "1p":
            case "1":
                System.out.println("\nGoing solo!");
                initGame("1p");
                break;
            case "2p":
            case "2":
                System.out.println("\nBring it on!");
                initGame("2p");
                break;
            case "history":
            case "3":
                System.out.println("\nHistory of the World Part I");
                showHistory();
                break;
            case "quit":
            case "4":
                System.out.println("\nThanks for playing!");
                System.exit(0);
                break;
            default:
                System.out.println(
                    "Let's try that again...\n\n" +
                    "===========================================");
                Console console = new Console();
                break;
        }
    }

    // Initialize the game
    // Single player / two player mode dynamically passed to game initialization
    public void initGame(String mode) {
        Game game = new Game();
        game.setGameMode(mode);
        game.playGame();
    }

    // Show User game history
    public void showHistory() {
        History history = new History();
    }
}

