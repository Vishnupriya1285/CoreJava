package com.java.realtimeprojects.collections.maps.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GameLeaderBoardApp {
    public static void main(String[] args) {
        //Key is Player Score and Value is Player Id
        Map<Integer, String> leaderBoard = new TreeMap<>(Collections.reverseOrder());

        leaderBoard.put(1500, "PlayerA");
        leaderBoard.put(2200, "PlayerB");
        leaderBoard.put(1800, "PlayerC");
        leaderBoard.put(2800, "PlayerD");
        leaderBoard.put(3900, "PlayerR");
        leaderBoard.put(3900, "PlayerV");


        for(Map.Entry<Integer, String> player : leaderBoard.entrySet()) {
            System.out.println(player.getValue() +" :: "+ player.getKey());
        }

        Map<Integer, Game> gameMap = new TreeMap<>(Collections.reverseOrder());
        gameMap.put(99, new Game("BasketBall", "school level"));
        gameMap.put(110, new Game("BasketBall", "zonal level"));
        gameMap.put(70, new Game("Cricket", "State Level"));
        gameMap.put(300, new Game("Foot Ball", "National Level"));

        for(Map.Entry<Integer, Game> game : gameMap.entrySet()) {
            System.out.println(game.getValue() +" :: "+ game.getKey());
        }
    }
}

class Game {

    private String name;
    private String competencyLevel;

    public Game(String name, String competencyLevel) {
        this.name = name;
        this.competencyLevel = competencyLevel;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", competencyLevel='" + competencyLevel + '\'' +
                '}';
    }
}