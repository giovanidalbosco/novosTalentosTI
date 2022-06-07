/* 9) Faça um programa que receba o valor do salario mínimo e o
valor do salário de um funcionário, calcule e mostre a quantidade
de salários mínimos que esses funcionário ganha. */

import java.util.Scanner;

public class Lista2_exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo:");
        float salMin = leitor.nextFloat();
        System.out.println("Digite o valor do salário do funcionário:");
        float salFunci = leitor.nextFloat();

        float result = salFunci / salMin;

        System.out.printf("O funcionário ganha %.1f salário(s) mínimo(s)", result);

        leitor.close();
    }
}