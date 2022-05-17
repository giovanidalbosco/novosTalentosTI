import java.util.Scanner;

public class gitEstrutDes_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do corretor:");
        String nomeCorretor = leitor.nextLine();
        System.out.println("Valor das vendas:");
        float valorVendas = leitor.nextFloat();

        float valorComissao = 0;
        if(valorVendas > 50000) {
            valorComissao = valorVendas * 0.12f;
        } else if(valorVendas >= 30000 && valorVendas <= 50000) {
            valorComissao = valorVendas * 0.095f;
        } else {
            valorComissao = valorVendas * 0.07f;
        }
        System.out.printf("O corretor %s receberá uma comissão de vendas de R$ %.2f", nomeCorretor, valorComissao);
        leitor.close();
    }
}
