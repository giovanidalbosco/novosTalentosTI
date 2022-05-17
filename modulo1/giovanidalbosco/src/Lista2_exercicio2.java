import java.util.Scanner;

public class Lista2_exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite o preço do produto:");
        Scanner leitor = new Scanner(System.in);
        float price = leitor.nextFloat();

        float disc = price * 0.1f;

        float priceDisc = price -  disc;

        System.out.println("Preço real é R$ " + price);
        System.out.println("Preço com desconto é R$" + priceDisc);

        leitor.close();
    }
}