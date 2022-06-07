/* Faça um programa que receba dez números e armazene em uma
lista. Em seguida solicite um outro número e armazene em uma
variável chamada multiplicador. Percorra todo a lista e
multiplique cada número pelo multiplicador e apresente em tela. */

import java.util.Scanner;
import java.util.Arrays;

public class Lista10_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }

        System.out.print("Digite um multiplicador: ");
        int multiplicador = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < 10; i++) {
            lista[i] *= multiplicador;
        }

        System.out.print(String.format("A lista multiplicada é: %s", Arrays.toString(lista)));

        leitor.close();
    }
}
