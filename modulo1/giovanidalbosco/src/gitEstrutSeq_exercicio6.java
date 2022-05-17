import java.util.Scanner;

public class gitEstrutSeq_exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNum = leitor.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNum = leitor.nextInt();

        int resultado = primeiroNum + segundoNum;

        System.out.print("O resultado é: " + resultado);

        leitor.close();
    }
}