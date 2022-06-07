/* Faça um programa que calcule a soma dos números inteiros de
1 a 100. */

public class Lista8_exercicio1 {
    public static void main(String[] args) {
        int a = 0;
        int valor = 0;
        while (a < 100) {
            a++;
            valor += a;
        }
        System.out.println("soma = " + valor);

    }
}
