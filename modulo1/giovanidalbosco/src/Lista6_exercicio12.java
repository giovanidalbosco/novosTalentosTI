/* Em uma eleição sindical concorreram ao cargo de presidente
três candidatos (A, B e C). Escreva um algoritmo em FLUXOGRAMA
que solicite a quantidade de votos de cada candidato, a
quantidade de votos nulos e votos em branco. Calcule o percentual
DE CADA CANDIDATO em relação ao total de votos válidos. E o
percentual de votos nulos e votos em branco do total geral de
votos. */

import java.util.Scanner;

public class Lista6_exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de votos do candidato A:");
        int votosA = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidato B:");
        int votosB = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidato C:");
        int votosC = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos em branco:");
        int votosBranco = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos núlos:");
        int votosNulo = Integer.parseInt(leitor.nextLine());

        float totalVotos = votosA + votosB + votosC + votosBranco + votosNulo;

        float votosAper = votosA * 100 / totalVotos;
        float votosBper = votosB * 100 / totalVotos;
        float votosCper = votosC * 100 / totalVotos;
        float votosBrancoper = votosBranco * 100 / totalVotos;
        float votosNuloper = votosNulo * 100 / totalVotos;

        System.out.printf("Total de votos foi de %.0f.\nCandidato A: %.2f%%\nCandidato B: %.2f%%\nCandidato C: %.2f%%\nVotos em branco: %.2f%%\nVotos núlos: %.2f%%", totalVotos, votosAper, votosBper, votosCper, votosBrancoper, votosNuloper);
        
        leitor.close();
    }
}
