import java.util.Scanner;

public class gitEstrutRep_exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 1;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        float media = 0;
        int contador = 0;
        int numPares = 0;
        int numImpares = 0;
        while (num!=0) {
            System.out.print("Digite um número: ");
            num = Integer.parseInt(leitor.nextLine());
            soma = soma + num;
            media = (float)soma / (float)contador;
            if (num == 0) {
                break;
            }
            if (num > maior || maior == 0) {
                maior = num;
            }
            if (num < menor || menor == 0) {
                menor = num;
            }
            if (num % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
            contador++; //operador de incremento pós fixado
        }
        System.out.printf("\nO maior número é o %d\nO menor número é o %d\nA soma deles é %d\nA média deles é %.2f\nA quantidade de números pares é de %d\nA quantidade de números impares é de %d", maior, menor, soma, media, numPares, numImpares);
        leitor.close();
    }
}
/*Faça um programa que peça para o usuário ir informando números até que ele informe 0 (zero). Após isto apresente 
os seguintes dados sobre os números digitados:

O maior número;
O menor número;
A soma dos números;
A média deles;
A quantidade de números pares;
A quantidade de números ímpares.  */