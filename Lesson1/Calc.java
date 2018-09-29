import java.util.Scanner;

public class Calc {	
	public static int power(int x, int n) {
	    if (n == 0)
	        return 1;
	    if (n == 1)
	        return x;
	    else
	        return x * (power(x, n-1));
	}

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		String operator;
		Scanner scanNum1 = new Scanner(System.in);
		Scanner scanNum2 = new Scanner(System.in);
		Scanner scanOper = new Scanner(System.in);
		

		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");
		
		System.out.print("Введите первое целое число: ");
		number1 = scanNum1.nextInt();

		System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
		operator = scanOper.nextLine();

		System.out.print("Введите второе целое число: ");
		number2 = scanNum2.nextInt();

		System.out.print(number1+operator+number2+"=");

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
}