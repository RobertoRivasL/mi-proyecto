package com.example;

public class StringUtilities {

    public String toUpperCase(String str) {
        validateString(str);
        return str.toUpperCase();
    }

    public String toLowerCase(String str) {
        validateString(str);
        return str.toLowerCase();
    }

    public boolean startsWith(String str, String prefix) {
        validateString(str);
        validateString(prefix);
        return str.startsWith(prefix);
    }

    public boolean endsWith(String str, String suffix) {
        validateString(str);
        validateString(suffix);
        return str.endsWith(suffix);
    }

    private void validateString(String str) {
        if (str == null || str.isEmpty()) {
            throw new StringUtilitiesException("String cannot be null or empty");
        }
    }
}
