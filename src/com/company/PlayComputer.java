package com.company;

import java.util.Map;
import java.util.Scanner;

public class PlayComputer extends GameLogic {
    private GameLogic gameLogic = new GameLogic();

    public PlayComputer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nRage Against the Machine!\n" +
            "==================================\n" +
            "Type 'rock', 'paper' or 'scissors'");

        String playerChoice = scanner.nextLine();

        // Refactor for random choice
        String compyPlay = "paper";

        switch(playerChoice) {
            case "rock":
                play(gameLogic.getRock(), compyPlay);
                break;
            case "paper":
                play(gameLogic.getPaper(), compyPlay);
                break;
            case "scissors":
                play(gameLogic.getScissors(), compyPlay);
                break;
            default:
                break;
        }
    }

    void play(Map<String, String> playerPlay, String compyPlay) {
        System.out.println(playerPlay + " " + compyPlay);
    }
}
