import java.util.Scanner;

public class Lista2_exercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite as horas:");
        int horas = leitor.nextInt();
        System.out.print("Digite os minutos:");
        int mins = leitor.nextInt();

        int horasMins = horas * 60;
        int minsTotal = horasMins + mins;
        int secsTotal = minsTotal * 60;
        
        System.out.printf("A quantidade de minutos dentro das horas digitadas é de %d minutos\n", horasMins);
        System.out.printf("A soma da quantidade de minutos dentro das horas digitadas e os minutos digitados é de %d minutos\n", minsTotal);
        System.out.printf("A quantidade de segundos dentro da soma dos minutos é de %d segundos", secsTotal);

        leitor.close();
    }
}