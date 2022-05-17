import java.util.Scanner;

public class gitEstrutSeq_exercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tempo de viagem em horas: ");
        float horas = leitor.nextFloat();
        System.out.print("Digite a velocidade média de viagem em km/h: ");
        int velocidade = leitor.nextInt();
        
        float distancia = horas * velocidade;

        float litros = distancia / 12f;

        System.out.printf("O tempo de viagem foi de %.1f horas\n", horas);
        System.out.printf("A velocidade média foi de %d km/h\n", velocidade);
        System.out.printf("A distância percorrida foi de %.1f km\n", distancia);
        System.out.printf("A quantidade gasta de gasolina foi de %.1f litros", litros);

        leitor.close();
    }
}