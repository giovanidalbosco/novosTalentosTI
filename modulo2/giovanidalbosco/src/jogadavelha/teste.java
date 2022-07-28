package jogadavelha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();

        ArrayList<Integer> jogadas = new ArrayList<>();

        Jogador play1 = new Jogador("Giovani");
        Jogador play2 = new Jogador("Marina");

        int contador = 0;
        int jogada = 0;
        while (contador != 9) {
            jogada = Integer.parseInt(scan.nextLine());
            contador++;
            
            //verificar se a jogada é válida
            boolean flag = false;
            for (Integer i: jogadas) {
                if (jogada == i) {
                    flag = true;
                }
            }  
            if (jogada > 0 && jogada < 10 && flag == false) {
                System.out.println("Jogada válida");
                jogadas.add(jogada);
                System.out.print(tabuleiro.desenharTabuleiro(jogadas));
                if (contador % 2 != 0) {
                    play1.setJogada(jogada);
                } else {
                    play2.setJogada(jogada);
                }
            } else {
                System.out.println("Jogada inválida");
            }
            
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
                if (sb1_ordenada.indexOf(resultado) == 0) {
                    System.out.println ("Jogador 1 ganhou!");
                    System.exit(0);
                } else if (sb2_ordenada.indexOf(resultado) == 0) {
                    System.out.println ("Jogador 2 ganhou!");
                    System.exit(0);
                } else if (contador == 9) {
                    System.out.println ("Empate!");
                }
            }

        }
            
        scan.close();
    }
}
