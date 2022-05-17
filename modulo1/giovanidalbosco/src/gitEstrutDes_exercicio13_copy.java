import java.util.Scanner;

public class gitEstrutDes_exercicio13_copy {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos litros:");
        int litros = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o tipo do combustível:");
        String tipo = leitor.nextLine();

        /*
        boolean teste = tipo == "gasolina"; //resultado é 'false'. desta forma ele compara as referências
        boolean teste = tipo.equals("gasolina"); //desta forma o resultado é 'true'
        System.out.println(teste);
        */

        float pagamento = 0;
        if(tipo.equals("gasolina")) {
            if(litros > 20) {
                pagamento = litros * 3.3f * 0.94f;
            } else {
                pagamento = litros * 3.3f * 0.96f;
            }
        } else if(tipo.equals("alcool")) {
            if(litros > 20) {
                pagamento = litros * 3.3f * 0.95f;
            } else {
                pagamento = litros * 3.3f * 0.97f;
            }
        }

        System.out.printf("O combustível escolhido foi %s. Foi comprado %d litros e pago um total de R$ %.2f", tipo, litros, pagamento);

        leitor.close();
    }
}