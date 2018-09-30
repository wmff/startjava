public class Player {
	private String name;
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
}