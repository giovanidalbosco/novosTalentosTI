import java.util.Scanner;

public class Lista5_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salario = leitor.nextFloat();

        float gratificacao = salario * 0.05f;
        float imposto = salario * 0.07f;
        float salarioReceber = salario + gratificacao - imposto;

        System.out.printf("O salário a receber é de R$ %.2f", salarioReceber);

        leitor.close();
    }
}
/*
34)Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber, sabendo-se 
que esse funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre o salário-base.
*/