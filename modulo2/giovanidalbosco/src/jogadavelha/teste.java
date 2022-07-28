package jogadavelha;

import java.util.ArrayList;
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
        while (jogada != 999) {
            jogada = Integer.parseInt(scan.nextLine());
            contador++;
            if (contador % 2 != 0) {
                play1.setJogada(jogada);
            } else {
                play2.setJogada(jogada);
            }

            

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
            } else {
                System.out.println("Jogada inválida");
            }

            /*sequencias de vitória:
            123
            456
            789

            147
            258
            369

            159
            357

            */

        }
    }
}
