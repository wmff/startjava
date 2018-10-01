import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private Player player1;
	private Player player2;
	private int guessNumber;
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		Random random = new Random();
		guessNumber = random.nextInt(100);
	}
	
	/*
	возвращает true если есть победитель
	*/
	public boolean game() {
		Scanner scanner = new Scanner(System.in);

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
			System.out.println(player1.getName() + " победил!");
			Random random = new Random();
			guessNumber = random.nextInt(100);
			player1.setIsWin(false);
			return true;
		} else if (player2.getIsWin()) {
			System.out.println(player2.getName() + " победил!");
			Random random = new Random();
			guessNumber = random.nextInt(100);
			player2.setIsWin(false);
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
	
}
