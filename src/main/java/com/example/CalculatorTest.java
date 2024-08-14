package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddPositiveNumbers() {
        int result = calculator.add(2, 3);
        assertEquals("Expected 5 but got " + result, 5, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = calculator.add(-2, -3);
        assertEquals("Expected -5 but got " + result, -5, result);
    }

    @Test
    public void testAddMixedNumbers() {
        int result = calculator.add(-2, 3);
        assertEquals("Expected 1 but got " + result, 1, result);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        int result = calculator.subtract(3, 2);
        assertEquals("Expected 1 but got " + result, 1, result);
    }

    @Test
    public void testSubtractNegativeNumbers() {
        int result = calculator.subtract(-2, -3);
        assertEquals("Expected 1 but got " + result, 1, result);
    }

    @Test
    public void testSubtractMixedNumbers() {
        int result = calculator.subtract(-2, 3);
        assertEquals("Expected -5 but got " + result, -5, result);
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        int result = calculator.multiply(2, 3);
        assertEquals("Expected 6 but got " + result, 6, result);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        int result = calculator.multiply(-2, -3);
        assertEquals("Expected 6 but got " + result, 6, result);
    }

    @Test
    public void testMultiplyMixedNumbers() {
        int result = calculator.multiply(-2, 3);
        assertEquals("Expected -6 but got " + result, -6, result);
    }

    @Test
    public void testDividePositiveNumbers() {
        int result = calculator.divide(6, 3);
        assertEquals("Expected 2 but got " + result, 2, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(CalculatorException.class, () -> calculator.divide(6, 0));
    }
}
