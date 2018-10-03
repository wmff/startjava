package com.startjava.lesson_1.game;

import java.util.Scanner;
import java.util.Random;

public class MyFirstGame {	
	public static void main(String[] args) {
		Random random = new Random();
		int unknownNumber = random.nextInt(100);
		int estimatedNumber;

		Scanner scanEstimatedNumber = new Scanner(System.in);

		System.out.print("Угадай число от 1 до 100: ");
		while(true) {
			estimatedNumber = scanEstimatedNumber.nextInt();
			if (estimatedNumber > unknownNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (estimatedNumber < unknownNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else if (estimatedNumber == unknownNumber) {
				break;
			}
		}
		System.out.println("Вы угадали!");
	}
}
