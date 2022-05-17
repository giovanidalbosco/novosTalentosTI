import java.util.Scanner;

public class gitEstrutDes_exercicio4 {
    public static void main(String[] args) {
        System.out.println("Digite o número de maças compradas:");
        Scanner leitor = new Scanner(System.in);
        int quantMacas = leitor.nextInt();
        float valorUn = 0;
        if(quantMacas >= 12) {
            valorUn = 1;
        } else {
            valorUn = 1.3f;
        }
        float valorTotal = quantMacas * valorUn;
        
        System.out.printf("Foram compradas %d maças no valor total de R$ %.2f", quantMacas, valorTotal);
        leitor.close();
    }
}
