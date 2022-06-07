/* Faça um programa que receba a idade de uma pessoa e mostre a
mensagem de maioridade ou não. */

import java.util.Scanner;

public class Lista4_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = leitor.nextInt();

        if(idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    leitor.close();
    }
}