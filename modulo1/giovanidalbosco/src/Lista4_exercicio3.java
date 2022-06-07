/* Uma empresa decide dar um aumento de 30% aos funcionários com
salários inferiores a R$ 500,00.Faça um programa que receba o
salário do funcionário e mostre o valor do salário reajustado ou
uma mensagem caso ele não tenha direito ao aumento. */

import java.util.Scanner;

public class Lista4_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salario = leitor.nextFloat();

        if(salario<=500) {
            salario = salario * 1.3f;
            System.out.printf("Seu novo salário será de %.2f", salario);
        }
        else {
            System.out.printf("Seu salário de %.2f não sofrerá alteração", salario);
        }
    leitor.close();
    }
}
