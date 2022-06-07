/* 27) Faça um programa que receba a quantidade de dinheiro em
reais que uma pessoa que vai viajar possui. Essa pessoa vai passar
por vários países e precisa converter seu dinheiro em dólares,
marco alemão e libra esterlina. Sabe-se que a cotação do dólar é
R$ 1,80 do marco alemão R$2,00 e da libra esterlina de R4 1,57. 
O programa deve fazer as conversões e mostrá-las. */

import java.util.Scanner;

public class Lista3_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em Reais (R$):");
        float dinReal = leitor.nextFloat();

        float dinDolar = dinReal / 1.8f;
        float dinMarcoAlem = dinReal / 2f;
        float dinLibraEster = dinReal / 1.57f;

        System.out.printf("Valor convertido em Dolar: R$ %.2f\n", dinDolar);
        System.out.printf("Valor convertido em Marco Alemão: R$ %.2f\n", dinMarcoAlem);
        System.out.printf("Valor convertido em Libra Esterlina: R$ %.2f", dinLibraEster);

        leitor.close();
    }
}