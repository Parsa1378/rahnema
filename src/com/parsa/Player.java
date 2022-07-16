package com.parsa;

import java.util.LinkedList;

public class Player {

    private int points;
    private String name;
    private Game game;
    private static LinkedList<Player> players = new LinkedList<>();

    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.game = null;
        addToList(this);
    }

    static void addToList(Player player) {
        players.add(player);
    }

    public static int cityCheck(String harf, Player player) {
        String first = player.getGame().getCity().substring(0,1);
        if (!first.equals(harf)) {
            return 0;
        }
        for (Player player1:players) {
            if (!player1.equals(player) && player.getGame().getCity().equals(player1.getGame().getCity()) && first.equals(harf)) {
                return 5;
            }
        }
        return 10;
    }

    public static int foodCheck(String harf, Player player) {
        String first = player.getGame().getFood().substring(0,1);
        if (!first.equals(harf)) {
            return 0;
        }
        for (Player player1:players) {
            if (!player1.equals(player) && player.getGame().getCity().equals(player1.getGame().getFood()) && first.equals(harf)) {
                return 5;
            }
        }
        return 10;
    }

    public static int colorCheck(String harf, Player player) {
//        if (player.getGame().getColor()==null || player.getGame().getColor().equals("")) {
//            return 0;
//        }
        String first = player.getGame().getColor().substring(0,1);
        if (!first.equals(harf)) {
            return 0;
        }
        for (Player player1:players) {
            if (!player1.equals(player) && player.getGame().getCity().equals(player1.getGame().getColor()) && first.equals(harf)) {
                return 5;
            }
        }
        return 10;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static Player getPlayer(String name) {
        for (Player player:players) {
            if (player.getName().equals(name))
                return player;
        }
        return null;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public static LinkedList<Player> getPlayers() {
        return players;
    }

    public Game getGame() {
        return game;
    }

    public int getPoints() {
        return points;
    }

    public static void result() {
        System.out.println("نام و امتیاز");
        for (Player player:players) {
            int point = player.getPoints();
            String name = player.getName();
            System.out.println(name + " " + point);
        }
    }

}
