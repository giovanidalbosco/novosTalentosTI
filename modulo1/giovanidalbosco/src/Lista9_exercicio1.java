import java.util.Scanner;
import java.util.Vector;

public class Lista9_exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: ");
        float salMin = Float.parseFloat(leitor.nextLine());
        float kwCusto = salMin / 8f;
        
        int tipoCons = 0;
        
        Vector<Float> kwGasto = new Vector<Float>();
        Vector<Float> custoTotal = new Vector<Float>();
        
        int cont = 0;
        int cont1 = 0;
        for (;;) {
            System.out.println("Quantidade de kW gasto do consumidor:");
            kwGasto.add(Float.parseFloat(leitor.nextLine()));
            if (kwGasto.get(cont) == 0) {
                leitor.close();
                break;
            }
            do {
                System.out.println("Qual o tipo do consumidor:\n1 - Residencial\n2 - Comercial\n3 - Industrial");
                tipoCons = Integer.parseInt(leitor.nextLine());
                if (tipoCons <= 0 || tipoCons >= 4) {
                    System.out.print("Tipo do consumidor não é válido! ");
                }
            } while (tipoCons <= 0 || tipoCons >= 4);

            switch (tipoCons) {
                case 1:
                    custoTotal.add(kwGasto.get(cont) * kwCusto * 1.05f);
                break;
                case 2:
                    custoTotal.add(kwGasto.get(cont) * kwCusto * 1.10f);
                break;
                case 3:
                    custoTotal.add(kwGasto.get(cont) * kwCusto * 1.15f);
                break;
            }
            if (custoTotal.get(cont) >= 500f && custoTotal.get(cont) <= 1000) {
                cont1++;
            }
            cont++;
        }
        float faturamento = 0;
        for (int i = 0; i < cont; i++) {
            System.out.printf("O consumidor %d consumiu %.1f kW com custo total de R$ %.2f\n", i+1, kwGasto.get(i), custoTotal.get(i));
            faturamento += custoTotal.get(i);
        }
        System.out.printf("O faturamento da Companhia de Energia com estes %d consumidores foi de R$ %.2f\n", cont, faturamento);
        System.out.printf("O número de consumidores que pagam um valor entre R$ 500,00 e R$ 1000,00 é de %d", cont1);
    }
}
/*74)Faça um programa que receba o valor do salário mínimo e uma lista contendo a quantidade de quilowatts gasta por 
consumidor e o tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial).
Calcule e mostre:
- O valor de cada quilowatt, sabendo que o quilowatt custa 1/8 do salário mínimo;
- O valor a ser pago por cada consumidor (conta final mais acréscimos), considerando que o acréscimo é o mesmo da 
tabela a seguir:
 
------------+-----------------------------------
Tipo           | % de acréscimo sobre o valor gasto
------------+-----------------------------------
1                |               5
2                |              10
3                |              15
------------+-----------------------------------
- O faturamento geral da empresa
- a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1000,00
Termine a entrada de dados quando a quantidade de quilowatts digitada for igual a zero.*/