import java.util.Scanner;

public class gitEstrutSeq_exercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número de anos: ");
        int anos = leitor.nextInt();
        System.out.print("Digite o número de meses: ");
        int meses = leitor.nextInt();
        System.out.print("Digite o número de dias: ");
        int dias = leitor.nextInt();

        int total = (anos * 365) + (meses * 30) + dias;
        
        System.out.printf("A pessoa viveu %d dias", total);

        leitor.close();
    }
}