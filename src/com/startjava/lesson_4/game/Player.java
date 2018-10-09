package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player {
	
	private final String name;
	private boolean isWin;
	private final int[] answerNumbers;
	private int numberAttempts;
	
	public Player(String name) {
		this.name = name;
		answerNumbers = new int[10];
		numberAttempts = 1;
	}
	
	public String getName() {
		return name;
	}

	public void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}

	public boolean getIsWin() {
		return isWin;
	}

	public void setNumbers(int number) {
        answerNumbers[numberAttempts] = number;
        numberAttempts++;
    }

    public int[] getAnswerNumbers() {
        return Arrays.copyOf(answerNumbers, numberAttempts);
    }

    public int getLastAnswerNumber() {
        return answerNumbers[numberAttempts-1];
    }

    public void setNumberAttempts(int numberAttempts) {
        this.numberAttempts = numberAttempts;
    }

    public int getNumberAttempts() {
        return numberAttempts;
    }

}
