import java.util.Scanner;

public class Lista8_exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int soma_pares = 0;
        int cont = 0;
        int cont_pares = 0;
        int cont_impares = 0;
        float media = 0;
        int menor = 0;
        int maior = 0;
        float media_pares = 0;
        float perc_impares = 0;
        int num = 0;
        for (;;) {
            System.out.print("Digite um número: ");
            num = Integer.parseInt(leitor.nextLine());
            if (num == 30000) {
                if (cont_pares == 0) {
                    cont_pares = 1;
                    if (cont == 0) {
                        cont = 1;
                    }
                }
                System.out.println("O programa será finalizado");
                media = (float)soma / (float)cont; 
                media_pares = (float)soma_pares / (float)cont_pares;
                perc_impares = (float)cont_impares / (float)cont * 100f;
                System.out.printf("Soma dos números digitados: %d\nQuantidade de números digitados: %d\nMédia dos números digitados: %.2f\nMaior número digitado: %d\nMenor número digitado: %d\nMédia dos números pares digitados: %.2f\nPorcentagem de números ímpares entre todos os números digitados: %.2f", soma, cont, media, maior, menor, media_pares, perc_impares);
                leitor.close();
                break;
            }
            soma = soma + num;
            cont++;
            if (num >= maior || maior == 0) {
                maior = num;
            }
            if (num <= menor || menor == 0) {
                menor = num;
            }
            if (num % 2 == 0) {
                soma_pares = soma_pares + num;
                cont_pares++;
            } else {
                cont_impares++;
            }
        }
        leitor.close(); //fica com aviso porque meu programa não termina aqui?
    }
}
/*63) Faça um programa que receba 'vários números, calcule e mostre:
- a soma dos números digitados;
- a quantidade de números digitados;
- a média dos números digitados; 
- o maior número digitado;
- o menor número digitado;
- a média dos números pares;
- a porcentagem dos números ímpares entre todos os números digitados.
Finalize a entrada de dados com a digitação do número 30000.*/