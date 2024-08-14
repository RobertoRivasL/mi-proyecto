package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        StringUtilitiesTest.class,
})
public class AllTestsSuite {
    // Esta clase permanece vacía. Sirve solo como una referencia para las anotaciones anteriores.
}
