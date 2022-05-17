import java.util.Scanner;

public class gitEstrutDes_exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do emprestimo:");
        float valorEmprestimo = leitor.nextFloat();
        System.out.println("Número de parcelas:");
        int numParcelas = leitor.nextInt();
        System.out.println("Valor do salário:");
        float valorSalario = leitor.nextFloat();
        
        boolean aprovacao = (valorEmprestimo / numParcelas) <= (0.3f * valorSalario); 

        if(aprovacao == true) {
            System.out.printf("Valor do empréstimo de R$ %.2f em %dX, APROVADO!\n", valorEmprestimo, numParcelas);
        } else {
            System.out.printf("Valor do empréstimo de R$ %.2f em %dX, REPROVADO!", valorEmprestimo, numParcelas);
        }
        leitor.close();
    }
}
