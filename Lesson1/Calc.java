import java.util.Scanner;

public class Calc {	
	public static void main(String[] args) {
		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");

		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("Введите первое целое число: ");
		int number1 = scanner.nextInt();

		System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
		String operator = scanner.next();

		System.out.print("Введите второе целое число: ");
		int number2 = scanner.nextInt();

		System.out.print(number1 + operator + number2 + "=");

		int result = 0;
		if (operator.equals("+")) {
			result = number1 + number2;
		} else if (operator.equals("-")) {
			result = number1 - number2;
		} else if (operator.equals("*")) {
			result = number1 * number2;
		} else if (operator.equals("/")) {
			result = number1 / number2;
		} else if (operator.equals("^")) {
			result = power(number1, number2);
		} else if (operator.equals("%")) {
			result = number1 % number2;
		}

		System.out.println(result);
	}

	private static int power(int x, int n) {
	    if (n == 0)
	        return 1;
	    if (n == 1)
	        return x;
	    else
	        return x * (power(x, n-1));
	}
}