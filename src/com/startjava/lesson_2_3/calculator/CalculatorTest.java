package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");

		Calculator calculator = new Calculator();
		String response = "да";
		Scanner scanner = new Scanner(System.in);

		while (response.equals("да")) {
			System.out.print("Введите первое целое число: ");
			calculator.setFirstNumber(scanner.nextInt());

			System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
			calculator.setMathOperator(scanner.next().charAt(0));

			System.out.print("Введите второе целое число: ");
			calculator.setSecondNumber(scanner.nextInt());
			calculator.calc();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				response = scanner.next();
			} while (!response.equals("нет") && !response.equals("да"));
		}
	}
}
