import java.util.Scanner;

public class Lista6_exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua renda anual:");
        float rendaAnual = Float.parseFloat(leitor.nextLine());

        float pagamento = 0;
        if (rendaAnual <= 19200f) {
            System.out.print("Pagamento isento");
        } else if (rendaAnual <= 30000f) {
            pagamento = rendaAnual * 0.08f;
            System.out.printf("Pagamento de 8%% sobre a renda. Valor de R$ %.2f", pagamento);
        } else {
            pagamento = rendaAnual * 0.11f;
            System.out.printf("Pagamento de 11%% sobre a renda. Valor de R$ %.2f", pagamento);
        }
        leitor.close();
    }
}
/*47)Escreva um algoritmo que calcule o valor de Imposto de Renda que uma Pessoa Física deve pagar de acordo com o 
valor total de seu rendimento anual: abaixo de R$19.200 isento, acima deste valor e até R$30.000 8%. Mais que 
R$30.000 anuais 11%.*/