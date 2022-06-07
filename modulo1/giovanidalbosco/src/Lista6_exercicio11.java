/* Escreva um algoritmo em FLUXOGRAMA para calcular o valor da
bolsa de estudos paga pela empresa a seus funcionários, utilize a
tabela abaixo. De acordo com o Tipo do curso existe um percentual
pago da bolsa, sendo que o valor calculado do percentual não pode
superar o valor limite por tipo. Insira pelo menos duas restrições
nos dados de entrada.
+-----------+---------------------+-----------------+
|   Tipo    |   Percentual Pago   |  Valor Limite   |
+-----------+---------------------+-----------------+
|  Ingles   |        40%          |    R$ 200,00    |
|  Espanhol |        40%          |    R$ 200,00    |
| Graduação |        55%          |    R$ 300,00    |
+-----------+---------------------+-----------------+ */

import java.util.Scanner;

public class Lista6_exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do curso:");
        float valorCurso = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tipo do curso:");
        String tipoCurso = leitor.nextLine();

        char teste = tipoCurso.charAt(0);

        float valorBolsa = 0;
        switch (teste) {
            case 'i': case 'e':
                valorBolsa = valorCurso * .4f;
                if (valorBolsa > 200){
                    valorBolsa = 200f;
                }
                System.out.printf(teste == 'i'?"O curso de Inglês no custo de %.2f terá uma bolsa de %.2f":"O curso de Espanhol no custo de %.2f terá uma bolsa de %.2f", valorCurso, valorBolsa);
                break;
            case 'g':
                valorBolsa = valorCurso * .55f;
                if (valorBolsa > 300){
                    valorBolsa = 300f;
                }
                System.out.printf("O curso de Graduação no custo de %.2f terá uma bolsa de %.2f", valorCurso, valorBolsa);
                break;
            default:
                System.out.println("Curso inválido");
        }
        leitor.close();
    }
}
