import java.util.Scanner;

public class gitEstrutDes_exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos litros:");
        int litros = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o tipo do combustível:");
        
        
        char tipo = leitor.nextLine().charAt(0);
        
        //char tipo = Character.parseChar(leitor.nextLine());
        
        
        float pagamento = 0;
        if(tipo == 'g') {
            if(litros > 20) {
                pagamento = litros * 3.3f * 0.94f;
            } else {
                pagamento = litros * 3.3f * 0.96f;
            }
        } else if(tipo == 'a') {
            if(litros > 20) {
                pagamento = litros * 3.3f * 0.95f;
            } else {
                pagamento = litros * 3.3f * 0.97f;
            }
        }

        System.out.printf("O combustível escolhido foi %s. Foi comprado %d litros e pago um total de R$ %.2f", tipo, litros, pagamento);

        leitor.close();
    }
}
/*Álcool	até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina	até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro
Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o cliente comprar mais de 8 Kg em frutas ou 
o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um 
algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor 
a ser pago pelo cliente.*/