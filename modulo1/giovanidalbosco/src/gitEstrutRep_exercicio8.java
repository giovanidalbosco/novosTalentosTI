import java.lang.Math;

public class gitEstrutRep_exercicio8 {
    public static void main(String[] args) {
        float resultado = 0;
        float aux = 0;
        double total = 0;
        System.out.println("Resultados:");
        for (int x = 1; x <= 50; x++) {
            aux = 1000 - ((x-1)*3);
            resultado = aux / x;
            System.out.printf("%.0f ÷ %d = %.2f\n", aux, x, resultado);
            total = total + (Math.pow(-1, x + 1) * resultado);
        }
        System.out.printf("Total da soma é %.2f", total);
    }
}
/*Faça um programa que calcule o resultado dos 50 primeiros números da sequinte sequência:

1000 ÷ 1 - 997 ÷ 2 + 994 ÷ 3 - 991 ÷ 4 + ...*/