import java.util.Scanner;

public class gitEstrutSeq_exercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        float tempCelsius = leitor.nextFloat();

        float tempFahrenheit = (9f * tempCelsius + 160f) / 5f;

        System.out.printf("A temperatura em Fahrenheit é %.1f°F", tempFahrenheit);

        leitor.close();
    }
}