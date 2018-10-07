package com.startjava.lesson_4.game;

class Player {
	
	private final String name;
	private boolean isWin = false;
	private int[] answerNumbers = new int[10];
	
	Player(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}

	void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}

	boolean getIsWin() {
		return isWin;
	}

	int[] getAnswerNumbers() {
		return answerNumbers;
	}

	void setAnswerNumbers(int[] answerNumbers) {
		this.answerNumbers = answerNumbers;
	}

}
