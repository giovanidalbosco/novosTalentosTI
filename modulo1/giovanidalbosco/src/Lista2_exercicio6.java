/* 6) Faça um programa que calcule e mostre a área de um trapézio.
Sabe-se que: A=((base maior + base menor) * altura)/2 */

import java.util.Scanner;

public class Lista2_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base menor do trapésio:");
        float baseMenor = leitor.nextFloat();
        System.out.println("Digite a base maior do trapésio:");
        float baseMaior = leitor.nextFloat();
        System.out.println("Digite a altura do trapésio:");
        float altura = leitor.nextFloat();

        float area = (baseMaior + baseMenor) * altura /2f;

        System.out.println("A área do trapézio é " + area);

        leitor.close();
    }
}