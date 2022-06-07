/* Elaborar um programa que apresente os valores de conversão de
graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a
contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
O programa deverá apresentar os valores das duas temperaturas. */

public class Lista8_exercicio5 {
    public static void main(String[] args) {
        float fahrenheit = 0;
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            fahrenheit = (180f/100f * celsius) + 32f;
            System.out.printf("%d°C é igual a %.0f°F\n", celsius, fahrenheit);
        }
    }
}
