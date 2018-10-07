package com.startjava.lesson_4.calculator;

import java.lang.Math;

class Calculator {

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

    private void splitMathExpression(String mathExpr) {
        String[] mathExpressionArray = mathExpr.split(" ");

        setFirstNumber(Integer.parseInt(mathExpressionArray[0]));
        setMathOperator(mathExpressionArray[1].charAt(0));
        setSecondNumber(Integer.parseInt(mathExpressionArray[2]));
    }

    void calc(String mathExpr) {
        splitMathExpression(mathExpr);

        switch (mathOperator) {
            case '+':
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println(Math.subtractExact(firstNumber , secondNumber));
                break;
            case '*':
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println(Math.floorDiv(firstNumber, secondNumber));
                break;
            case '^':
                System.out.println((int) Math.pow(firstNumber, secondNumber));
                break;
            case '%':
                System.out.println(Math.floorMod(firstNumber, secondNumber));
                break;
        }
    }
}
