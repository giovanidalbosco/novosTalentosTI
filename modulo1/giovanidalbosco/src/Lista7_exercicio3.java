import java.util.Scanner;

public class Lista7_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nome = leitor.nextLine();
        System.out.println("Digite o valor do salário base:");
        float salBase = Float.parseFloat(leitor.nextLine());
        System.out.printf("Digite o tempo de serviço de %s:\n", nome);
        int tempoServ = Integer.parseInt(leitor.nextLine());

        float imposto = 0;
        if (salBase <= 200) {
            imposto = 0;
        } else if (salBase <= 450) {
            imposto = salBase * 0.03f;
        } else if (salBase < 700) {
            imposto = salBase * 0.08f;
        } else if (salBase == 700) {
            imposto = salBase * 0.1f; 
        } else {
            imposto = salBase * 0.12f;
        }

        float bonus = 0;
        if (salBase <= 500) {
            if (tempoServ <= 3) {
                bonus = salBase * 0.05f + 23f;
            } else if (tempoServ < 6) {
                bonus = salBase * 0.06f + 35f;
            } else {
                bonus = salBase * 0.10f + 33f;
            }
        } else {
            if (tempoServ <= 3) {
                bonus = salBase * 0.02f + 50f;
            } else {
                bonus = salBase * 0.03f + 60f;
            }
        }

        float auxAlim = 0;
        if (tempoServ <= 10) {
            auxAlim = salBase * 0.04f;
        } else {
            auxAlim = salBase * 0.06f;
        }

        float salLiq = salBase - imposto + bonus + auxAlim;

        System.out.println(String.format("O salário liquido é de R$ %.2f", salLiq));

        leitor.close();
    }
}
/*53)Faça um UNICO programa em que receba o nome, o salário-base e o tempo de serviço de um funcionário. 
 
Calcule e mostre TODOS os item abaixo em um UNICO PROGRAMA:
a. O imposto que esta na tabela a seguir:

Salário Base                                         |   % de imposto sobre Salário Base
-----------------------------------------------------+----------------------------------------
Menor R$200,00 (inclusive)                           |             Isento
Maior que R$200,00 até R$ 450,00 (inclusive)         |               3%
Entre R$450,00 e R$ 700,00                           |               8%
Igual a R$ 700,00                                    |              10%
Maior que R$ 700,00                                  |              12%

b. A Gratificação conforme a tabela a seguir:
Salário Base                    |Tempo de Serviço                   |Gratificação
--------------------------------+-----------------------------------+-----------------------------------------
Superior a R$500,00             |Até 3 anos (inclusive)             |2% do salário base mais R$ R$ 50,00 reais
                                +-----------------------------------+-----------------------------------------
                                |Mais de 3 anos                     |3% do salário base mais R$ 60,00 reais
--------------------------------+-----------------------------------+-----------------------------------------
Até R$ 500,00 (inclusive)       |Até 3 anos (inclusive)             |5% do salário base mais R$ 23 reais
                                +-----------------------------------+-----------------------------------------
                                |Entre 3 e 6 anos                   |6% do salário base mais R$ 35,00 reais
                                +-----------------------------------+-----------------------------------------
                                |De 6 anos para cima (inclusive)    |10% do salário base mais R$ 33 reais

c. Calcule o valor do auxilio alimentação:
Tempo de Serviço             |Valor do auxilio alimentação
-----------------------------+----------------------------
Até 10 anos (inclusive)      |4% salário Base
-----------------------------+----------------------------
Mais de 10 anos              |6% salário Base

d. Calcule o salário líquido, subtraindo o imposto e somando a gratificação, o auxilio alimentação ao salário base. */