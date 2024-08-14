package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilitiesTest {

    @Test
    public void testUpperCase() {
        String str = "hello";
        String expected = "HELLO";
        assertEquals(expected, str.toUpperCase());
    }

    @Test
    public void testLowerCase() {
        String str = "HELLO";
        String expected = "hello";
        assertEquals(expected, str.toLowerCase());
    }

    @Test
    public void testStartsWith() {
        String str = "This is a string";
        assertTrue(str.startsWith("This"));
    }

    @Test
    public void testEndsWith() {
        String str = "This is a string";
        assertTrue(str.endsWith("string"));
    }

    // You can add more tests for various string operations
}
