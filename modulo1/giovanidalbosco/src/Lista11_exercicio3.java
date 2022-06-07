/* Faça um programa que carregue dois vetores, X e Y, com dez
números inteiros cada um. Considere que os números de cada vetor
digital, X e Y, não podem estar repetidos. Calcule e mostre os
seguintes vetores resultantes:
- a união de X com Y (todos os elementos de X e os elementos de Y
que não estejam em X);
- a diferença entre X e Y (todos os elementos de X que não
existam em Y);
- a soma entre X e Y (soma de cada elemento de X com o elemento
de mesma posição em Y);
- produto entre X e Y (multiplicação de cada elemento de X com o
elemento de mesma posição em Y);
- a interseção entre X e Y (apenas os elementos que aparecem nos
dois vetores). */

import java.util.ArrayList;
import java.util.Collections;


public class Lista11_exercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor1 = new ArrayList<>();
        Integer v[] = {0,1,2,3,4,5,6,7,8,9};
        Collections.addAll(vetor1, v);
        
        ArrayList<Integer> vetor2 = new ArrayList<>();
        Integer v2[] = {5,6,7,8,9,10,11,12,13,14};
        Collections.addAll(vetor2, v2);

        System.out.println("Vetor1: " + vetor1);
        System.out.println("Vetor2: " + vetor2);

        ArrayList<Integer> vetorUniao = new ArrayList<>();
        Collections.addAll(vetorUniao, v);

        boolean teste = false;
        for(int i = 0; i < vetor2.size(); i++) {
            for(int j = 0; j < vetorUniao.size(); j++) {
                if(vetor2.get(i) == vetorUniao.get(j)) {
                    teste = true;
                    break;
                }
            }
            if (!teste) {
                vetorUniao.add(vetor2.get(i));
            }
            teste = false;
        }
        System.out.println("União: " + vetorUniao);


        ArrayList<Integer> vetorDiferenca = new ArrayList<>();
        ArrayList<Integer> vetorIntersecao = new ArrayList<>();

        for (int i = 0; i < vetor1.size(); i++) {
            teste = false; 
            for (int j = 0; j < vetor2.size(); j++) {
                if (vetor1.get(i) == vetor2.get(j)) {
                    teste = true;
                }
            }
            if (!teste) {
                vetorDiferenca.add(vetor1.get(i));;
            } else {
                vetorIntersecao.add(vetor1.get(i));;
            }
        }

        for (int i = 0; i < vetor2.size(); i++) {
            teste = false; 
            for (int j = 0; j < vetor1.size(); j++) {
                if (vetor2.get(i) == vetor1.get(j)) {
                    teste = true;
                }
            }
            if (!teste) {
                vetorDiferenca.add(vetor2.get(i));
            }
        }
        System.out.println("Diferença:" + vetorDiferenca);
        System.out.println("Intersecao: " + vetorIntersecao);

    }
}