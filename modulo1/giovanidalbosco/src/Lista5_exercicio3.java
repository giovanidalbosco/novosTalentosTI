import java.util.Scanner;

public class Lista5_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos quilos tem o saco de ração:");
        float pesoSaco = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite em gramas a quantidade de ração para o gato 1:");
        int refGato1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite em gramas a quantidade de ração para o gato 2:");
        int refGato2 = Integer.parseInt(leitor.nextLine());

        float resto = pesoSaco * 1000 - 5 * (refGato1 - refGato2);
        resto /= 1000;

        System.out.printf("Após 5 dias ainda resta no saco %.3f kg", resto);
        leitor.close();
    }
}
/*36)Pedro comprou um saco de ração com peso em quilos. Pedro possui dois gatos para os quais fornece a quantidade 
de ração em gramas. Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada 
gato. Calcule e mostre quanto restará de ração no saco após cinco dias.*/