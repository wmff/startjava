import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private Player player1;
	private Player player2;
	private int guessNumber;
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void startGame() {

		Random random = new Random();
        guessNumber = random.nextInt(100);
		player1.setIsWin(false);
		player2.setIsWin(false);
		Scanner scanner = new Scanner(System.in);

		while (!player1.getIsWin() && !player2.getIsWin()) {
			System.out.print(player1.getName() + " угадай число от 1 до 100: ");
			player1.setNumber(scanner.nextInt());
		
			if (checkPlayerNumber(player1)) {
				player1.setIsWin(true);
			} else {
				System.out.print(player2.getName() + " угадай число от 1 до 100: ");
				player2.setNumber(scanner.nextInt());
				if (checkPlayerNumber(player2)) {
					player2.setIsWin(true);
				}
			}
		}
	}

	private boolean checkPlayerNumber(Player player) {
		if (player.getNumber() > guessNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			return false;
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			return false;
		} else {
			return true;
		}
	}
}
