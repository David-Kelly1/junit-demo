package com.example;

import org.junit.jupiter.api.Test;

import com.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
       
        float result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void shouldAddNegativeNumbers() {
       
        float result = calculator.add(-2, 3);

        assertEquals(1, result);
    }

     @Test
    void shouldSubtractTwoNumbers() {
       
        float result = calculator.subtract(3, 2);

        assertEquals(1, result);
    }

     @Test
    void shouldMultiplyTwoNumbers() {
       
        float result = calculator.multiply(3, 2);

        assertEquals(6, result);
    }

     @Test
    void shouldDivideTwoNumbers() {
       
        float result = calculator.divide(3, 2);

        assertEquals(1.5, result);
    }
}