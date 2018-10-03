package com.startjava.lesson_2_3.calculator;

public class Calculator {	
	
	private int firstNumber;
	private char mathOperator;
	private int secondNumber;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setMathOperator(char mathOperator) {
		this.mathOperator = mathOperator;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void calc() {
		switch(mathOperator) {
			case '+':
				System.out.println(firstNumber + secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '/':
				System.out.println(firstNumber / secondNumber);
				break;
			case '^':
				System.out.println(power(firstNumber, secondNumber));
				break;
			case '%':
				System.out.println(firstNumber % secondNumber);
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
