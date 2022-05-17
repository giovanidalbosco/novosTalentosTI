import java.util.Scanner;

public class gitEstrutSeq_exercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do salário bruto: ");
        float salBruto = leitor.nextFloat();

        float descPrevSocial = salBruto * 10/100;

        float descImpRenda = (salBruto - descPrevSocial) * 5/100;

        float salLiquido = salBruto - descPrevSocial - descImpRenda;

        System.out.printf("O desconto da Previdência Social é de R$ %.2f\n", descPrevSocial);
        System.out.printf("O desconto do Imposto de Renda é de R$ %.2f\n", descImpRenda);
        System.out.printf("O salário liquido é de R$ %.2f", salLiquido);

        leitor.close();
    }
}