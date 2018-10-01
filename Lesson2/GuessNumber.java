import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private int guessNumber;
	
	public GuessNumber() {
		this.newGameNumber();
	}
	
	public void newGameNumber() {
		Random random = new Random();
		this.guessNumber = random.nextInt(100);
	}

	/**
	возвращает true если есть победитель
	*/
	public boolean game(Player player1, Player player2) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(player1.getName() + " угадай число от 1 до 100: ");
		player1.setNumber(scanner.nextInt());
		
		if (this.checkNumber(player1.getName(), player1.getNumber()) == 0) {
			player1.setIsWin();
		} else {
			System.out.print(player2.getName() + " угадай число от 1 до 100: ");
			player2.setNumber(scanner.nextInt());
			if (this.checkNumber(player2.getName(), player2.getNumber()) == 0) {
				player2.setIsWin();
			}
		}
			
		if (player1.getIsWin()) {
			System.out.println(player1.getName() + " победил!");
			return true;
		} else if (player2.getIsWin()) {
			System.out.println(player2.getName() + " победил!");
			return true;
		} else {
			return false;
		}
	}

	private int checkNumber(String playerName, int number) {
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
