/* 1) Faça um programa que receba um número real, encontre e
mostre:
- a parte inteira desse número;
- a parte fracionária desse número;
- o arredondamento desse número. */

import java.lang.Math;
import java.util.Scanner;

public class Lista2_exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite um número real:");
        Scanner leitor = new Scanner(System.in);
        float num = leitor.nextFloat();
        
        double parteInt = Math.floor(num);
        double parteFrac = num - parteInt;
        double arred = Math.round(num);

        System.out.printf("Parte inteira: %.2f\n", parteInt);
        System.out.printf("Parte fracionária: %.4f\n", parteFrac);
        System.out.printf("Arredondamento: %.2f", arred);

        leitor.close();
    }
}