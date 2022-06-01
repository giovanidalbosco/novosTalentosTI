package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BoletoTest {
    private Boleto boleto;

    @DisplayName("teste pagamento adiantado")
    @Test
    public void testePagamentoAdiantado() {
        boleto = new Boleto(200, 10, 5, 7);
        assertEquals(190, boleto.pagar(9));
    }

    @DisplayName("teste pagamento atrasado")
    @Test
    public void testePagamentoAtrasado() {
        boleto = new Boleto(200, 10, 5, 7);
        assertEquals(214, boleto.pagar(11));
    }

    @DisplayName("teste pagamento no dia")
    @Test
    public void testePagamentoNoDia() {
        boleto = new Boleto(200, 10, 5, 7);
        assertEquals(200, boleto.pagar(10));
    }
}
