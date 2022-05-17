import java.util.Scanner;

public class gitEstrutRep_exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = Integer.parseInt(leitor.nextLine());

        long valor = 1;
        for (int fatorial = 0; fatorial < num; fatorial++) {
            valor *= num - fatorial;
        }
        System.out.printf("%d! = %d", num, valor);
        leitor.close();
    }
}
/*Escreva um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do 
número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N(N!) é definido 
conforme a seguir:

N! = 1 × 2 × 3 × 4 × ... × (N - 1) × N*/