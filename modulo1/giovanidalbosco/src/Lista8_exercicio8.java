/* Elaborar um programa que efetue a leitura de valores positivos
inteiros até que um valor negativo seja informado. Ao final deve
ser apresentados o maior e o menor número informado pelo usuário. */

import java.util.Scanner;

public class Lista8_exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int menor = 0;
        int maior = 0;
        int num = 0;
        while (num >= 0) {
            if (num >= maior || maior == 0) {
                maior = num;
            }
            if (num <= menor || menor == 0) {
                menor = num;
            }
            System.out.println("Digite um número positivo");
            num = Integer.parseInt(leitor.nextLine());
            if (num < 0) {
                System.out.println("O número digitado é negativo");
            }
        }
        System.out.printf("O maior número é o %d e o menor número é o %d", maior, menor);
        leitor.close();
    }
}
