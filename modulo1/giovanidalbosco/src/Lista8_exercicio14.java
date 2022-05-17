import java.util.Scanner;
import java.util.Vector;

public class Lista8_exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de turmas da escola:");
        int numTurmas = Integer.parseInt(leitor.nextLine());

        Vector<Integer> num = new Vector<Integer>(); //cria o vetor "num" com o numero de elementos conforme entrada numTurmas

        for (int i = 1; i <= numTurmas; i++) {
            System.out.printf("Digite a média da turma %d\n", i);
            num.add(Integer.parseInt(leitor.nextLine())); //adiciona ao vetor "num" o valor de entrada digitado. Está certo fazer desta forma?
        }
        int soma = 0;
        float media = 0;
        for (int i = 0; i < numTurmas; i++) {
            System.out.printf("A média da turma %d foi de %d\n", i+1, num.get(i));
            soma += num.get(i);
            media = (float)soma / ((float)i + 1f);
        }
        System.out.printf("A média geral foi de %.1f\n", media);
        leitor.close();
    }
}
/*68) Faça um algoritmo que calcule a média de todas as turmas de uma escola. Considere como entradas o número de 
turmas e o número de alunos de cada turma. A média de cada turma deve ser apresentada, além da média geral, que 
será o resultado da média das turmas.  */