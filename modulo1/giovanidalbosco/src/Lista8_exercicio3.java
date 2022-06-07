/*57) Faça um programa que leia um valor N inteiro e positivo.
Calcule e mostre o valor de E, conforme a fórmula a seguir:

E = 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!) */

import java.util.Scanner;

public class Lista8_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = Integer.parseInt(leitor.nextLine());
        int cont = 0;
        double E = 0;
        long N_fatorial = 1;
        while (cont <= N) {
            for (int a = 1; a <= cont; a++) {
                N_fatorial *= a; 
            }
            E += 1f / N_fatorial;
            cont++;
            N_fatorial = 1;
        }
        System.out.println("soma = " + E);
        leitor.close();
    }
}
