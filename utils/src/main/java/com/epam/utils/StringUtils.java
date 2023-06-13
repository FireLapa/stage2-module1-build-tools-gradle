package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            double number = Double.parseDouble(str);
            return number > 0 || (number == 0 && str.charAt(0) == '0');
        } catch (NumberFormatException e) {
            return false;
        }
    }
}