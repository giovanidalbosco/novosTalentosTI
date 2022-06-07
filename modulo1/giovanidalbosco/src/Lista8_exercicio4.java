/* Faça um programa que leia um número N que indica quantos
valores inteiros e positivos devem ser lidos a seguir. Para cada
número lido, mostre o valor lido e o fatorial desse valor. */

import java.util.Scanner;

public class Lista8_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = Integer.parseInt(leitor.nextLine());
        int cont = 0;
        long N_fatorial = 1;
        while (cont <= N) {
            for (int a = 1; a <= cont; a++) {
                N_fatorial *= a; 
            }
            System.out.println(String.format("%d! = %d", cont, N_fatorial));
            cont++;
            N_fatorial = 1;
        }
        leitor.close();
    }
}
