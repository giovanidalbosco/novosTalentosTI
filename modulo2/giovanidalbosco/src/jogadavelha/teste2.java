package jogadavelha;

import java.util.ArrayList;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogo novo = new Jogo();
        ArrayList<Integer> jogadas = new ArrayList<>();

        

        while (Jogo.getConta() < 10) {
            int proximaJogada = Integer.parseInt(scan.nextLine());
            novo.verificarJogada(proximaJogada);
            novo.verificarResultado();
        }

        System.out.println(Jogo.getConta());
        System.out.println(jogadas);


    }
}
