import java.util.Scanner;

public class Lista6_exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o kilômetro de partida:");
        int kmPartida = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o kilômetro de chegada:");
        int kmChegada = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de gasolina gasta:");
        int qtdeGas = Integer.parseInt(leitor.nextLine());

        float autonomia = qtdeGas / (kmChegada - kmPartida);

        if (autonomia < 10f) {
            System.out.print("Consumo ótimo");
        } else if (autonomia <= 16f) {
            System.out.print("Consumo normal");
        } else {
            System.out.print("Consumo anormal");
        }
        leitor.close();
    }
}
/*46)Construa um algoritmo que calcule o consumo de combustível de um veículo qualquer baseado nas informações de 
quilometragem  inicial e final de um percurso, e a quantidade de gasolina consumida em litros. Caso o consumo 
esteja entre 10 e 16 litros/km mostre a mensagem “consumo normal”, caso seja maior que 16 litros/km apresente a 
mensagem “consumo anormal”.*/