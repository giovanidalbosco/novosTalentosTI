/* 5) Um trabalhador recebeu seu salário e depositou em sua conta
corrente bancária. Esse trabalhador emitiu dois cheques e agora
deseja saber seu saldo atual. Sabe-se que cada operação bancária
de retirada paga CPMF de 0,38% e o saldo inicial da conta esta
zerado. */

import java.util.Scanner;

public class Lista3_exercicio5 {
    public static void main(String[] args) {
        float valorCC = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor depositado na Conta Corrente:");
        valorCC = leitor.nextFloat();
        float saldo = valorCC;
        System.out.printf("Saldo da conta é R$ %.2f\n", saldo);

        System.out.println("Digite o valor do primeiro cheque emitido:");
        float chequeUm = leitor.nextFloat();
        saldo = saldo - chequeUm - chequeUm * 0.38f / 100f;
        System.out.printf("Saldo da conta é R$ %.2f\n", saldo);
        
        System.out.println("Digite o valor do segundo cheque emitido:");
        float chequeDois = leitor.nextFloat();
        saldo = saldo - chequeDois - chequeDois * 0.38f / 100f;
        System.out.printf("Saldo da conta é R$ %.2f\n", saldo);
        
        leitor.close();
    }
}