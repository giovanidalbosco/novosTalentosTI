package br.univille;

public class PlanejadorDeChurrasco {
    private int adultos;
    private int criancas;

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public void setCriancas(int criancas) {
        this.criancas = criancas;
    }

    public float calculaQtdeCarne() {
        float total;

        total = 250 * adultos + 100 * criancas;

        return total;
    }

}
