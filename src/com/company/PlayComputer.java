package com.company;

import java.util.Scanner;

public class PlayComputer {
    public PlayComputer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nRage Against the Machine!\n" +
            "==================================\n" +
            "Type 'rock', 'paper' or 'scissors'");

        String playerChoice = scanner.nextLine();

        // Refactor for random choice
        String compyChoice = "paper";



    }
}
