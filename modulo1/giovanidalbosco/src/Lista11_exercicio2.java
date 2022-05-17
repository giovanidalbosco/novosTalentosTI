import java.util.Arrays;

public class Lista11_exercicio2 {
    public static void main(String[] args) {
        int vetor1[] = {10,11,12,13,14,15,16,17,18,19};
        int vetor2[] = {0,1,2,3,4,5,6,7,8,9};

        int vetor3[] = new int[20];
        int i = 0;
        int j = 0;
        while (i < 10) {
            vetor3[j] = vetor1[i];
            vetor3[j + 1] = vetor2[i];
            i++;
            j+=2;
        }
        System.out.println(String.format("Vetor intercalado: %s", Arrays.toString(vetor3)));
    }
}
/*80) Faça um programa que carregue dois vetores de dez elementos numéricos cada um e mostre um vetor resultante da 
intercalação desses dois vetores. */