package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    public int add( int a, int b){
        return a + b;
    }

    public int divide( int a, int b){
        if(b == 0 ){
            throw new IllegalArgumentException("Valor negativo");
        }
        return a/b;
    }

    public int multiply( int a, int b){
        return a*b;
    }

    public int minus( int a, int b){
        return a-b;
    }



}
