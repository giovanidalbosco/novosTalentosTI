package introducao.exercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente; //está certo esta declaração? relação * --> 1
    private ArrayList<ItemPedido> listaItens = new ArrayList<>(); //está certo esta declaração? relação 1 --> *
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public float calcValorTotal() {
        float soma = 0;

        for(int i = 0; i < getListaItens().size(); i++) {
            //soma += getListaItens().get(i).getValorVenda(); --> precisa da multiplicação habilitada no método da Classe ItemPedido
            //ou soma += getListaItens().get(i).getQuantidade() * getListaItens().get(i).getProduto().getValor();
            soma += getListaItens().get(i).getQuantidade() * getListaItens().get(i).getValorVenda();
        }

        return soma;
        /*
        for (String somaItens:getListaItens()) {
            soma += Float.parseFloat(somaItens);
        } //está certo isso? preciso fazer esta soma funcionar*/
    }

    public Comprador getCliente() {
        return cliente;
    }
    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

}
