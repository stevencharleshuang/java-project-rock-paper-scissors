package com.company;

import java.util.HashMap;
import java.util.Map;

public class GameLogic {
    private  Map<String, String> rock = createRock();
    private  Map<String, String> paper = createPaper();
    private  Map<String, String> scissors = createScissors();

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
