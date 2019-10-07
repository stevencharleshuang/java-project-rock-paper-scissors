package com.company;

import java.util.Scanner;

public class History extends Player {
    public History() {
        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println(
                "Player History Against The Machina\n" +
                        "==========================================="
        );

        System.out.println("Current Wins: ");
        showPlayerWins();
        System.out.println("Current Losses: ");
        showPlayerLosses();
        System.out.println("Current Draws: ");
        showPlayerDraws();

        if (getPlayerResults() != null) {
            getPlayerResults().forEach(result -> System.out.println(result.toString()));
        } else {
            System.out.println("\nNo current player history");
        }

        // Return to Main Menu
        System.out.println(
                "===========================================\n" +
                        "1. Type 'menu' to return to main menu\n");

        String toMenu = scanner.nextLine().toLowerCase().trim();

        if (toMenu.equals("menu") || toMenu.equals("m")) {
            Console console = new Console();
        }
    }

    // Override methods from abstract Player class
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
}

