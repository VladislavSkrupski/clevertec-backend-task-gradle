package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("1", "5", "12"));
        assertTrue(Utils.isAllPositiveNumbers("4", "2"));
    }

    @Test
    void isNotAllPositiveNumbers() {
        assertFalse(Utils.isAllPositiveNumbers("-1", "asd", "12"));
        assertFalse(Utils.isAllPositiveNumbers("1", "0", ""));
    }
}