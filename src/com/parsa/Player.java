package com.parsa;

import java.util.LinkedList;

public class Player {

    private int points;
    private String name;
    private Game game;
    private LinkedList<Player> players;

    public Player(String name) {
        this.name = name;
        this.points = 0;
        players.add(this);
    }
}
