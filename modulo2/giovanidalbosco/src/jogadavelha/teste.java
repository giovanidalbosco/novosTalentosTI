package jogadavelha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class teste {
    public static void main(String[] args) {

        int jogador = 1;
        
        ArrayList<Integer> coordPos1 = new ArrayList<>();
        ArrayList<Integer> coordPos2 = new ArrayList<>();
        ArrayList<Integer> coordPos3 = new ArrayList<>();
        ArrayList<Integer> coordPos4 = new ArrayList<>();
        ArrayList<Integer> coordPos5 = new ArrayList<>();
        ArrayList<Integer> coordPos6 = new ArrayList<>();
        ArrayList<Integer> coordPos7 = new ArrayList<>();
        ArrayList<Integer> coordPos8 = new ArrayList<>();
        ArrayList<Integer> coordPos9 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> coordenadas = new ArrayList<>();
        
        Collections.addAll(coordenadas, coordPos1, coordPos2, coordPos3, coordPos4, coordPos5, coordPos6, coordPos7, coordPos8, coordPos9);
        
        HashMap<Integer, ArrayList<Integer>> posicoes = new HashMap<>();

        int h1 = 0;
        int h2 = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                coordenadas.get(h1).add(x);
                coordenadas.get(h1).add(y);
                posicoes.put(h2, coordenadas.get(h1));
                
                h1++;
                h2++; 
            }  
        }

        ArrayList<Integer> jogadasEscolhidas = new ArrayList<>();
        jogadasEscolhidas.add(5);
        jogadasEscolhidas.add(6);


        int x = 0;
        int y = 0;
        
        int posicao = 1;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        
                        for (int k = 0; k < jogadasEscolhidas.size(); k++) {
                            x = posicoes.get(jogadasEscolhidas.get(k)).get(0);
                            y = posicoes.get(jogadasEscolhidas.get(k)).get(1);
                        }
                        
                        if (i == (2 * x) && j == (2 * y)) {
                            if (jogador == 1) {
                                System.out.printf(" X ");
                            } else {
                                System.out.printf(" O ");
                            }
                        } else {
                            System.out.printf(" %d ", posicao);
                        }
                        posicao++;
                        

                    } else {
                        System.out.print("|");
                    }
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        System.out.print("---");
                    } else {
                        System.out.print("+");
                    }
                }
            }
            System.out.print('\n');
        }   
    }
}
