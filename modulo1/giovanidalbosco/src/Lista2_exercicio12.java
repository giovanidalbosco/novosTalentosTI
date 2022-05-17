import java.util.Scanner;

public class Lista2_exercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a largura do cômodo em metros: ");
        float largura = leitor.nextFloat();
        System.out.print("Digite o comprimento do cômodo em metros: ");
        float comprimento = leitor.nextFloat();

        float areaComodo = largura * comprimento;
        float potNesse = areaComodo * 18f;

        System.out.printf("A área total do cômodo é de %.2f m²\n", areaComodo);
        System.out.printf("A potência total necessária é de %.2f watts\n", potNesse);

        leitor.close();
    }
}