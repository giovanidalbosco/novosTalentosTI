package introducao.exercicio6;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Pessoa {
    private String nome;
    private HashMap<String, Mes> faturaMensal = new HashMap<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, Mes> getFaturaMensal() {
        return faturaMensal;
    }
    public void setFaturaMensal(HashMap<String, Mes> faturaMensal) {
        this.faturaMensal = faturaMensal;
    }

    public String extratoFatura(String teste) {
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder lista = new StringBuilder();
        for(int i = 0; i < getFaturaMensal().get(teste.toLowerCase()).getListaCompras().size(); i++) {
            lista.append(getFaturaMensal().get(teste.toLowerCase()).getListaCompras().get(i).getCategoria() + ": R$");
            lista.append(df.format(getFaturaMensal().get(teste.toLowerCase()).getListaCompras().get(i).getValor()) + "\n");
        }
        return lista.toString();
    }
    
}
