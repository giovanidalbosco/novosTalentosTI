import java.util.Scanner;

public class Lista1_exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar o número de horas trabalhadas por dia: ");
        int horas = leitor.nextInt();
        System.out.println("Informar o número de dias trabalhados em um mês: ");
        int dias = leitor.nextInt();

        int horasTotais = horas * dias;

        System.out.println("Horas totais trabalhadas no mês: " + horasTotais);

        leitor.close();
    }
}
