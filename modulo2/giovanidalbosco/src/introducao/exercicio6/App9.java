package introducao.exercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App9 {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Giovani");

        TipoGasto gasto1 = new TipoGasto();
        gasto1.setCategoria("Remedio");
        try {
            gasto1.setData(data.parse("09/05/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        gasto1.setFormaPagamento("Dinheiro");
        gasto1.setValor(150f);

        TipoGasto gasto2 = new TipoGasto();
        gasto2.setCategoria("Roupa");
        try {
            gasto2.setData(data.parse("08/05/2022"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        gasto2.setFormaPagamento("Cartão");
        gasto2.setValor(200f);

        Mes mes1 = new Mes("Janeiro");
        mes1.getListaCompras().add(gasto1);
        mes1.getListaCompras().add(gasto2);

        pessoa1.getFaturaMensal().put(mes1.getNome(), mes1);

        System.out.println(pessoa1.extratoFatura("janeiro"));
        
    }
}
