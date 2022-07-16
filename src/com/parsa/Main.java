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

    }

    public static void askQ() {
        System.out.println("نام‌شهر:");
        String city = scanner.nextLine();
        System.out.println("غذا:");
        String food = scanner.nextLine();
        System.out.println("رنگ:");
        String color = scanner.nextLine();
    }

    public static void validation(Game game) {

    }
}
