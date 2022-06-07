/* Faça um programa que receba três notas de um aluno, calcule e
mostre a média aritmética e a mensagem constante na tabela a
seguir. Aos alunos que ficaram para exame, calcule e mostre a
nota que deverão tirar para serem aprovados, considerando que a
média exigida é 6.0
Média Aritmética       Mensagem
0,0 ●-------O 3,0      Reprovado
3,0 ●-------O 7,0      Exame
7,0 ●-------● 10,0     Aprovado          */

import java.util.Scanner;

public class Lista4_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota");
        float nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota");
        float nota3 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3f;
        if(media < 3) {
            System.out.println("Reprovado!");
        }
        else if ( 3 < media && media < 7) {
            System.out.println("Exame!");

            float notaExame = 12f - media;
            
            System.out.printf("É necessário tirar %.1f no exame para passar", notaExame);
        }
        else {
            System.out.print("Aprovado!");
        }
    leitor.close();
    }
}
