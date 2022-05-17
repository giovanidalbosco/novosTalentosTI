import java.util.Scanner;

public class Lista2_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        float salarioFixo = leitor.nextFloat();
        System.out.println("Digite o valor das vendas deste funcionário:");
        float vendas = leitor.nextFloat();

        float comisVendas = vendas * .04f;

        float salarioTotal = salarioFixo + comisVendas;

        System.out.println("Valor da comissão do funcionário é R$ " + comisVendas);
        System.out.println("Valor total do salário é R$ " + salarioTotal);
        leitor.close();
    }
}
