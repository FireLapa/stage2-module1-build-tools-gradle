package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (arg.isEmpty() || !StringUtils.isPositiveNumber(arg)) {
                return false;
            }
        }
        return true;
    }
}