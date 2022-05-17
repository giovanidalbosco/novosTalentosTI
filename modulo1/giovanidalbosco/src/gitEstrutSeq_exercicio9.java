import java.util.Scanner;

public class gitEstrutSeq_exercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a distância total em km percorrida na viagem: ");
        float distTotal = leitor.nextFloat();
        System.out.print("Digite o total de combustivel em litros gasto na viagem: ");
        float gasTotal = leitor.nextFloat();

        float consMedio = distTotal / gasTotal ;

        System.out.printf("O consumo médio do veículo foi de %.1f km/L", consMedio);

        leitor.close();
    }
}