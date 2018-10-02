import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private Player player1;
	private Player player2;
	Random random = new Random();
	private int guessNumber;
	Scanner scanner = new Scanner(System.in);
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		guessNumber = random.nextInt(100);
	}
	
	/*
	возвращает true если есть победитель
	*/
	public boolean startGame() {

		System.out.print(player1.getName() + " угадай число от 1 до 100: ");
		player1.setNumber(scanner.nextInt());
		
		if (checkNumber(player1.getName(), player1.getNumber())) {
			player1.setIsWin(true);
		} else {
			System.out.print(player2.getName() + " угадай число от 1 до 100: ");
			player2.setNumber(scanner.nextInt());
			if (checkNumber(player2.getName(), player2.getNumber())) {
				player2.setIsWin(true);
			}
		}
			
		if (player1.getIsWin()) {
			newGame(player1);
			return true;
		} else if (player2.getIsWin()) {
			newGame(player2);
			return true;
		} else {
			return false;
		}
	}

	private boolean checkNumber(String playerName, int number) {
		if (number > this.guessNumber) {
			System.out.println("Введенное " + playerName + " число больше того, что загадал компьютер");
			return false;
		} else if (number < this.guessNumber) {
			System.out.println("Введенное " + playerName + " число меньше того, что загадал компьютер");
			return false;
		} else {
			return true;
		}
	}

	private void newGame(Player winner) {
		System.out.println(winner.getName() + " победил!");
        guessNumber = random.nextInt(100);
        winner.setIsWin(false);
	}	
}
