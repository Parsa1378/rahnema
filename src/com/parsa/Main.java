package com.parsa;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        System.out.print("تعداد شرکت‌کنندگان: ");
        int numberOfPlayers = scanner.nextInt();
        for (int i=0;i<=numberOfPlayers;i++){
            System.out.print("اسم خود را وارد کنید: ");
            String input = scanner.nextLine();
            Player newPlayer = new Player(input);
        }
        System.out.print("حرف را وارد کنید: ");
        String harf = scanner.nextLine();
        for (int i=1;i<=numberOfPlayers;i++) {
            askQ();
        }
        validation(harf);
        Player.result();
    }

    public static void askQ() {
        System.out.print("نام بازیکن: ");
        String name = scanner.nextLine();
        Player player = Player.getPlayer(name);
        System.out.print("نام‌شهر: ");
        String city = scanner.nextLine();
        System.out.print("غذا: ");
        String food = scanner.nextLine();
        System.out.print("رنگ: ");
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
