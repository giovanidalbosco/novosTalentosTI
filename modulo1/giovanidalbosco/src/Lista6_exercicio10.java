import java.util.Scanner;

public class Lista6_exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do aluguel:");
        float aluguel = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do condomínio:");
        float condominio = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o consumo de gás em m³:");
        int consumoGas = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o consumo de água em litros:");
        int consumoAgua = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o dia de vencimento das contas:");
        int diaVencimento = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o dia que foi pago as contas:");
        int diaPagamento = Integer.parseInt(leitor.nextLine());

        float gas = consumoGas * 1.8f;
        float agua = (consumoAgua / 1000f) * 0.6f;
        
        if (diaPagamento <= diaVencimento - 5) {
            aluguel -= aluguel * 0.05f;
            System.out.print("Pagamento isento");
        }
        
        System.out.printf("aluguel R$ %.2f\n", aluguel);
        System.out.printf("condomínio R$ %.2f\n", condominio);
        System.out.printf("gás R$ %.2f\n", gas);
        System.out.printf("água R$ %.2f\n", agua);
        float total = aluguel + condominio + gas + agua;
        System.out.printf("Total pago no mês R$ %.2f", total);

        leitor.close();
    }
}
/*48)Escreva o algoritmo em FLUXOGRAMA que calcule o valor total de aluguel e taxas a serem cobrados de um morador. 
Solicite o valor do aluguel, o valor do condomínio, considere que o valor do metro cubico do gas é de R$ 1,80 e o 
valor da taxa de consumo de agua é de R$ 0,60 por metro cubico de agua consumida. Apresente também o valor de 5% 
do valor total do aluguel que pode ser dado como desconto caso seja pago 5 dias antes do vencimento.*/