package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlimentoTest {

    Animal animal;
    Animal tobias;

    Animal fido;

    @BeforeEach
    void setup(){
        this.animal = new Animal();
        tobias = new Animal("Tobias", Alimento.CARNE);
        fido = new Animal("Fido", Alimento.PEIXE);
    }

    @Test
    void getNome(){
        assertEquals("Tobias", tobias.getNome());
        assertEquals("Fido", fido.getNome());
    }

    @Test
    void animalConstrutor(){
        this.animal = new Animal("tobias", Alimento.FRUTAS);

    }

    @Test
    void animalEstacomFome(){
        assertTrue(tobias.estaComFome());
        assertTrue(fido.estaComFome());
    }

    @Test
    void comerTest(){
        assertTrue(tobias.estaComFome());
        assertTrue(fido.estaComFome());

        tobias.comer(Alimento.CARNE);

        fido.comer(Alimento.VEGETAIS);

        assertFalse(tobias.estaComFome());

        assertTrue(fido.estaComFome());

        fido.comer(Alimento.VEGETAIS);

        assertTrue(fido.estaComFome());

        fido.comer(Alimento.PEIXE);

        assertFalse(fido.estaComFome());
    }



}
