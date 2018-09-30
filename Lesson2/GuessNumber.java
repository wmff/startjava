import java.util.Random;

public class GuessNumber {
	private static int guessNumber;
	
	public GuessNumber() {
		Random random = new Random();
		this.guessNumber = random.nextInt(100);
		System.out.println(this.guessNumber);
	}
	
	public int checkNumber(String playerName, int number) {
		if (number > this.guessNumber) {
			System.out.println("Введенное " + playerName + " число больше того, что загадал компьютер");
			return number;
		} else if (number < this.guessNumber) {
			System.out.println("Введенное " + playerName + " число меньше того, что загадал компьютер");
			return number;
		} else {
			return 0;
		}
	}
}