import java.util.Scanner;

public class Lista11_exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contas[] = {9901,9902,9903,9904,9905,9906,9907,9908,9909,9910};
        float saldos[] = {0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,};

        int posicao = 0;
        int contaSelecionada = 0;
        float ativoBancario = 0;
        int flag = 0;
        boolean termino = false;
        float valorSaque = 0;
        while (termino == false) {
            System.out.print("Menu:\n1. Efetuar depósito\n2. Efetuar saque\n3. Consultar o ativo bancário\n4. Finalizar o programa\n\nOpção: ");
            int opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    contaSelecionada = Integer.parseInt(leitor.nextLine());
                    for (int i = 0; i < contas.length; i++) {
                        if (contaSelecionada == contas[i]) {
                            posicao = i;
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("Conta não encontrada!\n\n");
                        break;
                    }
                    System.out.print("Digite o valor do depósito: ");
                    saldos[posicao] += Float.parseFloat(leitor.nextLine());
                    System.out.printf("Novo saldo R$ %.2f\n\n", saldos[posicao]);
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    contaSelecionada = Integer.parseInt(leitor.nextLine());
                    for (int i = 0; i < contas.length; i++) {
                        if (contaSelecionada == contas[i]) {
                            posicao = i;
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("Conta não encontrada!\n\n");
                        break;
                    }
                    System.out.print("Digite o valor do saque: ");
                    valorSaque = Float.parseFloat(leitor.nextLine());
                    if (valorSaque <= saldos[posicao]) {
                        saldos[posicao] -= valorSaque;
                        System.out.printf("Novo saldo R$ %.2f\n\n", saldos[posicao]);
                    } else {
                        System.out.println("Saldo insuficiente!\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < contas.length; i++) {
                        ativoBancario += saldos[i];
                    }
                    System.out.printf("O saldo do ativo bancário é de R$ %.2f\n\n", ativoBancario);
                    ativoBancario = 0;
                    break;
                case 4:
                    System.out.printf("FIM!");
                    termino = true;
                    break;
            }
        }
        leitor.close();
    }
}
/*84)Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e os 
seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais que 
uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais. O saldo deverá ser 
cadastrado na mesma posição do código. Por exemplo, se a conta 504 for armazenada na quinta posição do vetor de 
saldos. Depois de fazer a leitura dos valores, mostrar o seguinte menu na tela:
i.    Efetuar depósito
ii.    Efetuar saque
iii.    Consultar o ativo bancário (ou seja, o somatório dos saldos de todos os clientes)
iv.    Finalizar o programa
Para efetuar depósito deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver
cadastrada, mostrar a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, atualizar o seu saldo.
Para efetuar saque deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada,
mostrar a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente
para cobrir o saque. (Estamos supondo que a conta não pode ficar com o saldo negativo). Se o saldo for suficiente, 
realizar o saque e voltar ao menu. Caso contrário mostrar a mensagem Saldo insuficiente e voltar ao menu.
Para consultar o ativo bancário deve-se somar o saldo de todas as contas do banco. Depois de mostrar esse valor, 
voltar ao menu.
O programa só termina quando for digitada a opção 4 – Finalizar o programa. */