package com.startjava.lesson_2_3.game;

public class Player {
	
	private String name;
	private int number;
	private boolean isWin = false;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setIsWin(boolean bool) {
		this.isWin = bool;
	}
	
	public boolean getIsWin() {
		return this.isWin;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}
