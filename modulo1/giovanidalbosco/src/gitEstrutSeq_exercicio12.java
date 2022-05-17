import java.util.Scanner;
import java.lang.Math;

public class gitEstrutSeq_exercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a potência da lâmpada: ");
        int potLampada = leitor.nextInt();
        System.out.print("Digite a largura do cômodo: ");
        float largura = leitor.nextFloat();
        System.out.print("Digite o comprimento do cômodo: ");
        float comprimento = leitor.nextFloat();

        float areaComodo = largura * comprimento;
        double qntdLampada = Math.ceil(areaComodo * 18f / potLampada);

        //como faço para arredondar sempre para cima?
        System.out.printf("A quantidade total de lampadas é de: %2f", qntdLampada);

        leitor.close();
    }
}