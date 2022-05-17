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