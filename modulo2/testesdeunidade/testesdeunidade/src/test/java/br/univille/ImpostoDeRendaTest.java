package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ImpostoDeRendaTest {
    private ImpostoDeRenda IRPF;
    
    
    @BeforeEach
    public void paraCada() {
        IRPF = new ImpostoDeRenda();
    }
    
    @DisplayName("Testa retorno se imposto de renda igual zero")
    @Test
    public void testePercentagemIRPFIgualZero() {
        assertEquals(0f, IRPF.calcPercIRPF(0f));
    }

    @DisplayName("Testa retorno se imposto de renda primeira faixa")
    @Test
    public void testePercentagemIRPFPrimeiraFaixa() {
        assertEquals(0.075f, IRPF.calcPercIRPF(2000f));
    }

    @DisplayName("Testa retorno se imposto de renda segunda faixa")
    @Test
    public void testePercentagemIRPFSegundaFaixa() {
        assertEquals(0.15f, IRPF.calcPercIRPF(3000f));
    }

    @DisplayName("Testa retorno se imposto de renda terceira faixa")
    @Test
    public void testePercentagemIRPFTerceiraFaixa() {
        assertEquals(0.225f, IRPF.calcPercIRPF(4000f));
    }

    @DisplayName("Testa retorno se imposto de renda quarta faixa")
    @Test
    public void testePercentagemIRPFQuartaFaixa() {
        assertEquals(0.275f, IRPF.calcPercIRPF(5000f));
    }

    @DisplayName("Teste de calculo do rendimento por mês")
    @Test
    public void testeCalculoRendimentoPorMes() {
        Rendimento rendimento = new Rendimento("salario", 6000);
        Rendimento rendimento2 = new Rendimento("venda carro", 30000);
        IRPF.getListaRendimentos().add(rendimento);
        IRPF.getListaRendimentos().add(rendimento2);
        IRPF.setValorImpostoRetidoNaFonte(1000f);
        
        assertEquals(3000, IRPF.calcRendMes());
    }

    @DisplayName("Teste de calculo do valor final do IRPF")
    @Test
    public void testeCalculoValorFinalIRPF() {
        Rendimento rendimento = new Rendimento("salario", 6000);
        Rendimento rendimento2 = new Rendimento("venda carro", 30000);
        IRPF.getListaRendimentos().add(rendimento);
        IRPF.getListaRendimentos().add(rendimento2);
        IRPF.setValorImpostoRetidoNaFonte(1000f);
        
        assertEquals(4400f, IRPF.calculaValorIRPF());
    }

}
