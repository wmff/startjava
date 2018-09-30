public class Player {
	private String name;
	private int number;
	private boolean winner = false;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setWinner() {
		this.winner = true;
	}
	
	public boolean getWinner() {
		return this.winner;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}