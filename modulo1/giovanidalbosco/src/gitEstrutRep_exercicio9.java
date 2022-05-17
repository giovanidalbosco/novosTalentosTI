public class gitEstrutRep_exercicio9 {
    public static void main(String[] args) {
        float resultado = 0;
        int repeticao = 37;
        float aux1 = repeticao + 2;
        float aux2 = repeticao + 1;
        float total = 0;
        System.out.println("Resultados:");
        for (int x = 1; x <= repeticao; x++) {
            aux1 -= 1;
            aux2 -= 1;
            resultado = (aux1 * aux2) / x;
            System.out.printf("%.0f x %.0f ÷ %d = %.2f\n", aux2, aux1, x, resultado);
            total = total + resultado;
        }
        System.out.printf("Total da soma é %.2f", total);
    }
}
/*Faça um programa para calcular e escrever a seguinte soma:

37 × 38 ÷ 1 + 36 × 37 ÷ 2 + 35 × 36 ÷ 3 + ... + 1 × 2 ÷ 37*/