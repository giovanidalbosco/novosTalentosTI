import java.util.Scanner;
import java.lang.Math;

public class gitEstrutSeq_exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNum = leitor.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNum = leitor.nextInt();
        
        double resultado = Math.pow(primeiroNum, segundoNum);

        System.out.printf("O resultado da conta número 1 elevado ao número 2 é %2f", resultado);

        leitor.close();
    }
}