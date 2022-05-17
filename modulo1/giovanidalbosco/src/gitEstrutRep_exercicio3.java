import java.util.Scanner;

public class gitEstrutRep_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número base:");
        int base = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um número expoente:");
        int expoente = Integer.parseInt(leitor.nextLine());
        int valor = 1;
        for(int a = 1; a <= expoente; a++) {
            valor *= base;
        }
        System.out.println("resultado = " + valor);
        leitor.close();
    }
}
/*Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo 
número. Não utilize a função de potência da linguagem.*/