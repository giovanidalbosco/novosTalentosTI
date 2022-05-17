import java.util.Scanner;

public class Lista1_exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de refeições diárias: ");
        int numRefeicoes = leitor.nextInt();
        System.out.println("Digite a quantidade em gramas de ração por refeição");
        float qtdeRacao = leitor.nextFloat();

        float qtdeRacaoMensal = (numRefeicoes * qtdeRacao * 30) / 1000;

        System.out.printf("Quantidade de ração mensal é %.2f kg", qtdeRacaoMensal);

        leitor.close();
    }
}
