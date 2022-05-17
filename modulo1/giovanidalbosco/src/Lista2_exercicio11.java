import java.util.Scanner;

public class Lista2_exercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        float tempCelsius = leitor.nextFloat();

        float tempFahrenheit = (180/100f * tempCelsius) + 32f;

        System.out.printf("A temperatura em Fahrenheit é %.1f°F", tempFahrenheit);

        leitor.close();
    }
}