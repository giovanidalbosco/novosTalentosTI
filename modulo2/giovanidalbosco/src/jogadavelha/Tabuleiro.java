package jogadavelha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


import java.lang.StringBuilder;

public class Tabuleiro {

    public String desenharTabuleiro(ArrayList<Integer> jogadasEscolhidas) {
        StringBuilder sb = new StringBuilder();
    
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

        //cria o mapa de posições possíveis para jogada
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

        int posicoesDisponiveis = 1;
        int jogador = 0;
        int x = posicoes.get(jogadasEscolhidas.get(0)).get(0);
        int y = posicoes.get(jogadasEscolhidas.get(0)).get(1);
        for (int i = 0; i < 5; i++) { //desenha as linhas
            if (i % 2 == 0) { //posição da linha par
                for (int j = 0; j < 5; j++) { //desenha as colunas
                    if (j % 2 == 0) { //posição da coluna par
                        for (int k = 0; k < jogadasEscolhidas.size(); k++) {
                            if (posicoesDisponiveis == jogadasEscolhidas.get(k)) { //verifica as posições já jogadas
                                x = posicoes.get(jogadasEscolhidas.get(k)).get(0);
                                y = posicoes.get(jogadasEscolhidas.get(k)).get(1);
                                jogador = jogadasEscolhidas.indexOf(jogadasEscolhidas.get(k)); //indices pares indicam jogadas do jogador 1 e indices impares indicam jogadas do jogador 2
                            }
                        }

                        if (i == (2 * x) && j == (2 * y)) { //verifica a posição jogada para desenhar o símbolo do jogador
                            if (jogador % 2 == 0) { //verifica qual jogador fez a jogada
                                sb.append(" X "); //desenha X para o jogador 1
                            } else {
                                sb.append(" O "); //desenha O para o jogador 2
                            }
                        } else {
                            sb.append(String.format(" %d ", posicoesDisponiveis)); //desenha as posições restantes que ainda não foram jogadas
                        }
                        posicoesDisponiveis++; //passa para a próxima jogada
                        
                    } else { //posição da coluna impar
                        sb.append("|"); //desenha os separadores verticais
                    }
                }
            } else { //posição da linha impar
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        sb.append("---"); //desenha os separadores horizontais
                    } else {
                        sb.append("+"); //desenha os separadores horizontais
                    }
                }
            }
            sb.append('\n'); //pula a linha
        } 
        return sb.toString();
    }
}
