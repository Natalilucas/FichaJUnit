package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculadora;

    @BeforeEach
    public void setup(){
        this.calculadora = new Calculator();
    }

    @Test
    public void addTest(){
        assertEquals(10, calculadora.add(7, 3));
    }
}