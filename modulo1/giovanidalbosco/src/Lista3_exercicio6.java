import java.util.Scanner;

public class Lista3_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo:");
        float salMin = leitor.nextFloat();
        System.out.println("Digite a quantidade de kW consumido:");
        float enerGasta = leitor.nextFloat();

        float valorKWatt = salMin / 5f;
        float valorEnergia = enerGasta * valorKWatt;
        float valorEnergDesconto = valorEnergia * .85f;

        System.out.println(String.format("Valor do kW é de R$ %.2f", valorKWatt));
        System.out.printf("Valor pago pela residência é de R$ %.2f\n", valorEnergia);
        System.out.printf("Valor pago pela residência com desconto de 15%% é de R$ %.2f", valorEnergDesconto);

        leitor.close();
    }
}