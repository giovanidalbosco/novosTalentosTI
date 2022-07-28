package jogadavelha;

import java.util.ArrayList;

public class Jogador {
    private String nome;
    private int id;
    private ArrayList<Integer> jogadas = new ArrayList<>();
    static int contador = 0; 
    
    public Jogador(String nome) {
        contador++;
        this.nome = nome;
        this.id = getConta();
    }

    private static int getConta() { 
        return contador; 
    } 

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getJogadas() {
        return jogadas;
    }

    public void setJogada(Integer jogada) {
        this.jogadas.add(jogada);
    }

}