package Ex_01;

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

    @Test
    public void subtractTest(){
        assertEquals(5, calculadora.minus(10, 5));
    }

    @Test
    public void divideTest(){
        assertEquals(6, calculadora.divide(12, 2));
    }

    public void multiplyTest(){
        assertEquals(12, calculadora.multiply(6,2));
    }


    @Test
    public void testDivideByZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(0,0);
            calculadora.divide(10, 0);
        });
    }

}