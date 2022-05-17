import java.util.Scanner;

public class Lista3_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas:");
        float horasTrab = leitor.nextFloat();
        System.out.println("Digite o valor do salário mínimo:");
        float salMin = leitor.nextFloat();

        float valorHorasTrab = salMin / 2f;
        float salBruto = horasTrab * valorHorasTrab;
        float imposto = salBruto * 0.03f;
        float totalReceber = salBruto - imposto;

        System.out.printf("O funcionário trabalhou %.1f horas no mês e terá direito ao salário bruto de R$ %.2f.\nSerá descontado o valor do imposto de R$ %.2f. O total a receber é de R$ %.2f", horasTrab, salBruto, imposto, totalReceber);

        leitor.close();
    }
}