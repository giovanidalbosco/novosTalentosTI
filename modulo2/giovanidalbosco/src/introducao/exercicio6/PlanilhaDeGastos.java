package introducao.exercicio6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class PlanilhaDeGastos {
    private String mes;
    private ArrayList<GastosDiarios> dias = new ArrayList<>();
    
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    public ArrayList<GastosDiarios> getDias() {
        return dias;
    }
    public void setDias(ArrayList<GastosDiarios> dias) {
        this.dias = dias;
    }

    public float gastoMensal() {
        float gastoTotal = 0;
        for(int i = 0; i < getDias().size(); i++) {
            gastoTotal += getDias().get(i).gastoDiarioTotal();
        }
        return gastoTotal;
    }

    /*
    public String gastoMensalPorCategoria(String teste) {
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder lista = new StringBuilder();
        for(int i = 0; i < getDias().size(); i++) {
            for(int y = 0; getDias().get(i).getCompras().size()) {
                lista.append(getFaturaMensal().get(teste.toLowerCase()).getListaCompras().get(i).getCategoria() + ": R$");
                lista.append(df.format(getFaturaMensal().get(teste.toLowerCase()).getListaCompras().get(i).getValor()) + "\n");
            }
        }
        return lista.toString();
    }
    */

}
