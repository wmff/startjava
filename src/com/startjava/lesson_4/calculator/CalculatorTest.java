package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	


	public static void main(String[] args) {
		System.out.println("Простой калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами");

		Calculator calculator = new Calculator();
		String response = "да";
		Scanner scanner = new Scanner(System.in);

		while (response.equals("да")) {
			System.out.print("Введите математическое выражение (например: '2 + 2'): ");
			calculator.calc(scanner.nextLine());
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				response = scanner.nextLine();
			} while (!response.equals("нет") && !response.equals("да"));
		}
	}
}
