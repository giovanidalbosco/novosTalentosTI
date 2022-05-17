import java.util.Scanner;

public class gitStrings_exercicio5_copy {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        String num = leitor.nextLine();

        String numeros[]= {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String frase = "";
        for (int i = 0; i < num.length(); i++){
            frase += numeros[Integer.parseInt(String.valueOf(num.charAt(i))) - 1];
            if (i < num.length() - 1) {
                frase += ", ";
            }
        }
        System.out.println(frase);
        leitor.close();
    }
}
/*6. Leet é uma forma de se escrever o alfabeto latino usando outros símbolos em lugar das letras, como números por
exemplo. A própria palavra leet admite muitas variações, como l33t ou 1337. O uso do leet reflete uma subcultura
relacionada ao mundo dos jogos de computador e internet, sendo muito usada para confundir os iniciantes e afirmar-se
como parte de um grupo. Pesquise sobre as principais formas de traduzir as letras. Depois, faça um programa que peça
uma texto e transforme-o para a grafia leet speak.             */