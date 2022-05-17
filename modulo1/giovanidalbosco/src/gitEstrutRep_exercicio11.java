import java.util.Scanner;

public class gitEstrutRep_exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade em gramas do material radiotivo:");
        float peso = Float.parseFloat(leitor.nextLine());

        for(int x = 1;; x++) { //seria errado fazer isto?
            peso /= 2; 
            if(peso < 0.05) {
                System.out.println(x);
                System.out.printf("O tempo necessário para que a massa fique menor que 0,05g é de %d segundos", x * 50); //é muito errado isto? economizaria uma variável
                break;
            }
        }
        leitor.close();
    }
}
/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, 
faça um programa que determine o tempo necessário para que essa massa se torne menor que 0,05 gramas.*/