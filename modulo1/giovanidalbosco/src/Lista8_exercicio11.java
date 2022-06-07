/* Faça um algoritmo que leia um número inteiro e calcule o seu
fatorial. Se o número for negativo, informe que o valor é
inválido. Sabemos que o fatorial de um número n, representado por
n!, é dado por: n * (n-1) * (n-2) * ... * 1, para n > 0 e
n! = 1 para n = 0 */

import java.util.Scanner;

public class Lista8_exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int num = 0;
        do {
            System.out.print("Digite um número: ");
            num = Integer.parseInt(leitor.nextLine());
            if (num < 0) {
                System.out.print("Número inválido! ");
            }
        } while (num < 0);

        long valor = 1;
        for (int fatorial = 0; fatorial < num; fatorial++) {
            valor *= num - fatorial;
        }
        System.out.printf("%d! = %d", num, valor);
        leitor.close();
    }
}
