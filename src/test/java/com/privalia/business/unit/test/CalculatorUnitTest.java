package com.privalia.business.unit.test;


import com.privalia.business.ICalculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;

public class CalculatorUnitTest {

    @Mock
    ICalculator iCalculator;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAdd() {
        when(iCalculator.sum(2,3)).thenReturn(5);
        assertTrue(iCalculator.sum(2,3) == 5);
    }

    @Test
    public void testSub() {
        when(iCalculator.substract(4,3)).thenReturn(1);
        assertTrue(iCalculator.substract(4,3) == 1);
    }

    @Test
    public void testMul() {
        when(iCalculator.multiply(2,3)).thenReturn(6);
        assertTrue(iCalculator.multiply(2,3) == 6);
    }

    @Test
    public void testDiv() {
        when(iCalculator.divide(9,3)).thenReturn(3);
        assertTrue(iCalculator.divide(9,3) == 3);
    }
}
