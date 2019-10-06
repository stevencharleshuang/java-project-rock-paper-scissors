package com.company;

import java.util.Scanner;

public class History extends Player {

    public History() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Player History\n" +
            "=================================="
        );
        System.out.println("Current Wins: ");
        showPlayerWins();
        System.out.println("Current Losses: ");
        showPlayerLosses();
        System.out.println("Current Draws: ");
        showPlayerDraws();

        System.out.println(
            "==================================\n" +
            "Type 'menu' to return to main menu\n");

        String toMenu = scanner.nextLine().toLowerCase().trim();

        if (toMenu.equals("menu") || toMenu.equals("m")) {
            Console console = new Console();
        }
    }

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
