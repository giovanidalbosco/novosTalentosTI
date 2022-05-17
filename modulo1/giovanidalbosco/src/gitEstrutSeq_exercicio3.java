import java.util.Scanner;

public class gitEstrutSeq_exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência em m: ");
        float raioCirculo = leitor.nextFloat();

        float areaCirculo = raioCirculo * raioCirculo * 3.14159f;

        System.out.printf("A área da circunferência é: %.1f m²", areaCirculo);

        leitor.close();
    }
}