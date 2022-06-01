package br.univille;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getPercFrequencia() {
        return percFrequencia;
    }
    public void setPercFrequencia(float percFrequencia) {
        this.percFrequencia = percFrequencia;
    }
    
    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public float calcMedia() {
        float media = 0;
        for(int i = 0; i < getListaNotas().size(); i++) {
            media += getListaNotas().get(i).getNota();
        }
        return media /= getListaNotas().size();
    }

    public boolean estaEmExame() {  
        if(getPercFrequencia() >= 75) {
            if(calcMedia() < 7f && calcMedia() >= 3f) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean estaAprovado() {
        if(getPercFrequencia() >= 75) {
            if(calcMedia() >= 7f) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean estaReprovado() {
        if(getPercFrequencia() >= 75) {
            if(calcMedia() < 3f) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

}
