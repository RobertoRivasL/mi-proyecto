package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        StringUtilities stringUtilities = new StringUtilities();

        // Suma
        int sumResult = calculator.add(5, 3);
        logger.info("Suma: 5 + 3 = {}", sumResult);

        // Resta
        int subtractResult = calculator.subtract(5, 3);
        logger.info("Resta: 5 - 3 = {}", subtractResult);

        // Multiplicación
        int multiplyResult = calculator.multiply(5, 3);
        logger.info("Multiplicación: 5 * 3 = {}", multiplyResult);

        // División
        try {
            double divideResult = calculator.divide(5, 0);
            logger.info("División: 5 / 0 = {}", divideResult);
        } catch (CalculatorException e) {
            logger.error("Error: {}", e.getMessage());
        }

        // División válida
        double divideResult = calculator.divide(6, 3);
        logger.info("División: 6 / 3 = {}", divideResult);

        // Uso de StringUtilities
        String str = "hello";
        String upperCaseStr = stringUtilities.toUpperCase(str);
        logger.info("UpperCase: {} -> {}", str, upperCaseStr);

        String lowerCaseStr = stringUtilities.toLowerCase(upperCaseStr);
        logger.info("LowerCase: {} -> {}", upperCaseStr, lowerCaseStr);

        String testStr = "This is a string";
        boolean startsWith = stringUtilities.startsWith(testStr, "This");
        logger.info("StartsWith: {} -> {}", testStr, startsWith);

        boolean endsWith = stringUtilities.endsWith(testStr, "string");
        logger.info("EndsWith: {} -> {}", testStr, endsWith);
    }
}
