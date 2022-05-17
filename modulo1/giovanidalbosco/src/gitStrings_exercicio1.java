import java.util.Scanner;

public class gitStrings_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine().toUpperCase();
        String nomeReverso = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeReverso += nome.charAt(i);
        }
        System.out.println(nomeReverso);
        leitor.close();
    }
}
/*1. Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para 
frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras 
maiúsculas ou minúsculas. */