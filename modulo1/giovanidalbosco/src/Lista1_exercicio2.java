/* Exercício 2) Faça um programa para calcular a quantidade de
carne necessária para um churrasco de acordo com o número de
pessoas convidadas. Considere que todas são adultas e que um
adulto consome 250 gramas de carne por refeição. */

import java.util.Scanner;

public class Lista1_exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de pessoas convidadas: ");
        int pessoas = leitor.nextInt();

        float totalCarne = pessoas * 0.250f;

        System.out.println(String.format("Quantidade total de carne necessária: %.2f Kg", totalCarne));
        //System.out.printf("Quantidade total de carne necessária: %.2f Kg", totalCarne);

        leitor.close();
    }
}