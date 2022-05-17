import java.util.Scanner;

public class Lista8_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int num = 0;
        while (num >= 0) {
            System.out.println("Digite um número");
            num = Integer.parseInt(leitor.nextLine());
            soma = soma + num;
            cont++;
        }
        float media = (float)soma / (float)cont;
        System.out.printf("A soma dos números é %d, a média é %.1f e foram digitados %d valores", soma, media, cont);
        leitor.close();
    }
}
/*61) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do 
somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário 
estiver fornecedor valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/