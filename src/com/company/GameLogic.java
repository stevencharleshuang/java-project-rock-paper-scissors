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
        rock.put("wins", "scissors");
        rock.put("loses", "paper");
        return rock;
    }

    private static Map<String, String> createPaper() {
        Map<String,String> rock = new HashMap<String,String>();
        rock.put("wins", "rock");
        rock.put("loses", "scissors");
        return rock;
    }

    private static Map<String, String> createScissors() {
        Map<String,String> rock = new HashMap<String,String>();
        rock.put("wins", "paper");
        rock.put("loses", "rock");
        return rock;
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

