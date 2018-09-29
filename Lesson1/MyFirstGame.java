import java.util.Scanner;

public class MyFirstGame {	
	public static void main(String[] args) {
		int num;
		int rand = (int)(System.currentTimeMillis()%100)+1;
		Scanner scanNum = new Scanner(System.in);
		System.out.print("Угадай число от 1 до 100: ");
		while(true) {
			num = scanNum.nextInt();
			if (num > rand) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (num < rand) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else if (num == rand) {
				System.out.println("Вы угадали!");
				break;
			}
		}
	}
}