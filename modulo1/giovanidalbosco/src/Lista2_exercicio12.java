/* 12) Sabe-se que, para iluminar de maneira correta os cômodos
de uma casa, para cada metro quadrado, deve-se usar 18Watts de
potência. Faça um programa que receba as duas dimensões de um
cômodo (em metros), calcule e mostre a sua área (em metros
quadrados) e a potência de iluminação que deverá ser utilizada. */

import java.util.Scanner;

public class Lista2_exercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a largura do cômodo em metros: ");
        float largura = leitor.nextFloat();
        System.out.print("Digite o comprimento do cômodo em metros: ");
        float comprimento = leitor.nextFloat();

        float areaComodo = largura * comprimento;
        float potNesse = areaComodo * 18f;

        System.out.printf("A área total do cômodo é de %.2f m²\n", areaComodo);
        System.out.printf("A potência total necessária é de %.2f watts\n", potNesse);

        leitor.close();
    }
}