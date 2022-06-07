/* O custo ao consumidor de um carro novo é a soma do preço da
fábrica com o percentual de lucro do distribuidor e dos impostos
aplicados ao preço de fábrica. Faça um programa que receba o
preço de fábrica de um veículo, o percentual de lucro do
distribuidor e o percentual de impostos. Calcule e mostre:
a. O valor correspondente ao lucro do distribuidor
b. O valor correspondente aos impostos
c. O preço final do veículo */

import java.util.Scanner;

public class Lista5_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço de fábrica:");
        float precoFab = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual de lucro do distribuidor:");
        float lucroDis = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual de impostos:");
        float impostos = Float.parseFloat(leitor.nextLine());

        lucroDis = (lucroDis / 100f) * precoFab;
        impostos = (impostos / 100f) * precoFab;

        float precoFinal = precoFab + lucroDis + impostos;

        System.out.printf("O preço final para o consumidor é R$ %.2f", precoFinal);
        leitor.close();
    }
}
