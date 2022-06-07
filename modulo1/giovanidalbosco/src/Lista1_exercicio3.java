/* Exercício 3) Faça um programa que calcule o valor de reembolso
de despesas de combustível de um funcionário. Considere que o
carro tem o consumo de 1 litro de gasolina a cada 13km rodado. E
o preço do litro de gasolina é de R$ 2,20. */

import java.util.Scanner;

public class Lista1_exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Distância percorrida pelo funcionário em km: ");
        float distancia = leitor.nextFloat();

        float litros = distancia / 13;

        float totalGasto = litros * 2.2f;

        System.out.println(String.format("Total a ser reembolsado ao funcionário: R$ %.2f", totalGasto));

        leitor.close();
    }
}