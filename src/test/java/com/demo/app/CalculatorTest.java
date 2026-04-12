package com.demo.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(8.0, Calculator.add(5, 3), 0.01);
    }

    @Test
    public void testAddNegative() {
        assertEquals(-2.0, Calculator.add(-5, 3), 0.01);
    }

    @Test
    public void testSubtract() {
        assertEquals(6.0, Calculator.subtract(10, 4), 0.01);
    }

    @Test
    public void testMultiply() {
        assertEquals(20.0, Calculator.multiply(5, 4), 0.01);
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0.0, Calculator.multiply(5, 0), 0.01);
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, Calculator.divide(20, 4), 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }
}
