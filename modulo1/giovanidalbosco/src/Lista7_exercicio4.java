/* Faça um ÚNICO programa para auxiliar uma empresa de importação
a calcular o valor do preço final de importação de um produto.
Para isso solicite ao usuário: o preço original do produto em
dólares, o valor da cotação do dólar,o preço do transporte em
reais e o tipo de imposto que deve incidir sobre o preço do
produto (1 – IPI, 2 – ICMS, 3 – Ambos IPI e ICMS). 
 
Para CADA item abaixo calcule e mostre: 
 
O preço do produto em reais, que consiste no preço original do
produto em dólares e o valor da cotação do dólar.
 
O valor do imposto federal em reais, de acordo com a tabela
abaixo, considerando o tipo informado de imposto que incide sobre
o produto e o preço do produto em reais já calculado:
 
Tipo Imposto      |Preço do Produto em Reais       |% de Imposto 
------------------+--------------------------------+-------------
IPI               |Até R$3.000,00 (inclusive)      | 1,5% 
                  |Mais de R$3.000,00              | 2% 
------------------+--------------------------------+-------------
ICMS              |Até R$ 1.500,00                 | 2% 
                  |Mais de R$ 1.500,00 (inclusive) | 3,5% 
------------------+--------------------------------+-------------
Ambos IPI e ICMS  |                                | 5% 
------------------+--------------------------------+-------------
 
O valor do imposto estadual em reais, conforme a regra abaixo:
O valor do imposto estadual em reais será 2/7 (dois sétimos) do
valor do imposto federal em reais calculado anteriormente.
 
O valor do preço final de importação de um produto, consiste na
soma do preço do produto em reais com o valor do imposto federal
em reais, o preço do transporte em reais, e o valor do imposto
estadual em reais. */

import java.util.Scanner;

public class Lista7_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço do produto em dolar:");
        float precoProdutoDolar = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a cotação do dolar:");
        float cotacaoDolar = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o preço do transporte em reais:");
        float precoTrans = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a opção do imposto a ser cobrado:\n1 - IPI\n2 - ICMS\n3 - Ambos IPI e ICMS");
        int opcaoImposto = Integer.parseInt(leitor.nextLine());
        
        float precoProdutoReal = precoProdutoDolar * cotacaoDolar;

        float valorImpostoFed = 0;
        switch (opcaoImposto) {
            case 1:
                if (precoProdutoReal <= 3000) {
                    valorImpostoFed = precoProdutoReal * 0.015f;
                } else {
                    valorImpostoFed = precoProdutoReal * 0.02f;
                }
                break;
            case 2:
                if (precoProdutoReal < 1500) {
                    valorImpostoFed = precoProdutoReal * 0.02f;
                } else {
                    valorImpostoFed = precoProdutoReal * 0.035f;
                }
                break;
            case 3:
                valorImpostoFed = precoProdutoReal * 0.05f;
                break;
            default:
                System.out.println("Você não digitou uma opção válida");
        }
        float valorImpostoEst = (2f / 7f) * valorImpostoFed;

        float valorFinal = precoProdutoReal + valorImpostoFed + valorImpostoEst + precoTrans;

        System.out.printf("Imposto Federal pago R$ %.2f\nImposto Estadual pago R$ %.2f\nPreço final do produto é de R$ %.2f", valorImpostoFed, valorImpostoEst, valorFinal);

        leitor.close();
    }
}
