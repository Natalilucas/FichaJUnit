package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;
    Funcionario Natali = new Funcionario("natali", 1500, "Software");

    @BeforeEach
    void setUp() {
    }

    @Test
    void aumentarSalario() {
         assertEquals(24000, Natali.aumentarSalario(15));
         assertEquals(31500, Natali.aumentarSalario(20));
         assertEquals(46500, Natali.aumentarSalario(30));
    }
}