package com.github.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals("1 plus 1 equals 2", 2, calculator.add(1, 1));
    }

    @Test
    public void orderTest() {
        Calculator calculator = new Calculator();
        assertEquals("2 plus 3 equals 5", 5, calculator.add(2,3));
        assertEquals("3 plus 2 equals 5", 5, calculator.add(3,2));
    }
}
