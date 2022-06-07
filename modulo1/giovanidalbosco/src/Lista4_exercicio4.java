/* Faça um programa que mostre o menu de opções a seguir, receba
a opção do usuário e os dados necessáriospara executar cada
operação. Menu de opções:
1. Somar dois números
2. Raiz quadrada de um número
Solicite ao usuário digitar a opção desejada */

import java.util.Scanner;
import java.lang.Math;

public class Lista4_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma das opções abaixo:\n1. Somar dois números\n2. Raiz quadrada de um número");
        float opcao = leitor.nextFloat();

        if(opcao == 1) {
            System.out.println("Digite o primeiro número:");
            float primNum = leitor.nextFloat();
            System.out.println("Digite o segundo número:");
            float seguNum = leitor.nextFloat();
            float soma = primNum + seguNum;
            System.out.printf("A soma dos dois números é %.2f", soma);
        }
        else if (opcao == 2) {
            System.out.println("Digite um número");
            float num = leitor.nextFloat();
            double raiz = Math.sqrt(num);
            System.out.printf("A raiz quadrada do número %.2f é %.2f", num, raiz);
        }
        else {
            System.out.print("Voce não digitou uma opção válida!");
        }
    leitor.close();
    }
}
