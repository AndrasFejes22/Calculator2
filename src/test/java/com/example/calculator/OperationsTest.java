package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
        Operations test = new Operations();
        double result = test.add(10, 10);
        assertEquals(20, result);
    }
    @Test
    void x_per_a() {
        Operations test = new Operations();
        Object result = test.x_per_a(0);
        assertEquals(0.0, result);
    }
}