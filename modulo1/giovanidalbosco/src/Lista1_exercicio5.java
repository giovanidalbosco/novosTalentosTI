/* Exercício 5) Construa um programa que mostre o percentual que
uma despesa mensal representa do seu salário total. */

import java.util.Scanner;

public class Lista1_exercicio5 {
    public static void main(String[] args)throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar o valor do salário: ");
        float valorSalario = leitor.nextFloat();
        System.out.println("Informar o valor da despesa: ");
        float valorDespesa = leitor.nextFloat();

        float percentual = (valorDespesa / valorSalario) * 100;

        System.out.println("Valor da despesa em relação ao salário é " + percentual + "%");

        leitor.close();
    }
}
