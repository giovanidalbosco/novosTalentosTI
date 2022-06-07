/* Faça um algoritmo que calcule a média de todas as turmas de
uma escola. Considere como entradas o número de turmas e o número
de alunos de cada turma. A média de cada turma deve ser
apresentada, além da média geral, que será o resultado da média
das turmas. */

import java.util.Scanner;

public class Lista8_exercicio14b {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de turmas da escola:");
        int numTurmas = Integer.parseInt(leitor.nextLine());
        
        int num[] = new int[numTurmas];
        int i;
        for (i = 0; i < numTurmas; i++) {
            System.out.printf("Digite a média da turma %d\n", i+1);
            num[i] = Integer.parseInt(leitor.nextLine());
            leitor.close();
        }
        int soma = 0;
        float media = 0;
        for (i = 0; i < numTurmas; i++) {
            System.out.printf("A média da turma %d foi de %d\n", i+1, num[i]);
            soma += num[i];
            media = (float)soma / ((float)i + 1f);

        }
        System.out.printf("A média geral foi de %.1f\n", media);
    }
}
