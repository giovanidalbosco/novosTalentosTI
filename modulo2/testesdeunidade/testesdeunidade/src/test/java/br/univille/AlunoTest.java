package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    private Aluno aluno;
    private Avaliacao avaliacao;

    @BeforeEach
    public void paraCada() {
        aluno = new Aluno();
        aluno.setNome("Giovani");
        avaliacao = new Avaliacao("prova1", 7f);
        aluno.getListaNotas().add(avaliacao);
        aluno.setPercFrequencia(80);
    }

    @DisplayName("Teste calculo da média")
    @Test
    public void testeCalcMedia() {
        assertEquals(7, aluno.calcMedia());
    }

    @DisplayName("Teste aprovado")
    @Test
    public void testeAprovado() {
        assertEquals(true, aluno.estaAprovado());
    }

    @DisplayName("Teste reprovado")
    @Test
    public void testeReprovado() {
        assertEquals(false, aluno.estaReprovado());
    }

    @DisplayName("Teste em exame")
    @Test
    public void testeEmExame() {
        assertEquals(false, aluno.estaEmExame());
    }
}
