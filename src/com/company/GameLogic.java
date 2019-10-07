package com.company;

import java.util.HashMap;
import java.util.Map;

public class GameLogic {
    private  Map<String, String> rock = createRock();
    private  Map<String, String> paper = createPaper();
    private  Map<String, String> scissors = createScissors();

    // Logic adapted from https://rosettacode.org/wiki/Rock-paper-scissors Javascript example
    // Win lose conditions are determined by the qualities of each item selection
    // Rock beats scissors, defeated by paper and so on...
    private static Map<String, String> createRock() {
        Map<String,String> rock = new HashMap<String,String>();
        rock.put("type", "rock");
        rock.put("wins", "scissors");
        rock.put("loses", "paper");
        return rock;
    }

    private static Map<String, String> createPaper() {
        Map<String,String> paper = new HashMap<String,String>();
        paper.put("type", "paper");
        paper.put("wins", "rock");
        paper.put("loses", "scissors");
        return paper;
    }

    private static Map<String, String> createScissors() {
        Map<String,String> scissors = new HashMap<String,String>();
        scissors.put("type", "scissors");
        scissors.put("wins", "paper");
        scissors.put("loses", "rock");
        return scissors;
    }

    // GameLogic Accessors
    // GameLogic Mutators omitted as these properties should not be set or updated
    public Map<String, String> getRock() {
        return rock;
    }

    public Map<String, String> getPaper() {
        return paper;
    }

    public Map<String, String> getScissors() {
        return scissors;
    }
}

