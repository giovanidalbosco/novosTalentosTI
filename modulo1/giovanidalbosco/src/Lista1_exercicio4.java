import java.util.Scanner;

public class Lista1_exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar quantidade de fotos para revelação: ");
        int numFotos = leitor.nextInt();

        float valorTotal = numFotos * 0.9f;
        
        System.out.println(String.format("Valor total a ser pago: R$ %.2f", valorTotal));

        leitor.close();
    }
}
