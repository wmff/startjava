package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
	
	private final Player player1;
	private final Player player2;
	private int guessNumber;
	
	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	void startGame() {

        prepareNewGame();
		Scanner scanner = new Scanner(System.in);

		while (checkFinishGame(player1) && checkFinishGame(player2)) {
			System.out.print(player1.getName() + " угадай число от 1 до 100: ");
			player1.setNumber(scanner.nextInt());

			if (checkPlayerNumber(player1)) {
				player1.setIsWin(true);
				System.out.println(winMessage(player1));
			} else {
				if (player1.getCountAnswers() == 10) {
					System.out.println(lossMessage(player1));
				}
				System.out.print(player2.getName() + " угадай число от 1 до 100: ");
				player2.setNumber(scanner.nextInt());
				if (checkPlayerNumber(player2)) {
					player2.setIsWin(true);
					System.out.println(winMessage(player2));
				} else {
					if (player2.getCountAnswers() == 10) {
						System.out.println(lossMessage(player2));
					}
				}
			}
		}
		player1.printAnswers();
		player2.printAnswers();
	}

	private void prepareNewGame() {
		Random random = new Random();
		guessNumber = random.nextInt(100);

		player1.setIsWin(false);
		player2.setIsWin(false);

		player1.clearAnswers();
		player2.clearAnswers();
	}

	private boolean checkFinishGame(Player player) {
        return player.getCountAnswers() != 10 && !player.getIsWin();
    }

	private boolean checkPlayerNumber(Player player) {
		if (player.getNumber() > guessNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			return false;
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			return false;
		} else {
			return true;
		}
	}

	private String winMessage(Player player) {
		return "Игрок " + player.getName() +
				" угадал число " + guessNumber +
				" с " + player.getCountAnswers() + " попытки";
	}

	private String lossMessage(Player player) {
		return  "У " + player.getName() + " закончились попытки";
	}

}
