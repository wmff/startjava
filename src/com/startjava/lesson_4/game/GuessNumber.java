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
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void startGame() {
        prepareNewGame();

		do {
			inputNumber(player1);
			checkPlayerNumber(player1);
			if (player1.getIsWin()) {
				break;
			}
			inputNumber(player2);
			checkPlayerNumber(player2);
		} while (checkFinishGame(player1) && checkFinishGame(player2));

		endGame();
	}

    private void prepareNewGame() {
		guessNumber = random.nextInt(100);

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

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " угадай число от 0 до 100: ");
		player.setNumbers(scanner.nextInt());
    }

	private void checkPlayerNumber(Player player) {
		if (player.getLastAnswerNumber() > guessNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
		} else if (player.getLastAnswerNumber() < guessNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
		} else {
			printWinMessage(player);
			player.setIsWin(true);
		}
		if (player.getNumberAttempts() == 10 && !player.getIsWin()) {
			printLossMessage(player);
		}
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
		System.out.println(player.getName() + " = " +	Arrays.toString(player.getAnswerNumbers()));
	}

    private void endGame() {
        printAnswers(player1);
        printAnswers(player2);
    }

}
