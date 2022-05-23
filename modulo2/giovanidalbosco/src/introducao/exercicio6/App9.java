package introducao.exercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App9 {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        PlanilhaDeGastos mes1 = new PlanilhaDeGastos();
        mes1.setMes("Janeiro");

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

        GastosDiarios dia1 = new GastosDiarios();
        dia1.getCompras().add(gasto1);
        dia1.getCompras().add(gasto2);

        mes1.getDias().add(dia1);
    
        System.out.println(mes1.gastoMensal());
        
    }
}
