import java.util.Scanner;

public class ExemploEstruturaDeDados2 {
    public static void main(String[] args) {
        //int numero[] = new int[10];
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(numeros[0]);
        
        char nome[] = {'u','n','i','v','i','l','l','e'};

        for (char umaLetra : nome) {
            System.out.println(umaLetra);
        }

        String nome2 = "univille";
        System.out.println(nome2.hashCode());
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
        // string são imutaveis
        nome2 = "UNIVILLE"; // string pool
        System.out.println(nome2.hashCode());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE: ");
        String entrada = leitor.nextLine();

        //.equalsIgnoreCase()
        if (nome2.equals(entrada)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
        leitor.close();
    }
}