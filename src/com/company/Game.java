package com.company;

public class Game {
    private String gameMode;

    // Game Accessors
    public String getGameMode() {
        return gameMode;
    }

    // Game Mutators
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    // Logic to handle the mode that the game is initialized with (single player || two player)
    public void playGame() {
        if (gameMode == "1p") {
            PlayComputer playComputer = new PlayComputer();
        } else {
            PlayHuman playHuman = new PlayHuman();
        }
    }
}

