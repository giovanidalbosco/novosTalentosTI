/*52)Um supermercado deseja reajustar os preços de seus produtos
usando o seguinte critério: o produto poderá ter seu preço
aumentado ou diminuído. Para alterar o preço o produto deve
preencher pelo menos um dos requisitos a seguir:
 
Requisitos                                     |Reajuste
-----------------------------------------------+-------------------------------------
Venda Média Mensal          Preço Atual        | % de Aumento    % de Redução
-----------------------------------------------+-------------------------------------
< R$ 500                     < R$ 30           |     12              não    
>= 500 e < 1.600        >= R$ 30 e < R$ 80     |     15              não    
>= 1.600                   >= R$ 80,00         |    não               25               */

import java.util.Scanner;

public class Lista7_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da venda mensal do produto:");
        float vendaMensal = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o preço atual do produto:");
        float valorProduto = Float.parseFloat(leitor.nextLine());

        float novoValor = 0;
        if (vendaMensal < 500 || valorProduto < 30) {
            novoValor = valorProduto * 1.12f;
        } else if (vendaMensal < 1600 || valorProduto < 80) {
            novoValor = valorProduto * 1.15f;
        } else {
            novoValor = valorProduto * 0.75f;
        }
        System.out.printf("Novo valor do produto R$ %.2f\n", novoValor);

        leitor.close();
    }
}
