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

import java.util.Arrays;

public class Lista11_exercicio3b {
    public static void main(String[] args) {
        int vetor1[] = {0,1,2,3,4,5,6,7,8,9};
        //int vetor1[] = {9,8,7,6,5,4,3,2,1,0};
        int vetor2[] = {5,6,7,8,9,10,11,12,13,14};
        //int vetor2[] = {14,13,12,11,10,9,8,7,6,5};

        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        int teste = 0;
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    teste++;
                    contador2++;
                }
            }
            if (teste == 0) {
                contador++;
                contador3++;
            }
            teste = 0;
        }
        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    teste++;
                }
            }
            if (teste == 0) {
                contador3++;
            }
            teste = 0;
        }
        
        int tamanhoVetorUniao = vetor1.length + contador;
        int tamanhoVetorDiferenca = contador3;
        int tamanhoVetorIntersecao = contador2;

        int vetorUniao[] = new int[tamanhoVetorUniao];
        for (int i = 0; i < vetorUniao.length; i++) {
            if (i < vetor1.length) {
                vetorUniao[i] = vetor1[i];
            } else {
                for (int j = 0; j < vetor2.length; j++) {
                    for (int k = 0; k < vetorUniao.length; k++) {
                        if (vetor2[j] == vetorUniao[k]) {
                            teste++;
                            break;
                        }
                    }
                    if (teste == 0) {
                    vetorUniao[i] = vetor2[j];
                    break;
                    }
                    teste = 0;
                }
            }
        }
        
        int vetorDiferenca[] = new int[tamanhoVetorDiferenca];
        int vetorIntersecao[] = new int[tamanhoVetorIntersecao];

        int livre = 0;
        int livre2 = 0;
        int flag = 0;
        for (int i = 0; i < vetor1.length; i++) {
            flag = 0; 
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                vetorDiferenca[livre] = vetor1[i];
                livre++;
            } else {
                vetorIntersecao[livre2] = vetor1[i];
                livre2++;
            }
        }
        System.out.println(Arrays.toString(vetorDiferenca));
        for (int i = 0; i < vetor2.length; i++) {
            flag = 0; 
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                vetorDiferenca[livre] = vetor2[i];
                livre++;
            }
        }

        int vetorSoma[] = new int[vetor1.length];
        int vetorMultiplicacao[] = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
            vetorMultiplicacao[i] = vetor1[i] * vetor2[i];
        }

        System.out.println(String.format("Vetor 1: %s", Arrays.toString(vetor1)));
        System.out.println(String.format("Vetor 2: %s\n", Arrays.toString(vetor2)));
        System.out.println(String.format("VetorUniao: %s", Arrays.toString(vetorUniao)));
        System.out.println(String.format("VetorDiferenca: %s", Arrays.toString(vetorDiferenca)));
        System.out.println(String.format("VetorSoma: %s", Arrays.toString(vetorSoma)));
        System.out.println(String.format("VetorMultiplicação: %s", Arrays.toString(vetorMultiplicacao)));
        System.out.println(String.format("VetorIntersecao: %s", Arrays.toString(vetorIntersecao)));
    }
}
