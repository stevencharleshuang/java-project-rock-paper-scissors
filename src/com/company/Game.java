package com.company;

import java.util.HashMap;
import java.util.Map;

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


    public void playGame() {
        if (gameMode == "1p") {
            PlayComputer playComputer = new PlayComputer();
        } else {
            PlayHuman playHuman = new PlayHuman();
        }
    }
}
