/*75) Faça um programa que receba a idade de 15 pessoas e que
calcule e mostre:
- A quantidade de pessoas em cada faixa etária
- A percentagem de pessoas em cada uma das faixas etárias, com
relação ao total de pessoas, de acordo com a tabela abaixo:
--------------+---------------------
Faixa Etária  | Idade
--------------+---------------------
1             | Até 15 anos
2             | De 16 a 30 anos
3             | De 31 a 45 anos
4             | De 46 a 60 anos
5             | Acima de 61 anos
--------------+--------------------- */

import java.util.Scanner;

public class Lista9_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int numPess = Integer.parseInt(leitor.nextLine());
        
        int cont[] = new int[5];
        int idade = 0;
        for(int i = 0; i < numPess; i++) {
            do {
                System.out.printf("Digite a idade da %dª pessoa: \n", i+1);
                idade = Integer.parseInt(leitor.nextLine());
                if (idade < 0) {
                    System.out.print("Não existe idade negativa!!!");
                } else if (idade <= 15) {
                    cont[0]++;
                } else if (idade <= 30) {
                    cont[1]++;
                } else if (idade <= 45) {
                    cont[2]++;
                } else if (idade <= 60) {
                    cont[3]++;
                } else {
                    cont[4]++;
                }
            } while (idade <= 0);
        }

        int total = cont[0] + cont[1] + cont[2] + cont[3] + cont[4];
        float perc[] = new float[5];
        for(int i = 0; i < 5; i++) {
            perc[i] = (float)cont[i] / (float)total * 100f;
        }
        System.out.printf("Até 15 anos: %.1f%%\nDe 16 a 30 anos: %.1f%%\nDe 31 a 45 anos: %.1f%%\nDe 46 a 60 anos: %.1f%%\nAcima de 61 anos: %.1f%%", perc[0], perc[1], perc[2], perc[3], perc[4]);
        leitor.close();
    }
}
