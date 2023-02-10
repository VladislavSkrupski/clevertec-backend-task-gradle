package ru.clevertec;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    /**
     * @param str input string
     * @return <b>true</b>, if <b>str</b> is positive integer number and <b>false</b> in other cases
     */
    public static boolean isPositiveNumber(String str) {
        // No need to check on ">0", because isNumeric returns false if string contains minus
        return isNumeric(str);
    }
}
