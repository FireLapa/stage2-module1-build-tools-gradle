package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            double number = Double.parseDouble(str);
            return number >= 0 && !hasLeadingZeros(str);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean hasLeadingZeros(String str) {
        return str.length() > 1 && str.charAt(0) == '0';
    }
}