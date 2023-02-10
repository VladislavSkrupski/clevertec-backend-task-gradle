package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    void isPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("123"), "Should return 'true'");
        assertTrue(StringUtils.isPositiveNumber("0"), "Should return 'true'");
        assertFalse(StringUtils.isPositiveNumber("-123"), "Should return 'false'");
        assertFalse(StringUtils.isPositiveNumber("abcd"), "Should return 'false'");
    }
}
