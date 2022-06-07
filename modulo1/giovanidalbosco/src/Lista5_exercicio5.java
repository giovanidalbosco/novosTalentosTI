/* Faça um programa que receba o preço de um produto e o seu
código de origem e mostre a sua procedência. A procedência obedece
a tabela a seguir:

Código de origem    Procedência
1                       Sul
2                      Norte
3                      Leste
4                      Oeste
5 ou 6                Nordeste
7 ou 8 ou 9           Sudeste
10 a 20             Centro-Oeste
21 a 30               Nordeste    */

import java.util.Scanner;

public class Lista5_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço do produto:");
        float preco = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o código de região do produto:");
        int cod = Integer.parseInt(leitor.nextLine());

        String procedencia = "";
        if(cod == 1) {
            procedencia = "Sul";
        } else if(cod == 2) {
            procedencia = "Norte";
        } else if(cod == 3) {
            procedencia = "Leste";
        } else if(cod == 4) {
            procedencia = "Oeste";
        } else if(cod <= 6) {
            procedencia = "Nordeste";
        } else if(cod <= 9) {
            procedencia = "Sudeste";
        } else if(cod <= 20) {
            procedencia = "Centro-Oeste";
        } else if(cod <= 30) {
            procedencia = "Nordeste";
        } else {
            procedencia = "";
        }
        System.out.printf(procedencia == ""?"Não há produto com este código de região":"O produto com valor de R$ %.2f tem procedência do %s", preco, procedencia);
        leitor.close();
    }
}
