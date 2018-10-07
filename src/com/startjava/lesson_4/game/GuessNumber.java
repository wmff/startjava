package com.startjava.lesson_4.game;

import java.util.Arrays;
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
			askNumber(player1);
			if (player1.getIsWin()) {
				break;
			}
			askNumber(player2);
		} while (checkFinishGame(player1) && checkFinishGame(player2));

		printAnswers(player1);
		printAnswers(player2);
	}

	private void askNumber(Player player) {
        System.out.print(player.getName() + " угадай число от 1 до 100: ");
        saveAnswerNumber(player);
        if (checkPlayerNumber(player) && player.getNumberAttempts() == 10) {
            printLossMessage(player);
        }
    }

	private void prepareNewGame() {
		guessNumber = random.nextInt(99) + 1;

		player1.setIsWin(false);
		player2.setIsWin(false);

		clearAnswers(player1);
		clearAnswers(player2);

        player1.setNumberAttempts(0);
        player2.setNumberAttempts(0);
	}

	private void clearAnswers(Player player) {
        Arrays.fill(player.getAnswerNumbers(), 0, player.getNumberAttempts(), 0);
	}

	private void saveAnswerNumber(Player player) {
        player.getAnswerNumbers()[player.getNumberAttempts()] = scanner.nextInt();
        player.setNumberAttempts(player.getNumberAttempts() + 1);
	}

	private boolean checkPlayerNumber(Player player) {
		if (getLastAnswerNumber(player) > guessNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			return true;
		} else if (getLastAnswerNumber(player) < guessNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			return true;
		} else {
			printWinMessage(player);
			player.setIsWin(true);
			return false;
		}
	}

	private int getLastAnswerNumber(Player player) {
		return player.getAnswerNumbers()[player.getNumberAttempts()-1];
	}

	private void printWinMessage(Player player) {
        System.out.println("Игрок " + player.getName() +
				" угадал число " + guessNumber +
				" с " + player.getNumberAttempts() + " попытки");
	}

	private void printLossMessage(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки");
	}

	private boolean checkFinishGame(Player player) {
		return player.getNumberAttempts() != 10 && !player.getIsWin();
	}

	private void printAnswers(Player player) {
		System.out.print(player.getName() + " [");
		for (int i = 0; i < player.getNumberAttempts() ; i++) {
		    System.out.print(player.getAnswerNumbers()[i]);
		    if (i < player.getNumberAttempts() - 1) {
		        System.out.print(", ");
		    }
		}
		System.out.println("]");
	}

}
