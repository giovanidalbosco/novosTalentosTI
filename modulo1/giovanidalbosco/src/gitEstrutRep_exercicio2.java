import java.util.Scanner;

public class gitEstrutRep_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = Integer.parseInt(leitor.nextLine());
        int valor = 0;
        for(int a = 1; a <= num; a++) {
            valor += a;
        }
        System.out.println("soma = " + valor);
        leitor.close();
    }
}
/*Escreva um programa que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número lido.
Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15*/