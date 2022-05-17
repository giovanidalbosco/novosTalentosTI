import java.util.Scanner;

public class Lista6_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de páginas do livro:");
        int pagsLivro = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite em quantos dias você quer ler o livro:");
        int dias = Integer.parseInt(leitor.nextLine());

        int pagsLida = pagsLivro / dias;

        if (pagsLida > 100) {
            System.out.print("Não é possível realizar esta leitura");
        } else {
            System.out.print(String.format("O número de páginas lidas por dia deve ser de aproximadamente %d", pagsLida));
        }
        leitor.close();
    }
}
/*41)Escreva um algoritmo que calcule o número de páginas mínimo que um leitor deve ler para terminar um livro em um 
determinado numero de dias informado. Caso o número de paginas a ler por dia for maior que 100, informe ao usuário 
que é impossível de realizar a leitura, caso contrário apresente o número de paginas.*/