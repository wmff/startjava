import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scanner.next());
		
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scanner.next());
		
		GuessNumber guessNumber = new GuessNumber();
		
		boolean isExit = false;
		
		while (isExit == false) {
			if (guessNumber.game(player1, player2)) {
				while (true) {
					System.out.println("Хотите продолжить? [да/нет]: ");
					String response = scanner.next();				
					if (response.equals("нет")) {
						isExit = true;
						break;
					} else if (response.equals("да")){
						guessNumber.newGuessNumber();
						break;
					}
				}
			}
		}
	}
}