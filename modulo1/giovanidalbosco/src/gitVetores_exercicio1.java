import java.lang.Math;
import java.util.Arrays;

public class gitVetores_exercicio1 {
    public static void main(String[] args) {
        double numero[] = new double[100];
        for (int i = 0; i < 100; i++) {
            numero[i] = Math.round(Math.random() * 100);
        }
        System.out.println(String.format("%s", Arrays.toString(numero)));

        double soma = 0;
        double media = 0;
        double maiorValor = 0;
        double menorValor = 0;

        for (int i = 0; i < 100; i++) {
            if (numero[i] > maiorValor || maiorValor == 0) {
                maiorValor = numero[i];
            }
            if (numero[i] < menorValor || menorValor == 0) {
                menorValor = numero[i];
            }
            soma += numero[i];
        }
        media = (float)soma / (float)numero.length;

        System.out.println(String.format("Soma: %.0f", soma));
        System.out.println(String.format("Média: %.2f", media));
        System.out.println(String.format("MaiorValor: %.0f", maiorValor));
        System.out.println(String.format("MenorValor: %.0f", menorValor));


    }
}
/*1. Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor dos valores armazenados em um vetor A
de 100 elementos numéricos a serem lidos do dispositivo de entrada padrão.    */