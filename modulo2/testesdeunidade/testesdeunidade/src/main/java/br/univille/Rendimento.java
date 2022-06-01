package br.univille;

public class Rendimento {
    private String descricao;
    private float valor;

    public Rendimento(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }
}
