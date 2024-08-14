package com.example;

public class Calculator {

    public int add(int a, int b) {
        validateInput(a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        validateInput(a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        validateInput(a, b);
        return a * b;
    }

    public int divide(int a, int b) {
        validateInput(a, b);
        if (b == 0) {
            throw new CalculatorException("Division by zero is not allowed");
        }
        return a / b;
    }

    private void validateInput(int a, int b) {
        if (a < Integer.MIN_VALUE || a > Integer.MAX_VALUE || b < Integer.MIN_VALUE || b > Integer.MAX_VALUE) {
            throw new CalculatorException("Input values are out of range");
        }
    }
}
