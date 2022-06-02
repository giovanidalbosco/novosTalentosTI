package introducao.exercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;


// falta finalizar o metódo de gastos diários

public class App9 {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        PlanilhaDeGastos mes1 = new PlanilhaDeGastos();
        mes1.setMes("Janeiro");

        // dados de teste
        Gasto gasto1 = new Gasto();
        gasto1.setCategoria("Remedio");
        try {
            gasto1.setData(data.parse("09/05/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        gasto1.setFormaPagamento("Dinheiro");
        gasto1.setValor(150f);

        Gasto gasto2 = new Gasto();
        gasto2.setCategoria("Roupa");
        try {
            gasto2.setData(data.parse("08/05/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        gasto2.setFormaPagamento("Cartão");
        gasto2.setValor(200f);

        Gasto gasto3 = new Gasto();
        gasto3.setCategoria("Remedio");
        try {
            gasto3.setData(data.parse("10/05/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        gasto3.setFormaPagamento("Dinheiro");
        gasto3.setValor(125f);
        // dados de teste


        GastosDiarios dia1 = new GastosDiarios();
        dia1.getCompras().add(gasto1);
        dia1.getCompras().add(gasto2);
        dia1.getCompras().add(gasto3);

        mes1.getDias().add(dia1);
    
        System.out.println("Gasto mes 1: " + mes1.gastoMensal());

        System.out.println("Gasto dia 1: " + dia1.gastoDiarioTotal());

        System.out.println(dia1.gastoDiarioTotalPorCategoria().keySet());

        
    }
}
