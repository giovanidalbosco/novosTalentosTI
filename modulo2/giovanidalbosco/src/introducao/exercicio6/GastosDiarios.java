package introducao.exercicio6;

import java.util.ArrayList;
import java.util.Date;

public class GastosDiarios {
    private Date dia;
    private ArrayList<Gasto> compras = new ArrayList<>();

    public Date getDia() {
        return dia;
    }
    public void setDia(Date dia) {
        this.dia = dia;
    }

    public ArrayList<Gasto> getCompras() {
        return compras;
    }
    public void setCompras(ArrayList<Gasto> compras) {
        this.compras = compras;
    }
    
}
