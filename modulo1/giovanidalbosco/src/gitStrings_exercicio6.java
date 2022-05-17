import java.util.Scanner;

public class gitStrings_exercicio6 {
    public static void main(String[] args) {
        //incompleto
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        String alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","w"};
        String leet[] = {"4","8","(", "[)","3", "|=","9","|-|","1","_|","X","|_","|\\/|","|V","0","|*","(_,)","2","5","7","(_)","\\/","><","7","2","\\/\\/"};
        
        String fraseLeet = "";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < leet.length; j++) {
                if (frase.charAt(i) == alphabet[j].charAt(0)) {
                    fraseLeet += String.valueOf(leet[j]);
                }
            }
        }
            System.out.println(fraseLeet);
            leitor.close();
    }
}
/*6. Leet é uma forma de se escrever o alfabeto latino usando outros símbolos em lugar das letras, como números por
exemplo. A própria palavra leet admite muitas variações, como l33t ou 1337. O uso do leet reflete uma subcultura
relacionada ao mundo dos jogos de computador e internet, sendo muito usada para confundir os iniciantes e afirmar-se
como parte de um grupo. Pesquise sobre as principais formas de traduzir as letras. Depois, faça um programa que peça
uma texto e transforme-o para a grafia leet speak.             */