import java.util.Scanner;

public class gitEstrutDes_exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite a idade:");
        int idade = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o grupo de risco:");
        String grupo = leitor.nextLine();

        int categoria = 0;
        if(idade >= 17 && idade <= 20) {
            if(grupo.equals("baixa")) {
                categoria = 1;
            } else if(grupo.equals("media")) {
                categoria = 2;
            } else {
                categoria = 3;
            }
        } else if (idade <= 24) {
            if(grupo.equals("baixa")) {
                categoria = 2;
            } else if(grupo.equals("media")) {
                categoria = 3;
            } else {
                categoria = 4;
            }
        } else if(idade <= 34) {
            if(grupo.equals("baixa")) {
                categoria = 3;
            } else if(grupo.equals("media")) {
                categoria = 4;
            } else {
                categoria = 5;
            }
        } else if(idade <= 64) {
            if(grupo.equals("baixa")) {
                categoria = 4;
            } else if(grupo.equals("media")) {
                categoria = 5;
            } else {
                categoria = 6;
            }
        } else if(idade <= 70) {
            if(grupo.equals("baixa")) {
                categoria = 7;
            } else if(grupo.equals("media")) {
                categoria = 8;
            } else {
                categoria = 9;
            }
        } else {
            categoria = 0;
        }

        System.out.printf(categoria == 0?"%s não se enquadra em nenhuma categoria":"%s está classificado(a) na categoria %d", nome, categoria);
        leitor.close();
    }
}
/*
Uma Companhia de Seguros possui nove categorias de seguro baseadas na idade e ocupação do segurado. Somente pessoas
com pelo menos 17 anos e não mais de 70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações, 
foram definidos três grupos de risco. A tabela abaixo fornece as categorias em função da faixa etária e do grupo 
de risco. Dados nome, idade e grupo de risco, determinar a categoria do pretendente à aquisição de tal seguro. 
Imprimir o nome a idade e a categoria do pretendente, e, caso a idade não esteja na faixa necessária, imprimir uma 
mensagem.

Idades	    Grupos de risco
            Baixa   Média   Alta
17 a 20	      1       2	      3
21 a 24	      2	      3	      4
25 a 34	      3	      4	      5
35 a 64	      4	      5	      6
65 a 70	      7       8	      9
*/