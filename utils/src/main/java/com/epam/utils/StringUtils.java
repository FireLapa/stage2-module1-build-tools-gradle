package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            double number = Double.parseDouble(str);
            return number > 0 || (number == 0 && !hasLeadingZeros(str));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean hasLeadingZeros(String str) {
        return str.startsWith("0") && !str.equals("0");
    }
}