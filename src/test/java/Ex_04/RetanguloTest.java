package Ex_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void setUp() {

        this.retangulo = new Retangulo();

    }

    @Test
    void calcularRetangulo() {
        assertEquals(60, retangulo.calcularRetangulo(10, 6));
        assertEquals(1550, retangulo.calcularRetangulo(100, 15.5));
    }

    @Test
    void calcularPerimetro() {
        assertEquals(240, retangulo.calcularPerimetro(40, 80));
        assertEquals(970, retangulo.calcularPerimetro(105, 380));
    }
}