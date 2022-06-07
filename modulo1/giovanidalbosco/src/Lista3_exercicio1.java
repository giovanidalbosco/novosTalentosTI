/* 1) Faça um programa que receba o salário de um funcionário e o
percentual de aumento, calcule e mostre o valor do aumento e o
novo salário. */

import java.util.Scanner;

public class Lista3_exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salario = leitor.nextFloat();
        System.out.println("Digite a percentagem do aumento aplicado ao salário:");
        float aumento = leitor.nextFloat();

        float valorAumento = salario * aumento / 100f;
        float salarioMais = salario + valorAumento;

        System.out.printf("O valor do aumento de %.2f%% equivale a R$ %.2f\n", aumento, valorAumento);
        System.out.println(String.format("O valor do salário com o aumento somado é R$ %.2f", salarioMais));

        leitor.close();
    }
}
