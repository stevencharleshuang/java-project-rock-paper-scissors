package com.company;

public class Player {
    // Refactor all of this to just track stats
    private String choice;

    public Player(String choice) {
        this.choice = choice;
    }

    // Player Accessors
    public String getChoice() {
        return choice;
    }

    // Player Mutators
    public void setChoice(String choice) {
        this.choice = choice;
    }
}
