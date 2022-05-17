import java.util.Scanner;

public class Lista1_exercicio7{
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do boleto: ");
        float valorBoleto = leitor.nextFloat();
        System.out.println("Digite o percentual da multa: ");
        float percentMulta = leitor.nextFloat();

        float valorMulta = valorBoleto * percentMulta / 100;

        float valorBoletoCorrigido = valorBoleto + valorMulta;

        System.out.printf("Valor da multa é de R$ %.2f\n", valorMulta);

        System.out.printf("Valor do boleto corrigido é R$ %.2f", valorBoletoCorrigido);

        leitor.close();
    }
}