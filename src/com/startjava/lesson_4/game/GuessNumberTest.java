package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите имя игрока 1:");
		Player player1 = new Player(scanner.next());
		
		System.out.print("Введите имя игрока 2:");
		Player player2 = new Player(scanner.next());

		System.out.println("У каждого игрока 10 попыток.");

		GuessNumber guessNumber = new GuessNumber(player1, player2);

		String response = "да";
        while (response.equals("да")) {
			guessNumber.startGame();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				response = scanner.next();
			} while (!response.equals("нет") && !response.equals("да"));
		}
	}
}
