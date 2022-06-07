/* Faça um programa que receba dez números e armazene em uma
lista. Em seguida calcule a soma de todos os números percorrendo
novamente a lista. Apresente a soma e em seguida a média baseada
na soma e no número de números armazenados. */

import java.util.Scanner;

public class Lista10_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += lista[i];
        }
        float media = (float)soma / (float)lista.length;

        System.out.print(String.format("A soma dos números digitados é %d e a média é %.2f", soma, media));

        leitor.close();
    }
}
