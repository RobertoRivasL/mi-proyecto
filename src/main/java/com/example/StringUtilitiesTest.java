package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilitiesTest {

    private final StringUtilities stringUtilities = new StringUtilities();

    @Test
    public void testUpperCase() {
        String str = "hello";
        String expected = "HELLO";
        assertEquals(expected, stringUtilities.toUpperCase(str));
    }

    @Test
    public void testLowerCase() {
        String str = "HELLO";
        String expected = "hello";
        assertEquals(expected, stringUtilities.toLowerCase(str));
    }

    @Test
    public void testStartsWith() {
        String str = "This is a string";
        assertTrue(stringUtilities.startsWith(str, "This"));
    }

    @Test
    public void testEndsWith() {
        String str = "This is a string";
        assertTrue(stringUtilities.endsWith(str, "string"));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(StringUtilitiesException.class, () -> stringUtilities.toUpperCase(null));
    }
}
