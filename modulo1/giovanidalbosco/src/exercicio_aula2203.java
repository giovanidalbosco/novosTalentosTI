import java.util.Scanner;

public class exercicio_aula2203 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa:");
        int idade = leitor.nextInt();

        if(idade <= 20) {
            System.out.println("A pessoa é jovem");
        } else if(idade > 20 && idade <= 60) {
            System.out.println("A pessoa é adulta");
        } else {
            System.out.println("A pessoa é idosa");
        }
        leitor.close();
    }
}
