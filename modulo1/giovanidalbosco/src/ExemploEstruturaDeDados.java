import java.util.Arrays;
import java.util.Scanner;

public class ExemploEstruturaDeDados {
    public static void main(String[] args) {
        //String[] listaNomes = new String[10];
        String listaNomes[] = new String[10];
        listaNomes[0] = "Zezinho";
        listaNomes[1] = "Mariazinha";

        System.out.println(listaNomes[0]);
        //listaNomes[0] = null;
        System.out.println(listaNomes[9]);

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i<listaNomes.length; i++) {
            System.out.println("Digite um nome: ");
            listaNomes[i] = leitor.nextLine();
        }

        for (int i = 0; i<10; i++) {
            System.out.println(listaNomes[i]);
        }

        System.out.println(Arrays.toString(listaNomes));
        leitor.close();
    }
}
