import java.util.Scanner;

public class gitEstrutDes_exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um ano:");
        int ano = leitor.nextInt();
        
        boolean teste1 = ano % 4 == 0;
        boolean teste2 = ano % 100 == 0;
        boolean teste3 = ano % 400 == 0;

        if(teste1 == true) {
            if(teste2 == false) {
                System.out.printf("O ano %d foi bissexto", ano);
            } else {
                if(teste3 == true) {
                    System.out.printf("O ano %d foi bissexto", ano);
                } else {
                    System.out.printf("O ano %d não foi bissexto", ano);
                }
            }
        } else {
            System.out.printf("O ano %d não foi bissexto", ano);
        }
        leitor.close();
    }
}
