import java.util.Scanner;

public class Lista2_exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o lado menor do losango:");
        float ladoMenor = leitor.nextFloat();
        System.out.println("Digite o lado maior do losango:");
        float ladoMaior = leitor.nextFloat();

        float area = (ladoMaior * ladoMenor) / 2f;

        System.out.println("A área do losango é " + area);

        leitor.close();
    }
}