package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals; // é possivel importar métodos se eles forem estaticos
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void paraCada() {
        calc = new Calculadora();
    }
    // é uma boa prática ter somente uma asserção por método

    @DisplayName("Testa soma do valor dois com dois")
    @Test // anotation 
    public void testaSomaDoisEDois() {
        assertEquals(4, calc.soma(2, 2));
    }

    @DisplayName("Testa soma do valor dois com cinco")
    @Test
    public void testaSomaDoisECinco() {
        assertEquals(7, calc.soma(2, 5));
    }

    @DisplayName("Testa doma do valor dois com menos um")
    @Test
    public void testaSomaDoisEMenosUm() {
        assertEquals(1, calc.soma(2, -1));
    }

    @DisplayName("Testa subtracao do valor cinco com quatro")
    @Test
    public void testaSubCincoEQuatro() {
        assertEquals(1, calc.sub(5,4));
    }

    @DisplayName("Testa subtracao do valor quatro com cinco")
    @Test
    public void testaSubQuatroECinco() {
        assertEquals(-1, calc.sub(4, 5));
    }

    @DisplayName("Testa subtracao do valor menos tres com menos sete")
    @Test
    public void testaSubMenosTresEMenosSete() {
        assertEquals(4, calc.sub(-3, -7));
    }

    @DisplayName("Testa divisao do valor quatro por dois")
    @Test
    public void testDivQuatroPorDois() {
        assertEquals(2, calc.div(4f, 2f));
    }

    @DisplayName("Testa divisao do valor tres por zero")
    @Test
    public void testDivTresPorDois() {
        // metodo 1
        assertEquals(true, Float.isInfinite(calc.div(3f,0f)));

        // metodo 2 (antigo)
        try {
            calc.div(3f,0f);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }

        //metodo 3 (antigo)
        try {
            calc.div(3, 0);
            fail("Deveria ocorrer ArithmeticException");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }

        // metodo 4 (versão bonita)
        assertThrows(ArithmeticException.class, () -> calc.div(3, 0));

    }

    @DisplayName("Testa divisao do valor quatro por tres")
    @Test
    public void testDivQuatroPorTres() {
        assertEquals(1.3333334f, calc.div(4f, 3f));
    }

}
