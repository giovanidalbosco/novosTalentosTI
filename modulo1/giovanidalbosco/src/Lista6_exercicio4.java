/*42)Escreva um algoritmo que calcule o valor da multa (em UFIR)
que um motorista deve receber de acordo com a velocidade de seu
carro. Acima de 60km/h e ate 100km/h multa media 60 UFIR, acima
de 100 km/h até 160km/h grave 120 UFIR, e acima de 160km/h
gravíssima 180 UFIR. */

import java.util.Scanner;

public class Lista6_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a velocidade do carro:");
        int velCarro = Integer.parseInt(leitor.nextLine());

        if (velCarro < 60) {
            System.out.println("Velocidade dentro do permitido");
        } else if (velCarro <= 100) {
            System.out.print("Multa média com pagamento de 60 UFIR");
        } else if (velCarro <= 160) {
            System.out.print("Multa grave com pagamento de 120 UFIR");
        } else {
            System.out.print("Multa gravíssima com pagamento de 180 UFIR");
        }
        leitor.close();
    }
}
