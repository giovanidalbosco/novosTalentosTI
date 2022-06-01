package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {
    private PlanejadorDeChurrasco calc;

    @BeforeEach
    public void paraCada() {
        calc = new PlanejadorDeChurrasco();
    }

    @DisplayName("Testa calculadoraChurras com um adulto e uma criança")
    @Test
    public void testeUmAdultoEUmaCrianca() {
        calc.setAdultos(1);
        calc.setCriancas(1);
        assertEquals(350f,calc.calculaQtdeCarne());
    }

    @DisplayName("Testa calculadoraChurras com zero adulto e uma criança")
    @Test
    public void testeZeroAdultoEUmaCrianca() {
        calc.setAdultos(0);
        calc.setCriancas(1);
        assertEquals(100f,calc.calculaQtdeCarne());
    }

    @DisplayName("Testa calculadoraChurras com um adulto e zero criança")
    @Test
    public void testeUmAdultoEZeroCrianca() {
        calc.setAdultos(1);
        calc.setCriancas(0);
        assertEquals(250f,calc.calculaQtdeCarne());
    }

}
