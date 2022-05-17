import java.util.Scanner;

public class gitEstrutSeq_exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite em cm o comprimento da caixa retangular: ");
        float comprimento = leitor.nextFloat();
        System.out.print("Digite em cm a altura da caixa retangular: ");
        float altura = leitor.nextFloat();
        System.out.print("Digite em cm a largura da caixa retangular: ");
        float largura = leitor.nextFloat();

        float volume = comprimento * altura * largura;

        System.out.printf("O volume da caixa retangular é %.1f cm³", volume);

        leitor.close();
    }
}