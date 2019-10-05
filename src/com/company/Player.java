package com.company;

public class Player {
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
