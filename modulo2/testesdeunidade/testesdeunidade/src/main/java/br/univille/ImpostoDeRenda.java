package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    private float valorImpostoRetidoNaFonte;
    private ArrayList<Rendimento> listaRendimentos = new ArrayList<>();
    
    public void setValorImpostoRetidoNaFonte(float valorImpostoRetidoNaFonte) {
        this.valorImpostoRetidoNaFonte = valorImpostoRetidoNaFonte;
    }
    public ArrayList<Rendimento> getListaRendimentos() {
        return listaRendimentos;
    }

    public float calcPercIRPF(float rendimentoMes) {
        float percIRPF = 0f;
        
        if(rendimentoMes <= 1903.99) {
            
        } else if(rendimentoMes <= 2826.65) {
            percIRPF = 7.50f;
        } else if(rendimentoMes <= 3751.05) {
            percIRPF = 15.0f;
        } else if(rendimentoMes <= 4664.68) {
            percIRPF = 22.50f;
        } else if(rendimentoMes > 4664.68) {
            percIRPF = 27.50f;
        }

        return percIRPF/100f;
    }

    public float calcRendMes() {
        float rendimentoMes = 0;
        for(Rendimento rendimento : getListaRendimentos()) {
            rendimentoMes += rendimento.getValor();
        }
        return rendimentoMes /= 12f;
    }

    public float calculaValorIRPF() {
        float rendimentoTotal = 0f;
        for(Rendimento rendimento : getListaRendimentos()) {
            rendimentoTotal += rendimento.getValor();
        }

        float valorIRPF = rendimentoTotal * calcPercIRPF(calcRendMes());

        float valorIRPFFinal = valorIRPF - valorImpostoRetidoNaFonte;

        return valorIRPFFinal;
    }
}
