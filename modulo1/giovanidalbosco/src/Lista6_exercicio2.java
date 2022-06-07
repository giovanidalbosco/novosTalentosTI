/* Escreva um algoritmo que solicite a quantidade total em
miligramas de colesterol mau existente no sangue de um paciente.
Considerando que o valor máximo ideal para uma pessoa saudável é
130mg, caso a quantidade esteja menor apresente uma mensagem
indicando que esta menor. Caso esteja acima, calcule o percentual
que esta acima e apresente uma mensagem.*/

import java.util.Scanner;

public class Lista6_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o colesterol do paciente em mg:");
        int colesterol = Integer.parseInt(leitor.nextLine());

        float percentual;
        if(colesterol <= 130) {
            System.out.print("O colesterol está dentro da normalidade de 130mg");
        } else {
            percentual = (colesterol - 130) / 1.3f;
            System.out.println(String.format("O colesterol está acima da normalidade de 130mg em %.1f%%", percentual));
        }
        leitor.close();
    }
}
