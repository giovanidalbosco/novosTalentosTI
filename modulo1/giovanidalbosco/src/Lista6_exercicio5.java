/* Escreva um algoritmo que calcule o numero de prateleiras
necessárias para guardar uma quantidade informada de livros.
Considerando que em média uma prateleira comporta 32 livros. */

import java.util.Scanner;

public class Lista6_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros para guardar:");
        int qtdeLivros = Integer.parseInt(leitor.nextLine());

        double qtdePrateleiras = Math.ceil(qtdeLivros / 32f);

        System.out.print(String.format("o número de prateleiras necessárias é de %.0f", qtdePrateleiras));

        leitor.close();
    }
}
