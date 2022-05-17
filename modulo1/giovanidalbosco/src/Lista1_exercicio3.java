import java.util.Scanner;

public class Lista1_exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Distância percorrida pelo funcionário em km: ");
        float distancia = leitor.nextFloat();

        float litros = distancia / 13;

        float totalGasto = litros * 2.2f;

        System.out.println(String.format("Total a ser reembolsado ao funcionário: R$ %.2f", totalGasto));

        leitor.close();
    }
}