import java.util.Scanner;

public class gitEstrutRep_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor depositado na poupança:");
        float valorPoup = Float.parseFloat(leitor.nextLine());
        System.out.println("Número de mesês rendendo:");
        int meses = Integer.parseInt(leitor.nextLine());
        for(int a = 1; a <= meses; a++) {
            valorPoup += valorPoup * .005f;
        }
        System.out.printf("Valor acumulado após %d meses na poupança: R$ %.2f ", meses, valorPoup);
        leitor.close();
    }
}
/*Faça um programa que receba um valor que foi depositado na poupança e exiba o valor com rendimento mês a mês 
durante o período de um ano. Considere fixo o juros da poupança em 0,5% a. m.*/