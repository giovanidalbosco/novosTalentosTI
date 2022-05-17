import java.util.Scanner;

public class Lista8_exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num_1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo número:");
        int num_2 = Integer.parseInt(leitor.nextLine());

        int apoio = 0;
        if (num_2 > num_1) {
            apoio = num_1;
            num_1 = num_2;
            num_2 = apoio;
        }
        int valor = 0;
        for (int i = 0; i < num_2; i++) {
            valor += num_1;
        }
        System.out.printf("Resultado %d", valor);
        leitor.close();
    }
}
/*64) Faça um algoritmo que calcule a multiplicação de dois números inteiros sem utilizar o operador “*”. Em vez disso,
utilize apenas o operador de adição “+”. Para implementar esse algoritmo, devemos lembrar que qualquer multiplicação
pode ser expressa por meio de somas. Por exemplo, o resultado da expressão 6 * 3 é o mesmo que 6 + 6 + 6 
ou 3 + 3 + 3 + 3 + 3 + 3. Ou seja, soma-se um elemento com ele próprio o número de vezes do segundo elemento.*/