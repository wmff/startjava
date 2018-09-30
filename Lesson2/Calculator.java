public class Calculator {	
	public static void calc(int number1, String operator, int number2) {
		switch(operator) {
			case "+":
				System.out.println(number1 + number2);
				break;
			case "-":
				System.out.println(number1 - number2);
				break;
			case "*":
				System.out.println(number1 * number2);
				break;
			case "/":
				System.out.println(number1 / number2);
				break;
			case "^":
				System.out.println(power(number1, number2));
				break;
			case "%":
				System.out.println(number1 % number2);
				break;
			default:
				System.out.println("Не обрабатываемое математическое действие");
				break;
		}
	}

	private static int power(int result, int power) {
		return power == 0 ? 1 : result * (power(result, power - 1));
	}
}