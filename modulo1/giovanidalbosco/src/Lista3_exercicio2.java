import java.util.Scanner;

public class Lista3_exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salario = leitor.nextFloat();

        float imposto = salario * 0.1f;
        float salarioReceber = salario - imposto + 50f;

        System.out.printf("O salário a receber é de R$ %.2f", salarioReceber);

        leitor.close();
    }
}