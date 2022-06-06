package introducao.exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProduto = new ArrayList<>();

    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public float calcSomaProdutos() {
        float total = 0f;
        for(Produto produtos:getListaProduto()) {
            total += produtos.getValor();
        }

        return total;
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();

        Produto prod1 = new Produto();
        prod1.setNome("banana");
        prod1.setValor(3.5f);

        Produto prod2 = new Produto();
        prod2.setNome("laranja");
        prod2.setValor(2.2f);
        
        Produto prod3 = new Produto();
        prod3.setNome("maça");
        prod3.setValor(7.2f);

        Produto prod4 = new Produto();
        prod4.setNome("pêra");
        prod4.setValor(25f);

        pedido1.getListaProduto().add(prod1);
        pedido1.getListaProduto().add(prod2);
        pedido1.getListaProduto().add(prod3);
        pedido1.getListaProduto().add(prod4);

        float total = pedido1.calcSomaProdutos();
        System.out.print(total);
    }
}