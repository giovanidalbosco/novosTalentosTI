import java.util.Scanner;

public class gitEstrutDes_exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int A = leitor.nextInt();
        System.out.println("Digite o valor de B:");
        int B = leitor.nextInt();
        System.out.println("Digite o valor de C:");
        int C = leitor.nextInt();
        
        double delta = Math.pow(B, 2) - 4 * A * C;

        if(A == 0) {
            System.out.println("Valor de A é 0. A equação não é do segundo grau. Programa será encerrado");
        } else if(delta < 0) {
            System.out.println("Valor de delta é menor que 0. A equação não possuí raizes reais. Programa será encerrado");
        } else if(delta == 0) {
            double raiz = -B / 2 * A;
            System.out.printf("Valor de delta é 0. A equação possuí somente uma raiz real. Esta raiz é %.0f", raiz);
        } else {
            double raiz1 = -B + Math.sqrt(delta) / 2 * A;
            double raiz2 = -B - Math.sqrt(delta) / 2 * A;
            System.out.printf("Valor de delta é positivo. A equação possuí duas raizes reais. As raizes são %.0f e %.0f", raiz1, raiz2);
        }
        leitor.close();
    }
}
