package com.startjava.lesson_4.calculator;

import java.lang.Math;

final class Calculator {

    private int firstNumber;
    private char mathOperator;
    private int secondNumber;

    private void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    private void setMathOperator(char mathOperator) {
        this.mathOperator = mathOperator;
    }

    private void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private void splitMathExpr(String mathExpr) {

        String[] mathExprArray = mathExpr.replaceAll("\\s", "").split("(?<=[-+*/^%])|(?=[-+*/^%])");

        setFirstNumber(Integer.parseInt(mathExprArray[0]));
        setMathOperator(mathExprArray[1].charAt(0));
        setSecondNumber(Integer.parseInt(mathExprArray[2]));
    }

    final void calc(String mathExpr) {

        splitMathExpr(mathExpr);

        switch (mathOperator) {
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
                System.out.println((int) Math.pow(firstNumber, secondNumber));
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
        }
    }
}
