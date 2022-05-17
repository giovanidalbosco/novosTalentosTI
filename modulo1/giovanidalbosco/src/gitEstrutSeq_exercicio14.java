import java.util.Scanner;
import java.lang.Math;

public class gitEstrutSeq_exercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a área em m² que será pintada: ");
        float area = leitor.nextFloat();

        //cobertura = 1/3 L/m³

        double qtdeLatas = Math.ceil((area * 1/3) / 18);
        
        int valor = (int)qtdeLatas * 80;

        System.out.println(String.format("A quantidade de latas necessárias é: %2f", qtdeLatas));
        System.out.printf("O valor total a ser pago é: %d", valor);

        leitor.close();
    }
}