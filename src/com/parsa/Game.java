package com.parsa;

import java.util.LinkedList;

public class Game {

    private String city;
    private String food;
    private String color;
    private Player player;
    private static LinkedList<Game> games;

    public Game(String city,String food,String color,Player player) {
        this.city = city;
        this.food = food;
        this.color = color;
        this.player = player;
        games.add(this);
    }

//    public static int cityCheck(String name,String harf) {
//        boolean flag = false;
//        for (Game game:games) {
//            if (game.getPlayer().getName().equals(name)) {
//                String first = game.getCity().substring(0,1);
//                for (Player player:Player.getPlayers()) {
//                    if (harf.equals(first) && !player.getName().equals(name) && player.getGame().getCity().equals())
//                }
//            }
//        }
//    }

    public Player getPlayer() {
        return player;
    }

    public String getFood() {
        return food;
    }

    public String getCity() {
        return city;
    }

    public String getColor() {
        return color;
    }
}
