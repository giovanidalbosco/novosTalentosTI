import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();

        boolean resto = num % 2 == 0;

        System.out.println("O número é " + (resto?"par":"impar"));

        leitor.close();
    }
}
