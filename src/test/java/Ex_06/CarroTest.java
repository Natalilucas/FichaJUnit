package Ex_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro volvoV40;
    Carro mercedesA180;
    Carro lamborghini;

    @BeforeEach
    void setUp() {
        volvoV40 = new Carro("Volvo", "V40", 2018, 2.0, 95, TipoCombustivel.DIESEL, 5 );
        mercedesA180 = new Carro("Mercedes", "A180", 2020, 1.5, 105, TipoCombustivel.GASOLINA, 4);
        lamborghini = new Carro("lamborghini", "Hurucan", 2023, 300, 229, TipoCombustivel.GASOLINA, 11);
    }

    @Test
    void consumoTest() {
        assertEquals(6, volvoV40.calcularConsumo(120));
        assertEquals(3.2, mercedesA180.calcularConsumo(80));
    }

    @Test
    void corridaTest() {
        assertEquals(volvoV40, volvoV40.corrida(mercedesA180));
        assertEquals(volvoV40, mercedesA180.corrida(volvoV40));
    }

    @Test
    void ligarTest() {
        assertEquals(0, volvoV40.ligar());
    }

    @Test
    void ligarComTemperaturaTest() {
    }
}