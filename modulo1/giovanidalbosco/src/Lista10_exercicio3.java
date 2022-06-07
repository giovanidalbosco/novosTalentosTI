/* Faça um programa que receba dez números e armazene em uma
lista. Em seguida, substitua todos os números cujo valor seja
menor que 10 pelo valor ZERO. Imprima a lista em tela. */

import java.util.Scanner;
import java.util.Arrays;

public class Lista10_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lista[] = new int[10];

        for (int i = 0; i<10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
            if (lista[i] < 10) {
                lista[i] = 0;
            }
        }
        System.out.print(String.format("Lista: %s", Arrays.toString(lista).replace("[","").replace("]","")));
        leitor.close();
    }
}
