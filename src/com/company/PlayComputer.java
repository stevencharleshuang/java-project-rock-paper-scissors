package com.company;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlayComputer extends Player {
    private GameLogic gameLogic = new GameLogic();

    public PlayComputer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nRage Against the Machine!\n" +
            "==========================\n" +
            "Type:\n" +
            "1. 'rock'\n" +
            "2. 'paper'\n" +
            "3. 'scissors'\n");

        String playerChoice = scanner.nextLine().toLowerCase();
        String compyPlay = getCompyChoice();

        switch(playerChoice) {
            case "rock":
            case "r":
            case "1":
                play(gameLogic.getRock(), compyPlay);
                break;
            case "paper":
            case "p":
            case "2":
                play(gameLogic.getPaper(), compyPlay);
                break;
            case "scissors":
            case "s":
            case "3":
                play(gameLogic.getScissors(), compyPlay);
                break;
            default:
                break;
        }

        System.out.println(
                "\nMOAR?\n" +
                "=====================================\n" +
                "1. Type 'moar' to play again\n" +
                "2. Type 'menu' to return to main menu\n");

        String playAgain = scanner.nextLine().toLowerCase().trim();

        if (playAgain.equals("moar") || playAgain.equals("1")) {
            PlayComputer playComputer = new PlayComputer();
        } else {
            Console console = new Console();
        }
    }

    private void play(Map<String, String> playerPlay, String compyPlay) {
        System.out.println("The Machine went with " + compyPlay);
        if (compyPlay.equals(playerPlay.get("wins"))) {
            setPlayerWins(getPlayerWins() + 1);
            System.out.println("Player wins! =D\nCurrent wins: " + getPlayerWins());
        } else if (compyPlay.equals(playerPlay.get("loses"))) {
            setPlayerLosses(getPlayerLosses() + 1);
            System.out.println("Player loses... =(\nCurrent losses: " + getPlayerLosses());
        } else {
            setPlayerDraws(getPlayerDraws() + 1);
            System.out.println("It's a draw! You both lose...but really, only you lose...LOL " + getPlayerDraws());
        }
    }

    private String getCompyChoice () {
        String[] choicesArr = {"rock", "paper", "scissors"};

        Random random = new Random();
        int randomNUm = random.nextInt(2);

        return choicesArr[randomNUm];
    }

    @Override
    public void showPlayerWins(int playerWins) {

    }

    @Override
    public void showPlayerLosses(int playerLosses) {

    }

    @Override
    public void showPlayerResults(String results) {

    }
}
