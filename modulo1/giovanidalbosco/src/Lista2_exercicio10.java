import java.util.Scanner;

public class Lista2_exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salário de João:");
        float salJoao = leitor.nextFloat();
        System.out.println("Digite o valor da primeira conta:");
        float primConta = leitor.nextFloat();
        System.out.println("Digite o valor da segunda conta:");
        float seguConta = leitor.nextFloat();

        float resto = salJoao - (primConta + seguConta) * 1.02f;

        System.out.printf("Sobrou para João o valor de R$ %.2f", resto);

        leitor.close();
    }
}