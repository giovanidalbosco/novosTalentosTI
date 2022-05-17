import java.util.Scanner;

public class gitEstrutDes_exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite em kg a quantidade de morangos comprados:");
        float qdeMorangos = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite em kg a quantidade de maças compradas:");
        float qdeMacas = Float.parseFloat(leitor.nextLine());

        float totalPagarMorangos = 0;
        if(qdeMorangos > 5) {
            totalPagarMorangos = qdeMorangos * 2.2f; 
        } else {
            totalPagarMorangos = qdeMorangos * 2.5f;
        }
        float totalPagarMacas = 0;
        if(qdeMacas > 5) {
            totalPagarMacas = qdeMacas * 1.5f;
        } else {
            totalPagarMacas = qdeMacas * 1.8f;

        }

        float totalPagar = totalPagarMorangos + totalPagarMacas;
        float qdeTotal = qdeMorangos + qdeMacas;

        if(totalPagar > 25 || qdeTotal > 8f){
            totalPagar -= totalPagar * 0.1f;
        }
        System.out.printf("O cliente comprou um total de %.1f kg de frutas e o valor total a ser pago é de R$ %.2f", qdeTotal, totalPagar);
        leitor.close();
    }
}
/*
Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o cliente comprar mais de 8 Kg em frutas ou 
o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um 
algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor 
a ser pago pelo cliente.

        Até 5Kg	    / Acima de 5kg
Morango	R$2,50 / kg / R$2,20 / kg
Maçã	R$1,80 / kg / R$1,50 / kg
*/