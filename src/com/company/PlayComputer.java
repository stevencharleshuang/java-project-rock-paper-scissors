package com.company;

import java.util.*;

public class PlayComputer extends Player implements GameFlowInterface {
    private GameLogic gameLogic = new GameLogic();

    public PlayComputer() {
        Scanner scanner = new Scanner(System.in);

        // Print welcome and menu for single player mode
        System.out.println(
            "\nRage Against the Machine!\n" +
            "==========================\n" +
            "Type:\n" +
            "1. 'rock'\n" +
            "2. 'paper'\n" +
            "3. 'scissors'\n");

        // Get the play selections from User and computer(randomized selection)
        String playerChoice = scanner.nextLine().toLowerCase();
        String compyPlay = getCompyChoice();

        // Switch statement to handle User input
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
                System.out.println(
                    "Let's try that again...\n\n" +
                    "===========================================");
                PlayComputer playComputer = new PlayComputer();
                break;
        }

        playAgain(scanner);
    }

    // Override methods from abstract class Player
    // No need to do anything here...
    @Override
    public void showPlayerWins() { }

    @Override
    public void showPlayerLosses() { }

    @Override
    public void showPlayerDraws() { }

    @Override
    public void playAgain(Scanner scanner) {
        // Option to continue game mode or return to Main Menu
        System.out.println(
                "\nMOAR?\n" +
                "=====================================\n" +
                "1. Type 'moar' to play again\n" +
                "2. Type 'menu' to return to main menu\n");

        String playAgain = scanner.nextLine().toLowerCase().trim();

        // Handle User input
        if (playAgain.equals("moar") || playAgain.equals("1")) {
            PlayComputer playComputer = new PlayComputer();
        } else if (playAgain.equals("menu") || playAgain.equals("2")) {
            Console console = new Console();
        } else {
            System.out.println("Please type 'moar' or 'menu'...");
            playAgain(scanner);
        }
    }

    // Logic to update abstract class Player static variables and output a result to the User
    private void play(Map<String, String> playerPlay, String compyPlay) {
        ArrayList<String> currentPlayResults;

        if (getPlayerResults() != null) {
            currentPlayResults = new ArrayList<>(getPlayerResults());
        } else {
            currentPlayResults = new ArrayList<>();
        }

        System.out.println("The Machine went with " + compyPlay);

        if (compyPlay.equals(playerPlay.get("wins"))) {
            setPlayerWins(getPlayerWins() + 1);
            System.out.println("Player wins! =D\nCurrent wins: " + getPlayerWins());
            setPlayerResult("Player went with '" + playerPlay.get("type") + "'. Compy went with '" + compyPlay + "'. Player won!");
        } else if (compyPlay.equals(playerPlay.get("loses"))) {
            setPlayerLosses(getPlayerLosses() + 1);
            System.out.println("Player loses... =(\nCurrent losses: " + getPlayerLosses());
            setPlayerResult("Player went with '" + playerPlay.get("type") + "'. Compy went with '" + compyPlay + "'. Player lost!");
        } else {
            setPlayerDraws(getPlayerDraws() + 1);
            System.out.println("It's a draw! You both lose...but really, only you lose...LOL\n Current draws: " + getPlayerDraws());
            setPlayerResult("Player went with '" + playerPlay.get("type") + "'. Compy went with '" + compyPlay + "'. It was a draw!");
        }

        currentPlayResults.add(getPlayerResult());
        setPlayerResults(currentPlayResults);
    }

    // Randomly generates a selection from the computer
    private String getCompyChoice () {
        String[] choicesArr = {"rock", "paper", "scissors"};

        Random random = new Random();
        int randomNUm = random.nextInt(2);

        return choicesArr[randomNUm];
    }
}
