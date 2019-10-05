package com.company;

import java.util.HashMap;
import java.util.Map;

public class Game {
    // Rock Paper Scissors Logic
    // rock beats scissors beats paper beats rock;

    public Game() {
        Map<String, String> rock = createRock();
        Map<String, String> paper = createPaper();
        Map<String, String> scissors = createScissors();

        System.out.println(rock.get("wins"));
    }

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
}
