import java.util.Scanner;

public class gitEstrutRep_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = Integer.parseInt(leitor.nextLine());
        int valor = 0;
        for(int a = 1; a <= num; a++) {
            System.out.printf("Tabuada de %d:\n", a);
            for(int b = 1; b <= 10; b++) {
                valor = b * a;
                System.out.printf("%d x %d = %d\n", a, b, valor);
            }
        }
        leitor.close();
    }
}
/*Construa um programa que exiba a tabuada de 1 até N, onde N é informado pelo usuário. ex: Até a tabuada de 3, irá 
imprimir as tabuadas de 1, 2 e 3.*/