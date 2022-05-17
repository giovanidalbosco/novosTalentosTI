import java.util.Scanner;

public class Lista6_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos minutos durou a ligação:");
        int callLengh = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o código correspondente a origem da chamada:\n1 - Local\n2 - Intermunicipal\n3 - Interestadual");
        int callCode = Integer.parseInt(leitor.nextLine());

        float callCost = 0;
        switch (callCode) {
            case 1:
                callCost = callLengh * 0.02f;
                System.out.printf("O custo da ligação foi de R$ %.2f", callCost);
                break;
            case 2:
                callCost = callLengh * 0.08f;
                System.out.printf("O custo da ligação foi de R$ %.2f", callCost);
                break;
            case 3:
                callCost = callLengh * 0.1f;
                System.out.printf("O custo da ligação foi de R$ %.2f", callCost);
                break;
            default:
            System.out.print("Código de chamada inválido");
        }
        leitor.close();
    }
}
/*44)Escreva um algoritmo que calcule o valor de uma chamada de telefone. Deverá ser informado a quantidade de 
minutos falados durante a ligação além de sua origem. Considere que uma ligação “local” custa R$0.020, ligação 
“intermunicipal” R$0,08 e “interestadual” R$0,1.*/