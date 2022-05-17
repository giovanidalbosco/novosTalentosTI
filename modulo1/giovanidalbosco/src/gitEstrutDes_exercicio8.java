import java.util.Scanner;

public class gitEstrutDes_exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Horas trabalhadas no mês:");
        float horasMes = leitor.nextFloat();
        System.out.println("Valor da remuneração por hora trabalhada:");
        float salarioHora = leitor.nextFloat();

        float pagamento = 0;

        if(horasMes >= 160) {
            pagamento = (horasMes * 1.5f - 80) * salarioHora;
            System.out.println(pagamento);
            System.out.println(String.format("O pagamento do funcionário será de R$ %.2f", pagamento));
        } else {
            pagamento = horasMes * salarioHora;
            System.out.println(String.format("O pagamento do funcionário será de R$ %.2f", pagamento));
        }
        leitor.close();
    }
}
