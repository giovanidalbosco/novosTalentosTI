import java.util.Scanner;

public class gitStrings_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os algarismos ABCDE (algarismo de cinco números) para gerar o digito verificador: ");
        String ABCDE = leitor.nextLine();

        int codigo[] = new int[ABCDE.length()];

        int S = 0;
        for (int i = ABCDE.length() - 1; i >= 0; i--) {
            codigo[i] = Integer.parseInt(String.valueOf(ABCDE.charAt(i)));
            System.out.println(codigo[i]);
            S += codigo[i] * (ABCDE.length() + 1 - i); 
        }
        System.out.println(S);
        leitor.close();
    }
}
/*4. Leia um código de cinco algarismos (variável Codigo) e gere o digito verificador (DigitoV) módulo 7 para o mesmo.
Supondo que os cinco algarismos do código são ABCDE, uma forma de calcular o dígito desejado, com módulo 7 é:

DigitoV = resto da divisão de S por 7 (DigitoV = S % 7), onde S = 6 * A + 5 * B + 4 * C + 3 * D + 2 * E              */