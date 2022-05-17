import java.util.Scanner;

public class gitEstrutDes_exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos funcionários tem a empresa:");
        int qtdeFuncionarios = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo:");
        float salarioMin = Float.parseFloat(leitor.nextLine());
    
        float novoSal = 0;
        for(int i = 1; i <= qtdeFuncionarios; i++) {
            System.out.println("Digite o nome do funcionário:"); //preciso fazer a inicialização do Scanner dentro da estrutura de repetição?
            String nome = leitor.nextLine();
            System.out.println("Digite quantos salários mínimos este funcionário ganha:");
            int qtdeSalMin = Integer.parseInt(leitor.nextLine());
            if(qtdeSalMin < 3) {
                novoSal = salarioMin * qtdeSalMin * 1.5f;
            } else if(qtdeSalMin >= 3 && qtdeSalMin <=10) {
                novoSal = salarioMin * qtdeSalMin * 1.2f;
            } else if(qtdeSalMin > 10) {
                novoSal = salarioMin * qtdeSalMin * 1.15f;
            } else {
                novoSal = salarioMin * qtdeSalMin * 1.1f;
            }
            System.out.printf("O novo salário de %s será de R$ %.2f\n", nome, novoSal);
        }
        leitor.close();
    }
}
/*Faça um programa para uma empresa que decide dar um reajuste funcionários de acordo com os seguintes critérios:

50% para aqueles que ganham menos do que três salários mínimos;
20% para aqueles que ganham entre três até dez salários mínimos;
15% para aqueles que ganham acima de dez até vinte salários mínimos;
10% para os demais funcionários.*/