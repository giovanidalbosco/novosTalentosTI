import java.util.Scanner;

public class Lista2_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        float peso = leitor.nextFloat();

        float gramas = peso * 1000f;

        System.out.printf("Seu peso em gramas é %.0f g", gramas);

        leitor.close();
    }
}