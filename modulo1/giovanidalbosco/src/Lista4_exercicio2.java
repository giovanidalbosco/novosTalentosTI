import java.util.Scanner;

public class Lista4_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numInteiro = leitor.nextInt();
        
        int resto = numInteiro % 2;

        if(resto == 0) {
            System.out.println("Número par");
        }
        else {
            System.out.println("Número impar");
        }
    leitor.close();
    }
}
