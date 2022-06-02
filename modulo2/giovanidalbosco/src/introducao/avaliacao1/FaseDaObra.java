package introducao.prova;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private Engenheiro encarregado;
    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Engenheiro getEncarregado() {
        return encarregado;
    }
    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }
    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    public float calcularValorDaFaseDaObra() {
        int quantidade = 0;
        float preco = 0f;
        float total = 0f;
        for(ItemDeConstrucao itens: getListaItens()) {
            preco = itens.getProduto().getPreco();
            quantidade = itens.getQuantidade();
            total += preco * quantidade;
        }

        total += getEncarregado().getSalario();
        for(Construtor construtores: getListaConstrutores()) {
            total += construtores.getSalario();
        }

        return total;
    }
    
}
