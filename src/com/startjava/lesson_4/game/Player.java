package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player {
	
	private final String name;
	private int number;
	private boolean isWin = false;
	private int[] answerNumbers = new int[0];
	
	Player(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}

	void setNumber(int number) {
		this.number = number;
		addAnswerNumbers(number);
	}
	
	int getNumber() {
		return this.number;
	}

	void setIsWin(boolean bool) {
		this.isWin = bool;
	}

	boolean getIsWin() {
		return this.isWin;
	}

	private void addAnswerNumbers(int answerNumber) {
		answerNumbers = Arrays.copyOf(answerNumbers, answerNumbers.length + 1);
		answerNumbers[answerNumbers.length - 1] = answerNumber;
	}

	int getCountAnswers() {
		return answerNumbers.length;
	}

	void clearAnswers() {
		answerNumbers = new int[0];
	}

    void printAnswers() {
        System.out.print(getName() + " [");
        for (int i = 0; i < answerNumbers.length ; i++) {
            System.out.print(answerNumbers[i]);
            if (i < answerNumbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
