package introducao.exercicio6b;

import java.util.ArrayList;

public class Mes {
    private String nome;
    private ArrayList<TipoGasto> listaCompras = new ArrayList<>();

    public Mes(String nome){
        setNome(nome.toLowerCase());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    public ArrayList<TipoGasto> getListaCompras() {
        return listaCompras;
    }
    public void setListaCompras(ArrayList<TipoGasto> listaCompras) {
        this.listaCompras = listaCompras;
    }

}