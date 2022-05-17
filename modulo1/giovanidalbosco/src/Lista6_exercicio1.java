import java.util.Scanner;

public class Lista6_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro número:");
        int num2 = Integer.parseInt(leitor.nextLine());

        if(num1 == num2) {
            System.out.println(String.format("Os números são iguais, sua média é %d", num1));
        } else {
            if(num1 > num2) {
                System.out.print("O primeiro número é maior que o segundo");
            } else {
                System.out.print("O segundo número é maior que o primeiro");
            }
        }
        leitor.close();
    }
}
/*39)Escreva o algoritmo de um programa que solicite dois números quaisquer ao usuário, se os números forem iguais 
mostre uma mensagem e mostre a media dos dois, caso contrário mostre qual o maior número e qual o menor número. */