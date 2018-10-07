package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
	
	private final Player player1;
	private final Player player2;
	private int guessNumber;
	private final Scanner scanner = new Scanner(System.in);
	private final Random random = new Random();
	
	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	void startGame() {
        prepareNewGame();

		do {
			System.out.print(player1.getName() + " угадай число от 1 до 100: ");
			addNumberToAnswerNumbers(player1, scanner.nextInt());
			if (checkPlayerNumber(player1) && getCountAnswers(player1) == 10) {
				System.out.println(lossMessage(player1));
			}
			if (player1.getIsWin()) {
				break;
			}

			System.out.print(player2.getName() + " угадай число от 1 до 100: ");
			addNumberToAnswerNumbers(player2, scanner.nextInt());
			if (checkPlayerNumber(player2) && getCountAnswers(player2) == 10) {
				System.out.println(lossMessage(player2));
			}
		} while (checkFinishGame(player1) && checkFinishGame(player2));

		printAnswers(player1);
		printAnswers(player2);
	}

	private void prepareNewGame() {
		guessNumber = random.nextInt(99) + 1;

		player1.setIsWin(false);
		player2.setIsWin(false);

		clearAnswers(player1, player2);
	}

	private void clearAnswers(Player player1, Player player2) {
		int[] tmpAnswerNumbers = new int[10];
		player1.setAnswerNumbers(tmpAnswerNumbers);
		player2.setAnswerNumbers(tmpAnswerNumbers);
	}

	private void addNumberToAnswerNumbers(Player player, int number) {
		int[] tmpAnswerNumbers = new int[10];
		for (int i = 0; i < player.getAnswerNumbers().length ; i++) {
			if (player.getAnswerNumbers()[i] == 0) {
				tmpAnswerNumbers[i] = number;
				break;
			} else {
				tmpAnswerNumbers[i] = player.getAnswerNumbers()[i];
			}
		}
		player.setAnswerNumbers(tmpAnswerNumbers);
	}

	private boolean checkPlayerNumber(Player player) {
		if (getLastAnswerNumber(player) > guessNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			return true;
		} else if (getLastAnswerNumber(player) < guessNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			return true;
		} else {
			System.out.println(winMessage(player));
			player.setIsWin(true);
			return false;
		}
	}

	private int getLastAnswerNumber(Player player) {
		return player.getAnswerNumbers()[getCountAnswers(player)-1];
	}

    private int getCountAnswers(Player player) {
		int countAnswers = 0;
		for (int number: player.getAnswerNumbers()) {
			if (number > 0) countAnswers++;
		}
		return countAnswers;
	}

	private String winMessage(Player player) {
		return "Игрок " + player.getName() +
				" угадал число " + guessNumber +
				" с " + getCountAnswers(player) + " попытки";
	}

	private String lossMessage(Player player) {
		return  "У " + player.getName() + " закончились попытки";
	}

	private boolean checkFinishGame(Player player) {
		return getCountAnswers(player) != 10 && !player.getIsWin();
	}

	private void printAnswers(Player player) {
		System.out.print(player.getName() + " [");
		for (int i = 0; i < getCountAnswers(player) ; i++) {
				System.out.print(player.getAnswerNumbers()[i]);
				if (i < getCountAnswers(player) - 1) {
					System.out.print(", ");
				}
		}
		System.out.println("]");
	}

}
