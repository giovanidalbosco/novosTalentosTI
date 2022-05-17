import java.util.Scanner;

public class Lista11_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String mesesAno[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        int temperatura[] = new int[mesesAno.length];
        int maiorTemperatura = 0;
        int menorTemperatura = 0;
        int position1 = 0;
        int position2 = 0;
        for (int i = 0; i < mesesAno.length; i++) {
            System.out.printf("Digite a temperatura média do mes de %s: ", mesesAno[i]);
            temperatura[i] = Integer.parseInt(leitor.nextLine());
            if (maiorTemperatura == 0 || temperatura[i] > maiorTemperatura) {
                maiorTemperatura = temperatura[i];
                position1 = i;
            }
            if (menorTemperatura == 0 || temperatura[i] < menorTemperatura) {
                menorTemperatura = temperatura[i];
                position2 = i;
            }
        }
        System.out.println(String.format("A maior temperatura foi de %d°C e occoreu no mes de %s.", maiorTemperatura, mesesAno[position1]));
        System.out.printf("A menor temperatura foi de %d°C e occoreu no mes de %s.", menorTemperatura, mesesAno[position2]);
        leitor.close();
    }
}
/*83) Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um vetor. Calcule e mostre 
a maior e a menor temperatura do ano e em que mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 
2 – Fevereiro). Desconsidere empates. */