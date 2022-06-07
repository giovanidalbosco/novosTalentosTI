/* Escreva um algoritmo que calcule o valor de desconto que será
oferecido ao comprador de uma loja de acordo com o valor da
compra: compras até R$100 desconto de 5%, compras maiores que
R$ 100 e ate R$400 desconto de 10%, e acima de R$ 400 desconto de
13%. Após o calculo do valor com desconto, acrescente o valor da
taxa de entrega que é de R$ 1,5 por item comprado. */

import java.util.Scanner;

public class Lista6_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos itens foram comprados:");
        float itensQtd = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor total da compra:");
        int totalValue = Integer.parseInt(leitor.nextLine());

        float discount = 0;
        if (totalValue <= 100f) {
            discount = totalValue * 0.05f;
        } else if (totalValue <= 400f) {
            discount = totalValue * 0.1f;
        } else {
            discount = totalValue * 0.13f;
        }

        float totalPaid = totalValue - discount + 1.5f * itensQtd;

        System.out.printf("O desconto será de %.2f e o total pago é de %.2f", discount, totalPaid);

        leitor.close();
    }
}
