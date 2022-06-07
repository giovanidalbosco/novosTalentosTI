/* Faça um programa que receba:
- o código de um produto comprado, supondo que a digitação do
código do produto seja sempre válida, isso é, um número inteiro
entre 1 e 10;
- o peso do produto em quilos;
- o código do país de origem, supondo que a digitação do código
seja sempre válida, isso é, um número inteiro entre 1 e 3. 

Tabelas:
Código do país de origem    Imposto
        1                      0%
        2                     15%
        3                     25%
 
Código do produto       Preço por grama
      1 a 4                 R$ 10,00
      5 a 7                 R$ 25,00
      8 a 10                R$ 35,00
 
Calcule e mostre:
- o peso do produto convertido em gramas;
- o preço total do produto comprado;
- o valor do imposto, sabendo que ele é cobrado sobre o preço
total do produto comprado e depende do país de origem;
- o valor total, preço total do produto mais imposto. */

import java.util.Scanner;

public class Lista4_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código do produto de 1 a 10:");
        int codProduto = leitor.nextInt();
        System.out.println("Digite peso do produto em kg:");
        float pesoProduto = leitor.nextFloat();
        System.out.println("Digite o código do país de origem:\n1. Sem Imposto\n2. Imposto de 15%\n3. Imposto de 25%");
        int codPais = leitor.nextInt();

        float pesoProdutGramas = pesoProduto * 1000;
        System.out.printf("Peso total do produto é de %.1f gramas\n", pesoProdutGramas);

        float valorProduto = 0;
        if(codProduto <= 4) {
            valorProduto = pesoProdutGramas * 10;
        }
        else if (5 <= codProduto && codProduto <= 7) {
            valorProduto = pesoProdutGramas * 25;
        }
        else {
            valorProduto = pesoProdutGramas * 35;
        }
        System.out.printf("Valor total do produto comprado sem impostos é de R$ %.2f\n", valorProduto);
        float valorProdutoTax = 0;
        if(codPais == 2) {
            valorProdutoTax = valorProduto * 0.15f;
        }
        else if (codPais == 3) {
            valorProdutoTax = valorProduto * 0.25f;
        }
        System.out.printf("Valor do imposto cobrado sobre o produto é de R$ %.2f\n", valorProdutoTax);
        float valorProdutoTotal = valorProduto + valorProdutoTax;
        System.out.printf("Valor total do produto comprado mais impostos é de R$ %.2f", valorProdutoTotal);
        leitor.close();
    }
}