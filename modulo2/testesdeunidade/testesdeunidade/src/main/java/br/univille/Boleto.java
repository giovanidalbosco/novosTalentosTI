package br.univille;

import java.text.DecimalFormat;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percDesconto;
    private float percMulta;

    public Boleto(float valor, int diaDoVencimento, float percDesconto, float percMulta ) {
        this.valor = valor;
        this.diaDoVencimento = diaDoVencimento;
        this.percDesconto = percDesconto;
        this.percMulta = percMulta;
    }

    public float getValor() {
        return valor;
    }

    public int getDiaDoVencimento() {
        return diaDoVencimento;
    }

    public float getPercDesconto() {
        return percDesconto;
    }

    public float getPercMulta() {
        return percMulta;
    }

    public float pagar(int diaDoPagamento) {
        DecimalFormat df = new DecimalFormat("#.##");
        float valorFinal = getValor();
        if(diaDoPagamento < diaDoVencimento) {
            valorFinal = Float.valueOf(df.format(getValor() * (1f - getPercDesconto()/100f)));
        } else if (diaDoPagamento > diaDoVencimento) {
            valorFinal = Float.valueOf(df.format(getValor() * (1f + getPercMulta()/100f)));
        }

        return valorFinal;
    }
    
    public static void main(String[] args) {
        Boleto boleto = new Boleto(200, 10, 5, 7);
        System.out.print(boleto.pagar(9));
    }

}
