import java.util.Scanner;

public class gitStrings_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        String num = leitor.nextLine();

        String frase = "";
        for (int i = 0; i < num.length(); i++){
            switch (num.charAt(i)) {
                case '1':
                    frase += "um";
                    break;
                case '2':
                    frase += "dois";
                    break;
                case '3':
                    frase += "três";
                    break;
                case '4':
                    frase += "quatro";
                    break;
                case '5':
                    frase += "cinco";
                    break;
                case '6':
                    frase += "seis";
                    break;
                case '7':
                    frase += "sete";
                    break;
                case '8':
                    frase += "oito";
                    break;
                case '9':
                    frase += "nove";
                    break;
            }
            if (i < num.length() - 1) {
                frase += ", ";
            }
        }
        System.out.println(frase);
        leitor.close();
    }
}
/*5. Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável inteira), 
imprima cada um dos seus dígitos por extenso. 

Exemplo:

 Entre o número: 4571
 Resultado: quatro, cinco, sete, um             */