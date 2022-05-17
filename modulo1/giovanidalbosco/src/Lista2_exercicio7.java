import java.util.Scanner;
import java.lang.Math;

public class Lista2_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        double lado = leitor.nextInt();

        double area = Math.pow(lado , 2);

        System.out.println("A área do trapézio é " + area);

        leitor.close();
    }
}