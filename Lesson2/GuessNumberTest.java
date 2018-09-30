import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scanner.next());
		
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scanner.next());
		
		GuessNumber guessNumber = new GuessNumber();
		
		boolean exitFlag = false;
		
		while (exitFlag == false) {
			System.out.print(player1.getName() + " угадай число от 1 до 100: ");
			player1.setNumber(scanner.nextInt());
			if (guessNumber.checkNumber(player1.getName(), player1.getNumber()) == 0) {
				player1.setWinner();
			} else {
				System.out.print(player2.getName() + " угадай число от 1 до 100: ");
				player2.setNumber(scanner.nextInt());
				if (guessNumber.checkNumber(player2.getName(), player2.getNumber()) == 0) {
					player2.setWinner();
				}
			}
			
			if (player1.getWinner()) {
				System.out.println(player1.getName() + " победил!");
			} else if (player2.getWinner()) {
				System.out.println(player2.getName() + " победил!");
			}
			
			while (true) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				String response = scanner.next();				
				if (response.equals("нет")) {
					exitFlag = true;
					break;
				} else if (response.equals("да")){
					break;
				}
			} 
			
		};
	}
}