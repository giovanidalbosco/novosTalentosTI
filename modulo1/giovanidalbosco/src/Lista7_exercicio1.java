/* Faça um programa que receba o número de horas trabalhadas, o
valor do salário mínimo e o número de horas extras trabalhadas.
Calcule e mostre o salário a receber seguindo as regras abaixo:
a) a hora trabalhada vale 1/8 do salário mínimo;
b) a hora extra vale ¼ do salário mínimo;
c) o salário bruto equivale ao número de horas trabalhadas
multiplicado pelo valor da hora trabalha (apresente o valor para
o usuário);
d) a quantia a receber pelas horas extras equivale ao número de
horas extras trabalhadas multiplicado pelo valor da hora extra
(apresente o valor para o usuário);
e) o salário a receber equivale ao salário bruto mais a quantia a
receber pelas horas extras(apresente o valor para o usuário). */

import java.util.Scanner;

public class Lista7_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrab = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo:");
        float salMin = Float.parseFloat(leitor.nextLine());
        System.out.println("digite o número de horas extras trabalhadas:");
        int horasExtTrab = Integer.parseInt(leitor.nextLine());

        float valorHora = salMin / 8f;
        float valorHoraExt = salMin / 4f;
        float salBruto = horasTrab * valorHora;

        System.out.printf("Salário bruto R$ %.2f\n", salBruto);

        float salExtra = horasExtTrab * valorHoraExt;

        System.out.printf("Salário extra R$ %.2f\n", salExtra);

        float salTotal = salBruto + salExtra;

        System.out.printf("Salário total %.2f", salTotal);

        leitor.close();
    }
}
