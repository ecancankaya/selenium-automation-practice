package com.eyup.automation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorJUnitTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void sum_shouldReturnCorrectResult() {
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    void sum_zeroPlusZero_shouldReturnZero() {
        assertEquals(0, calc.sum(0, 0));
    }

    @Test
    void sum_negativePlusNegative_shouldReturnNegative() {
        assertEquals(-2, calc.sum(-1, -1));
    }

    @Test
    void sum_negativePlusPositive_shouldReturnCorrectResult() {
        assertEquals(1, calc.sum(-1, 2));
    }

    @Test
    void sum_overflow_shouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calc.sum(Integer.MAX_VALUE, 1));
    }

    @Test
    void divide_byZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
