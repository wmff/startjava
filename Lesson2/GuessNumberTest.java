import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scanner.next());
		
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scanner.next());
		
		GuessNumber guessNumber = new GuessNumber(player1, player2);

		String response = "да";				
		do { 
			if (guessNumber.startGame()) {
				do {
					System.out.println("Хотите продолжить? [да/нет]: ");
					response = scanner.next();
				} while (!response.equals("нет") && !response.equals("да"));
			} else {
				System.out.println("Не угадали. Играем дальше!");
			}
		} while (response.equals("да"));
	}
}
