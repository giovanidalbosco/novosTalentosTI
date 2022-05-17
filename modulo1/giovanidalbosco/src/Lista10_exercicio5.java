import java.util.Scanner;

public class Lista10_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }

        int maiorNum = 0;
        int menorNum = 0;
        for (int i = 0; i < 10; i++) {
            if (lista[i] > maiorNum || maiorNum == 0) {
                maiorNum = lista[i];
            }
            if (lista[i] < menorNum || menorNum ==0) {
                menorNum = lista[i];
            }
        }

        System.out.print(String.format("O maior número é o %d e o menor número é o %d", maiorNum, menorNum));

        leitor.close();
    }
}
/*76) Faça um programa que receba dez números e armazene em uma lista. Em seguida percorra toda a lista e procure 
qual o MAIOR valor dentro da lista e qual o MENOR valor dentro da lista. No final apresente o MAIOR e o MENOR valor. */