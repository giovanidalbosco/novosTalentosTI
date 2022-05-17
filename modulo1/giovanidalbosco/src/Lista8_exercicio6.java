import java.util.Scanner;

public class Lista8_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        System.out.println("Digite 10 números de 1 a 100");
        do {
            int num = Integer.parseInt(leitor.nextLine());
            if (num >= 1 && num <= 100) {
                soma = soma + num;
                cont++;
            } else {
                System.out.print("Você digitou um número fora do intervalo de 1 a 100. Digite outro número: ");
            }
        } while (cont < 10);
        float media = (float)soma / (float)cont;
        System.out.printf("A soma dos números é %d e média é %.1f", soma, media);
        leitor.close();
    }
}
/*60) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a
média do total.*/