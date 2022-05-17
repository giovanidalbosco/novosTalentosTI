import java.util.Scanner;
import java.util.Arrays;

public class Lista10_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }

        int listaInversa[] = new int[10];
        for (int i = 9; i >= 0; i--) {
            listaInversa[i] = lista[9 - i];
        }

        System.out.print(String.format("A lista invertida é: %s", Arrays.toString(listaInversa)));

        leitor.close();
    }
}
/*78) Faça um programa que receba dez números e armazene em uma lista. Em seguida copie todos os números da primeira 
lista para uma segunda lista, mas na ordem invertida da primeira lista. */