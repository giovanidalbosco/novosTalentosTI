package introducao.exercicio6;

import java.util.ArrayList;


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

    //public String gastoMensalPorCategoria() {
        
    //}
    

}
