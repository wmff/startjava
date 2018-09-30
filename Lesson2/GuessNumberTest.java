import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scanner.next());
		
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scanner.next());
		
		GuessNumber guessNumber = new GuessNumber();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print(player1.getName() + " угадай число от 1 до 100: ");
			if (guessNumber.checkNumber(player1.getName(), scanner.nextInt()) == 0) {
				player1.setWinner();
			} else {
				System.out.print(player2.getName() + " угадай число от 1 до 100: ");
				if (guessNumber.checkNumber(player2.getName(), scanner.nextInt()) == 0) {
					player2.setWinner();
				}
			}
			if (player1.getWinner()) {
				System.out.println(player1.getName() + " победил!");
				break;
			} else if (player2.getWinner()) {
				System.out.println(player2.getName() + " победил!");
				break;
			}
		}
	}
}