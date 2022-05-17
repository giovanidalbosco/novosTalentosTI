import java.util.Scanner;

public class Lista8_exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num_1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro número:");
        int num_2 = Integer.parseInt(leitor.nextLine());
        int apoio = 0;
        if (num_1 > num_2) {
            apoio = num_1;
            num_1 = num_2;
            num_2 = apoio;
        }
        int soma = 0;
        for (int i = 0; i < num_2; i++) {
            if (i % 2 == 1) {
                soma += i;
            }
        }
        System.out.printf("Soma dos números impares no intervalo de %d a %d é %d", num_1, num_2, soma);
        leitor.close();
    }
}
/*66) Faça um algoritmo que calcule a soma de todos os números ímpares dentro de uma faixa de valores determinada pelo
usuário. Um número é ímpar quando sua divisão por 2 não é exata, ou seja, o resto resultante da divisão inteira pelo
número 2 tem valor 1. Utilize a palavra resto como operador que calcula o resto da divisão de um numero por outro.*/