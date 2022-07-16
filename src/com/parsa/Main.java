package com.parsa;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        System.out.println("تعداد شرکت‌کنندگان:");
        int numberOfPlayers = scanner.nextInt();
        for (int i=1;i<=numberOfPlayers;i++){
            String input = scanner.nextLine();
            Player newPlayer = new Player(input);
        }
        String harf = scanner.nextLine();
        for (int i=1;i<=numberOfPlayers;i++) {
            askQ();
        }
        validation(harf);
    }

    public static void askQ() {
        System.out.println("نام بازیکن:");
        String name = scanner.nextLine();
        Player player = Player.getPlayer(name);
        System.out.println("نام‌شهر:");
        String city = scanner.nextLine();
        System.out.println("غذا:");
        String food = scanner.nextLine();
        System.out.println("رنگ:");
        String color = scanner.nextLine();
        Game game = new Game(city,food,color,player);
        player.createGame(game);
    }

    public static void validation(String harf) {
        for (Player player:Player.getPlayers()) {
            int sum=Player.cityCheck(harf,player)+Player.colorCheck(harf,player)+Player.foodCheck(harf,player);
            player.setPoints(sum);
        }
    }
}
