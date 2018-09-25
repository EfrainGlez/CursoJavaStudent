package com.privalia.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private ICalculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sum() {
        assertEquals(calculator.sum(2, 3), 5);
    }

    @Test
    public void substract() {
        assertEquals(calculator.substract(2, 2), 0);
    }

    @Test
    public void multiply() {
        assertEquals(calculator.multiply(3, 4) , 12);
    }

    @Test
    public void divide() {
        assertEquals(calculator.divide(25, 5), 5);
    }
}