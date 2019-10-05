package com.company;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlayComputer {
    private GameLogic gameLogic = new GameLogic();

    public PlayComputer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nRage Against the Machine!\n" +
            "==================================\n" +
            "Type 'rock', 'paper' or 'scissors'");

        String playerChoice = scanner.nextLine();
        String compyPlay = getCompyChoice();

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

    private void play(Map<String, String> playerPlay, String compyPlay) {
        System.out.println("The Machine went with " + compyPlay);
        if (compyPlay.equals(playerPlay.get("wins"))) {
            System.out.println("Player wins! =D");
        } else if (compyPlay.equals(playerPlay.get("loses"))) {
            System.out.println("Player loses... =(");
        } else {
            System.out.println("It's a draw! You both lose...but really, only you lose...LOL");
        }
    }

    private String getCompyChoice () {
        String[] choicesArr = {"rock", "paper", "scissors"};

        Random random = new Random();
        int randomNUm = random.nextInt(2);

        return choicesArr[randomNUm];
    }
}
