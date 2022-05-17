import java.util.Scanner;

public class Lista10_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lista[] = new int[10];

        int par = 0;
        int impar = 0;
        for (int i = 0; i<10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
            if (lista[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.print(String.format("Números pares: %d\nNúmeros impares: %d", par, impar));
        leitor.close();
    }
}
/*73) Faça um programa que receba dez números e armazene em uma lista. Em seguida conte quantos números são impar e 
quantos são par. Apresente os contadores na tela. */