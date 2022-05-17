import java.util.Scanner;
import java.lang.Math;

public class gitStrings_exercicio3_copy {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavras[] = new String[3];
        palavras[0] = "cachorro";
        palavras[1] = "gato";
        palavras[2] = "elefante";

        double sorteio = 0;
        do {
            sorteio = Math.round(Math.random() * 3d);
        } while (sorteio == 0);

        String palavraSorteada = palavras[(int)sorteio-1];

        String palavraEmbaralhada = "";
        if (sorteio == 1) {
            palavraEmbaralhada = "orcrohac";
        } else if (sorteio == 2) {
            palavraEmbaralhada = "ogta";
        } else if (sorteio == 3) {
            palavraEmbaralhada = "lefenaet";
        }

        System.out.printf("Você tem 6 tentativas para adivinhar a palavra que contem as letras: %s\n", palavraEmbaralhada);
        String palavraDigitada = leitor.nextLine();
        int tentativas = 0;
        while (tentativas < 5) { 
            if (palavraDigitada.equals(palavraSorteada)) {
                System.out.printf("Você acertou! A palavra é %s", palavraSorteada.toUpperCase());
                break;
            } else {
                System.out.println("Voce errou! Tente novamente: ");
                palavraDigitada = leitor.nextLine();
            }
            tentativas++;
        }
        if (palavraDigitada.equals(palavraSorteada) == false) {
            System.out.printf("O jogo acabou! A palavra certa é %s!", palavraSorteada.toUpperCase());
        }
        leitor.close();
    }
}
/*3. Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com as letras embaralhadas. 
O programa terá uma lista de palavras lidas de um arquivo texto ou de um vetor e será escolhida uma aleatoriamente. 
O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra deve ser mostrada na tela, informando 
se o usuário ganhou ou perdeu o jogo. */