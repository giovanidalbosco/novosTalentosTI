package jogadavelha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Jogo {
    private Jogador play1 = new Jogador("Giovani");
    private Jogador play2 = new Jogador("Marina");
    private ArrayList<Integer> jogadasTotais = new ArrayList<>();
    static int contador = 0; 

    public static int getConta() { 
        return contador;
    } 
    
    public void iniciarJogo(String jogador1, String simbolo1, String jogador2, String simbolo2) {

    }

    public void setJogadaListaTotal(int novaJogada) {
        this.jogadasTotais.add(novaJogada);
    }
    public ArrayList<Integer> getListaJogadasTotal() {
        return this.jogadasTotais;
    }

    public void verificarJogada(int proximaJogada) {
        Tabuleiro tabuleiro = new Tabuleiro();

        int jogada = 0;

        
        jogada = proximaJogada;
        contador++;
        
        //verifica se a jogada já foi realizada anteriormente
        boolean flag = false;
        for (Integer i: getListaJogadasTotal()) {
            if (jogada == i) {
                flag = true;
            }
        }

        if (jogada > 0 && jogada < 10 && flag == false) {
            System.out.println("Jogada válida");
            setJogadaListaTotal(jogada);
            System.out.print(tabuleiro.desenharTabuleiro(getListaJogadasTotal()));
            if (getConta() % 2 != 0) {
                play1.setJogada(jogada);
            } else {
                play2.setJogada(jogada);
            }
        } else {
            System.out.println("Jogada inválida");
        }
    }

    public void verificarResultado() {
        StringBuilder sb1 = new StringBuilder();
        for (Integer jogada1: play1.getJogadas()) {
            sb1.append(String.format("%s", String.valueOf(jogada1))); 
        }
        char[] sb1_char = sb1.toString().toCharArray();
        Arrays.sort(sb1_char);
        String sb1_ordenada = new String(sb1_char);

        StringBuilder sb2 = new StringBuilder();
        for (Integer jogada2: play2.getJogadas()) {
            sb2.append(String.format("%s", String.valueOf(jogada2))); 
        }
        char[] sb2_char = sb2.toString().toCharArray();
        Arrays.sort(sb2_char);
        String sb2_ordenada = new String(sb2_char);

        ArrayList<String> listaResultados = new ArrayList<>();
        Collections.addAll(listaResultados, "123","456","789","147","258","369","159","357"); //sequências de vitória
        for (String resultado: listaResultados) {
            System.out.println(sb1_ordenada);
            System.out.println(sb2_ordenada);
            if (sb1_ordenada.indexOf(resultado) == 0) {
                System.out.println ("Jogador 1 ganhou!");
                System.exit(0);
            } else if (sb2_ordenada.indexOf(resultado) == 0) {
                System.out.println ("Jogador 2 ganhou!");
                System.exit(0);
            }
        }
        /* 
        if (contador == 9) {
            System.out.println ("Empate!");
        }*/
    }

    

}
