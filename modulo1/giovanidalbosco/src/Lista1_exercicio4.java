/* Exercício 4) Construa um programa que retorne o valor total da
revelação de um filme de 24 poses, solicite o número de fotos
reveladas. E considere que o valor unitário da revelação por foto
é de R$ 0,90. */

import java.util.Scanner;

public class Lista1_exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar quantidade de fotos para revelação: ");
        int numFotos = leitor.nextInt();

        float valorTotal = numFotos * 0.9f;
        
        System.out.println(String.format("Valor total a ser pago: R$ %.2f", valorTotal));

        leitor.close();
    }
}
