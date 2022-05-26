package introducao.exercicio6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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
    
    public float gastoDiarioTotal() {
        float gastoTotal = 0;
        for(int i = 0; i < getCompras().size(); i++) {
            gastoTotal += getCompras().get(i).getValor();
        }
        return gastoTotal;
    }

    
    public HashMap<String,Float> gastoDiarioTotalPorCategoria() {
        //ArrayList<String> chaves = new ArrayList<>();
        HashMap<String,Float> lista = new HashMap<>();
        for(int i = 0; i < getCompras().size(); i++) {
            for(int j = 0; j< getCompras().size(); j++) {
                if(getCompras().get(i).getCategoria().equals(getCompras().get(j).getCategoria())) {
                    lista.put(getCompras().get(i).getCategoria(),0f);
                }
            }
        }
        for(int i = 0; i < getCompras().size(); i++) {
            for(int j = 0; j < lista.size(); j++) {
                if(lista.containsKey(getCompras().get(i).getCategoria())) {
                    lista.put(getCompras().get(i).getCategoria(), lista.get(getCompras().get(i).getCategoria()) + getCompras().get(i).getValor());
                }
            }   
        }
        
        var chaves = lista.keySet();
        System.out.println(chaves.toArray().toString());

        // https://www.w3schools.blog/get-list-of-keys-from-hashmap-java

        return lista;        
    }
    

}
