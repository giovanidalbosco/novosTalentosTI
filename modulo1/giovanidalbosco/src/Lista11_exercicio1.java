/* Faça um programa que receba a quantidade de peças vendidas por
vendedor e armazene essas quantidades em um vetor. Receba também
o preço da peça vendida de cada vendedor e armazene esses preços
em outro vetor. Existem apenas dez vendedores e cada vendedor
pode vender apenas um tipo de peça, isto é, para cada vendedor
existe apenas um preço. Calcule e mostre a quantidade total de
peças vendidas por todos os vendedores e para cada vendedor
calcule e mostre o valor total da venda, isto é, a quantidade de
peças * o preço da peça. */

import java.util.Scanner;

public class Lista11_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadePecas[] = new int[10];
        float precoPecas[] = new float[10];
        float valorTotalVendido[] = new float[10];
        int quantidadeTotalPecas = 0;

        int i = 0;
        while (i < 10) {
            System.out.printf("Digite a quantidade de peças vendidas pelo vendedor %d: ", i+1);
            quantidadePecas[i] = Integer.parseInt(leitor.nextLine());
            System.out.printf("Digite o preço da peça vendida pelo vendedor %d: ", i+1);
            precoPecas[i] = Float.parseFloat(leitor.nextLine());

            quantidadeTotalPecas += quantidadePecas[i];
            valorTotalVendido[i] = (float)quantidadePecas[i] * precoPecas[i];
            
            i++;
        }
        leitor.close();
        System.out.println(String.format("A quantidade total de peças vendidas foi de %d peças", quantidadeTotalPecas));
        //System.out.printf("Cada vendedor vendeu em R$: %s", Arrays.toString(valorTotalVendido));
        System.out.print("Cada vendedor vendeu: ");
        for (i = 0; i < 10; i++) {
            System.out.printf("R$ %.2f, ", valorTotalVendido[i]);
        }
    }
}
