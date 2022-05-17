package introducao.exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App8 {
    public static void main(String[] args) {
        Residencia residencia1 = new Residencia("Rua Muito Longe");

        Mes mes1 = new Mes("janeiro");
        Mes mes2 = new Mes("fevereiro");
        Mes mes3 = new Mes("março");

        ContaLuz contaLuz1 = new ContaLuz();
        
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            contaLuz1.setDataLeitura(data.parse("20/12/2021"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz1.setNumeroLeitura(1);
        contaLuz1.setKwGastoMensal(150f);
        try {
            contaLuz1.setDataPagamento(data.parse("10/01/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz1.setMes(mes1);

        ContaLuz contaLuz2 = new ContaLuz();
        try {
            contaLuz2.setDataLeitura(data.parse("20/01/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz2.setNumeroLeitura(2);
        contaLuz2.setKwGastoMensal(130f);
        try {
            contaLuz2.setDataPagamento(data.parse("10/02/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz2.setMes(mes2);

        ContaLuz contaLuz3 = new ContaLuz();
        try {
            contaLuz3.setDataLeitura(data.parse("20/02/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz3.setNumeroLeitura(3);
        contaLuz3.setKwGastoMensal(140f);
        try {
            contaLuz3.setDataPagamento(data.parse("10/03/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        contaLuz3.setMes(mes3);

        residencia1.getFatura().add(contaLuz1);
        residencia1.getFatura().add(contaLuz2);
        residencia1.getFatura().add(contaLuz3);

        System.out.println(String.format("Data da leitura do mes de %s: %s", contaLuz1.getMes().getNome(), data.format(contaLuz1.getDataLeitura())));
        System.out.println(String.format("Data do pagamento: %s", data.format(contaLuz1.getDataPagamento())));
        System.out.println(String.format("Mês de menor consumo: %s", residencia1.mesMenorConsumo()));
        System.out.println(String.format("Mês de maior consumo: %s", residencia1.mesMaiorConsumo()));
        System.out.println(String.format("Consumo médio da residência é %.2f kW mensais", residencia1.consumoMedio()));
    }
}