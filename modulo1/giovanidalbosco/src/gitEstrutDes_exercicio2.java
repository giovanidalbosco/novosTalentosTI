import java.util.Scanner;

public class gitEstrutDes_exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = leitor.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num3 = leitor.nextInt();

        if (num1 == num2) {
            if(num1 == num3) {
                System.out.println("Os três números são iguais");
            }
            if(num1 > num3) {
                System.out.println("Os dois primeiros números são maiores");
            }
            if(num1 < num3) {
                System.out.println("O terceiro número é o maior!");
            }
        }
        if (num1 > num2) {
            if(num1 > num3) {
                System.out.println("O primeiro número é o maior!");
            }
            if(num1 < num3) {
                System.out.println("O terceiro número é o maior!");
            }
            if(num1 == num3){
                System.out.println("O primeiro e o terceiro números são maiores");
            }
        }
        if (num2 > num1) {
            if(num2 > num3) {
                System.out.println("O segundo número é o maior!");
            }
            if(num2 < num3) {
                System.out.println("O terceiro número é o maior!");
            }
            if(num2 == num3){
                System.out.println("O segundo = e o terceiro números são maiores");
            }
        }
        leitor.close();
    }
}