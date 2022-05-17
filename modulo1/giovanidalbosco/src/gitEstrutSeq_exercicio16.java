import java.util.Scanner;

public class gitEstrutSeq_exercicio16 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        float A = leitor.nextFloat();
        System.out.print("Digite o valor de B: ");
        float B = leitor.nextFloat();
        System.out.print("Digite o valor de C: ");
        float C = leitor.nextFloat();
        System.out.print("Digite o valor de D: ");
        float D = leitor.nextFloat();

        float AB = A + B;
        float AB1 = A * B;
        float AC = A + C;
        float AC1 = A * C;
        float AD = A + D;
        float AD1 = A * D;
        float BC = B + C;
        float BC1 = B * C;
        float BD = B + D;
        float BD1 = B * D;
        float CD = C + D;
        float CD1 = C * D;

        System.out.printf("A+B: %f\n", AB);
        System.out.printf("A+C: %f\n", AC);
        System.out.printf("A+D: %f\n", AD);
        System.out.printf("B+C: %f\n", BC);
        System.out.printf("B+D: %f\n", BD);
        System.out.printf("C+D: %f\n", CD);
        System.out.printf("A*B: %f\n", AB1);
        System.out.printf("A*C: %f\n", AC1);
        System.out.printf("A*D: %f\n", AD1);
        System.out.printf("B*C: %f\n", BC1);
        System.out.printf("B*D: %f\n", BD1);
        System.out.printf("C*D: %f", CD1);

        leitor.close();
    }
}