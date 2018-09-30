import java.util.Scanner;

public class CalculatorTest {	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");

		Calculator calculator = new Calculator();
		calculator.calc(getNumber1(), getOperator(), getNumber2());
	}

	private static int getNumber1() {
		System.out.print("Введите первое целое число: ");
		return scanner.nextInt();
	}

	public static int getNumber2() {
		System.out.print("Введите второе целое число: ");
		return scanner.nextInt();
	}

	public static String getOperator() {
		System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
		return scanner.next();
	}
}