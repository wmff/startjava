package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");

		Calculator calculator = new Calculator();
		String response = "да";

		while (response.equals("да")) {
			calculator.setFirstNumber(getNumber1());
			calculator.setMathOperator(getOperator());
			calculator.setSecondNumber(getNumber2());
			calculator.calc();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				response = scanner.next();
			} while (!response.equals("нет") && !response.equals("да"));
		}
	}

	private static int getNumber1() {
		System.out.print("Введите первое целое число: ");
		return scanner.nextInt();
	}

	public static char getOperator() {
		System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
		return scanner.next().charAt(0);
	}

	public static int getNumber2() {
		System.out.print("Введите второе целое число: ");
		return scanner.nextInt();
	}
}
