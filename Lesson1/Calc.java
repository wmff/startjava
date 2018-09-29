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
		

		System.out.println("������� ����������� ��������� �������������� �������� (+, -, *, /, ^, %) ��� ������ �������������� �������");
		
		System.out.print("������� ������ ����� �����: ");
		number1 = scanNum1.nextInt();

		System.out.print("������� ���� �������� (+, -, *, /, ^, %): ");
		operator = scanOper.nextLine();

		System.out.print("������� ������ ����� �����: ");
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