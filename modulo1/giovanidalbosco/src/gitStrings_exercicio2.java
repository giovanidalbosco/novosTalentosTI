import java.util.Scanner;

public class gitStrings_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = leitor.nextLine();
        int cont[] = new int[6];
        for (int i = 0; i <= frase.length() - 1; i++) {
            if (frase.toLowerCase().charAt(i) == ' ') {
                cont[0]++;
            } else if (frase.toLowerCase().charAt(i) == 'a') {
                cont[1]++;
            } else if (frase.toLowerCase().charAt(i) == 'e') {
                cont[2]++;
            } else if (frase.toLowerCase().charAt(i) == 'i') {
                cont[3]++;
            } else if (frase.toLowerCase().charAt(i) == 'o') {
                cont[4]++;
            } else if (frase.toLowerCase().charAt(i) == 'u') {
                cont[5]++;
            }
        }
        System.out.printf("Existem %d espaços em branco\n", cont[0]);
        System.out.printf("A = %d, E = %d, I = %d, O = %d, U = %d", cont[1], cont[2], cont[3], cont[4], cont[5]);
        leitor.close();
    }
}
/*2. Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:

a. quantos espaços em branco existem na frase.
b. quantas vezes aparecem as vogais a, e, i, o, u. */