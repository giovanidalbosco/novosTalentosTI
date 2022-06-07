/* Faça um programa para corrigir provas de múltipla escolha com
somatória. Cada prova tem dez questões e cada questão vale 1 ponto.
O primeiro conjunto de dados a ser lido é o gabarito da prova. Os
outros dados serão os números dos alunos e sua respectivas
respostas. Existem 15 alunos matriculados. Calcule e mostre:
- Para cada aluno seu número e sua nota;
- A percentagem de aprovação, sabendo-se que a nota mínima é 6,0 */

import java.util.Scanner;
import java.util.Arrays;

public class Lista11_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int gabarito[] = {23,31,15,12,9,3,10,20,14,29};

        String gabaritoBinario[] = new String[gabarito.length];

        for (int i = 0; i < gabarito.length; i++) {
            //----- Este bloco transforma decimal para binário ---------------------------------
            String transformacao = "";
		    while (gabarito[i] > 0) {
			    transformacao += gabarito[i] % 2;
			    gabarito[i] = gabarito[i] >> 1; // é a divisão que você deseja
		    }
            while (transformacao.length() < 5) {
                transformacao += 0;
            }
            gabaritoBinario[i] = "";
            for (int j = transformacao.length() - 1; j >= 0; j--) {
                gabaritoBinario[i] += transformacao.charAt(j);
            }
            //----- Este bloco transforma decimal para binário ---------------------------------
        }

        int valorRespostaDecimal[] = new int[gabarito.length];
        String valorRespostaBinario[] = new String[gabarito.length];

        for (int i = 0; i < gabarito.length; i++) {
            //----- Este bloco transforma decimal para binário ---------------------------------
            System.out.printf("Digite o valor da questão %d: ", i + 1);
            valorRespostaDecimal[i] = Integer.parseInt(leitor.nextLine());
            String transformacao = ""; // guarda os dados
            while (valorRespostaDecimal[i] > 0) {
                transformacao += valorRespostaDecimal[i] % 2;
                valorRespostaDecimal[i] = valorRespostaDecimal[i] >> 1; // é a divisão que você deseja
            }
            while (transformacao.length() < 5) {
                transformacao += 0;
            }
            valorRespostaBinario[i] = "";
            for (int j = transformacao.length() - 1; j >= 0; j--) {
                valorRespostaBinario[i] += transformacao.charAt(j);
            }
            //----- Este bloco transforma decimal para binário ---------------------------------
        }

        float scoreQuestao[] = new float[gabarito.length];
        float scoreFinal = 0;
        for (int i = 0; i < gabarito.length; i++) {
            for (int j = 0; j < gabaritoBinario[i].length(); j++) {
                if (valorRespostaBinario[i].charAt(j) == gabaritoBinario[i].charAt(j)) {
                    scoreQuestao[i] += .2f;
                }
            }
            scoreFinal += scoreQuestao[i];
        }
        System.out.printf("Score questoes %s\n", Arrays.toString(scoreQuestao));
        System.out.printf("Score final: %.1f", scoreFinal);
        leitor.close();
    }
}
