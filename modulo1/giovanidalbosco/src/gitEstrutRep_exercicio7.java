import java.util.Scanner;

public class gitEstrutRep_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int A = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro número:");
        int B = Integer.parseInt(leitor.nextLine());

        int teste = 0;
        int controle = 0;
        System.out.printf("Números primos no intervalo entre %d e %d:\n", A, B);
        for(int x = A; x <= B; x++) {
            for(int y = 1; y <= x; y++) {
            teste = x % y;
                if(teste == 0) {
                    controle += 1;
                }
            }
            if(controle == 2) {
                System.out.println(x);
            }
        controle = 0;
        leitor.close();
        }
    }
}
/*Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Faça um programa que determine e escreva 
os números primos compreendidos entre um intervalo fornecido pelo usuário.*/