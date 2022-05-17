import java.util.Scanner;

public class Lista1_exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de pessoas convidadas: ");
        int pessoas = leitor.nextInt();

        float totalCarne = pessoas * 0.250f;

        System.out.println(String.format("Quantidade total de carne necessária: %.2f Kg", totalCarne));
        //System.out.printf("Quantidade total de carne necessária: %.2f Kg", totalCarne);

        leitor.close();
    }
}