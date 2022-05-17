import java.util.Scanner;
import java.lang.Math;

public class gitEstrutRep_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int A = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro número:");
        int B = Integer.parseInt(leitor.nextLine());
        double valor = 0;
        int teste = 0, aux = 0;
        if(A > B) {
            aux = B;
            B = A;
            A = aux;
        }
        for(int a = A; a <= B; a++) {
            teste = a % 2;
            if(teste == 0) {
                valor += Math.pow(a, 3);
            }
        }
        System.out.print("Resultado: " + valor);
        leitor.close();
    }
}
/*Faça um programa para calcular e escrever a soma dos cubos dos números pares compreendidos entre A e B (B > A).
A e B são lidos pelo teclado.*/