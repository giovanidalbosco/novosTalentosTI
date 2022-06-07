/* Faça um programa que receba dez números e armazene em uma
lista. Em seguida percorra toda a lista mostrando apenas os
números que cujo valor seja superior a 10. */

import java.util.Scanner;

public class Lista10_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String lista[] = new String[10];

        for (int i=0; i<10; i++) {
            System.out.println("Digite um número: ");
            lista[i] = leitor.nextLine();
        }
        System.out.println("Números digitados maiores que 10: ");

        for (int i=0; i<10; i++) {
            if (Integer.parseInt(lista[i]) > 10) {
                System.out.printf("%s ", lista[i]);
            }
        }
        leitor.close();
    }
}
