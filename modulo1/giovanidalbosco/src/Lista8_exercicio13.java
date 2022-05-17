import java.util.Scanner;

public class Lista8_exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = Integer.parseInt(leitor.nextLine());
        System.out.println("Tabuada de " + num + ":");
        
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = i * num;
            System.out.printf("%d x %d = %d\n", i, num, resultado);
        }
        leitor.close();
    }
}
/*67) Faça um programa que apresente os resultados de uma tabuada de um número qualquer, a qual deve ser impressa no 
seguinte formato:
Considerando como exemplo o fornecimento do número 2 para o número qualquer, ter-se-ia a seguinte situação:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
...
2 x 10 = 20  */