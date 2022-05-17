import java.util.Scanner;

public class gitEstrutDes_exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = leitor.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num3 = leitor.nextInt();

        int aux;

        if(num3 < num2) {
            aux = num3;
            num3 = num2;
            num2 = aux;
        }

        if(num2 < num1) {
            aux = num2;
            num2 = num1;
            num1 = aux;
        }

        if(num3 < num2) {
            aux = num3;
            num3 = num2;
            num2 = aux;
        }

        System.out.printf("%d, %d, %d", num1, num2, num3);
        leitor.close();
    }
}