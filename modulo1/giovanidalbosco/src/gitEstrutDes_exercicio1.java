import java.util.Scanner;

public class gitEstrutDes_exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = leitor.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else {
            System.out.println("O segundo número é maior que o primeiro!");
        }
        leitor.close();
    }
}
