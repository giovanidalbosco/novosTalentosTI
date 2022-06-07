/*37)Faça um programa que receba o código correspondente ao cargo
de um funcionário e seu salário atual e mostre o cargo, o valor
do aumento e seu novo salário. Os cargos estão na seguinte tabela:

Código         Cargo            Percentual
1              Escriturário         50%
2              Secretário           35%
3              Caixa                20%
4              Gerente              10%
5              Diretor          Não tem aumento */

import java.util.Scanner;

public class Lista5_exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código correspondente ao cargo:\n1 - Escriturário\n2 - Secretário\n3 - Caixa\n4 - Gerente\n5 - Diretor");
        int codCargo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o salário:");
        float salario = Float.parseFloat(leitor.nextLine());

        int aumento = 0;
        String cargo = "";
        if(codCargo == 1) {
            cargo = "Escriturário";
            aumento = 50;
        } else if(codCargo == 2) {
            cargo = "Secretário";
            aumento = 35;
        } else if(codCargo == 3) {
            cargo = "Caixa";
            aumento = 20;
        } else if(codCargo == 4) {
            cargo = "Gerente";
            aumento = 10;
        } else if(codCargo == 5) {
            cargo = "Diretor";
            aumento = 0;
        } else {
            codCargo = 0;
        }
        
        salario += salario * (aumento / 100f);
        System.out.printf(codCargo == 0?"Você não digitou um código válido":"O cargo é %s e o novo salário é de R$ %.2f", cargo, salario);
        leitor.close();
    }
}
