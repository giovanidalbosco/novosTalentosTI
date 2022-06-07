/* 4) Faça um programa que receba o peso de uma pessoa, calcule e
mostre:
- o novo peso, se a pessoa engordar 15% sobre o peso digitado;
- o novo peso, se a pessoa emagrecer 20% sobre o peso digitado. */

import java.util.Scanner;

public class Lista2_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        float peso = leitor.nextFloat();

        float engord = peso * 1.15f;
        float emagre = peso * 0.8f;

        System.out.printf("Se engordar 15%% fica com %.2f kg\n", engord);
        System.out.printf("Se emagrecer 20%% fica com %.2f kg", emagre);

        leitor.close();
    }
}
