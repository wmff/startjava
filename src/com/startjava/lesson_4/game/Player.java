package com.startjava.lesson_4.game;

class Player {
	
	private final String name;
	private boolean isWin = false;
	private final int[] answerNumbers = new int[10];
	private int numberAttempts = 0;
	
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

    int getNumberAttempts() {
        return numberAttempts;
    }

    void setNumberAttempts(int numberAttempts) {
        this.numberAttempts = numberAttempts;
    }
}
